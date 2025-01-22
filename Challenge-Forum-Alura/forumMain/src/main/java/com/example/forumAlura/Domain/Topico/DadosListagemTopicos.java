package com.example.forumAlura.Domain.Topico;

import com.example.forumAlura.Domain.Curso.CursoTipo;

import java.time.LocalDateTime;

public record DadosListagemTopicos(String titulo, String mensagem, CursoTipo curso, Long autor, LocalDateTime dataCriacao) {

    public DadosListagemTopicos(Topico topico){
        this(topico.getTitulo(), topico.getMensagem(),topico.getCurso(), topico.getAutor(), topico.getDataCriacao());
    }
}
