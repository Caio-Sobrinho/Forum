package com.example.forumAlura.Domain.Autor;

public record DadosListagemUsuario(Long id, String nome, String email) {

    public DadosListagemUsuario(Usuario user){
        this(user.getId(), user.getNome(), user.getEmail());
    }
}
