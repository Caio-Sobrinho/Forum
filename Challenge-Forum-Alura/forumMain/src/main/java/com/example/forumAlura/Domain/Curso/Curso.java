package com.example.forumAlura.Domain.Curso;

import jakarta.persistence.*;
import lombok.Getter;
@Embeddable
@Getter
public class Curso {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CursoTipo getCategoria() {
        return categoria;
    }

    public void setCategoria(CursoTipo categoria) {
        this.categoria = categoria;
    }

    private String nome;
    @Enumerated(EnumType.STRING)
    private CursoTipo categoria;

    public Curso(){

    }
}
