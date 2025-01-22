package com.example.forumAlura.Domain.Topico;

import com.example.forumAlura.Domain.Curso.CursoTipo;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico (
    Long id,
    String titulo,
    String mensagem,
    LocalDateTime dataCriacao,
    Long autor,
    CursoTipo curso
){
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getAutor(), topico.getCurso());
    }
}
