package com.example.forumAlura.Domain.Autor;

import jakarta.validation.constraints.NotNull;

public record DadosAlteracaoUsuario(
        @NotNull
        Long id,
        String nome,
        String email){
}
