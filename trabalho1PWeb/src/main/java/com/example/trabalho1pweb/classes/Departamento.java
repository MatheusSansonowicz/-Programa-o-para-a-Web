package com.example.trabalho1pweb.classes;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Departamento {
    @Id
    private int Dnumero;
    private String Dnome;

    @OneToMany(mappedBy = "departamento")
    private List<Localizacao> Localizacoes;

    @OneToMany(mappedBy = "departamento")
    private List<Projeto> projetos;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionarios;

    @OneToOne
    @JoinColumn(name = "gerente_cpf")
    private Funcionario gerente;
}
