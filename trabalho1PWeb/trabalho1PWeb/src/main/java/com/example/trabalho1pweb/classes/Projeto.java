package com.example.trabalho1pweb.classes;

import jakarta.persistence.*;

@Entity
public class Projeto {

    @Id
    private int pNumero;
    private String projNome;

    @ManyToOne
    @JoinColumn(name = "departamento_numero")
    private Departamento departamento;

    @OneToOne (mappedBy = "projeto")
    private Localizacao localizacao;
}
