package com.example.forumAlura.Domain.Topico;

import com.example.forumAlura.Domain.Curso.CursoTipo;

public record PostarTopicoDados(String titulo, String mensagem, Long autor, CursoTipo curso) {

}
