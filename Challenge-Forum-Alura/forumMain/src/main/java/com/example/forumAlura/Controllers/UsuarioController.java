package com.example.forumAlura.Controllers;

import com.example.forumAlura.Domain.Autor.*;
import com.example.forumAlura.Infra.security.DadosTokenJWT;
import com.example.forumAlura.Infra.security.TokenService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager manager;

    @PostMapping(value = "/login")
    public ResponseEntity efetuarLogin(@RequestBody @Valid LoginUsuario dados){
        System.out.println("ALOOOOOOO!!!!!!!");
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.nome(), dados.senha());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));

    }

    @PostMapping("/cadastro")
    @Transactional
    public void CadastroUser(@RequestBody @Valid DadosUsuarioCadastro user){
        repository.save(new Usuario(user));
    }
    @SecurityRequirement(name = "bearer-key")
    @GetMapping
    public Page<DadosListagemUsuario> listar(Pageable pageable){
        return repository.findAllByAtivoTrue(pageable).map(DadosListagemUsuario::new);
    }

    @PutMapping
    @Transactional
    @SecurityRequirement(name = "bearer-key")
    public void atualizar(@RequestBody @Valid DadosAlteracaoUsuario user){
        var usuario = repository.getReferenceById(user.id());
        usuario.atualizarDados(user);

    }
    @SecurityRequirement(name = "bearer-key")
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar (@PathVariable Long id){
        var usuario = repository.getReferenceById(id);
        usuario.deletar();
    }

}
