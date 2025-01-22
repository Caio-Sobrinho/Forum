package com.example.forumAlura.Domain.Curso;

public enum CursoTipo {
    BACKEND (1),
    FRONTEND(2),
    CYBERSECURITY(3),
    UXUIDESIGN(4);

    private final Integer codigo;

    CursoTipo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
