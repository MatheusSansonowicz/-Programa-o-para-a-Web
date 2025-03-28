package com.example.trabalho1pweb.classes;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Funcionario {
    @Id
    protected String CPF;

    protected String nome;
    protected Date dataNascimento;
    protected float salario;
    protected String sexo;
    protected String endereco;

    @ManyToOne
    @JoinColumn(name = "departamento_numero")
    protected Departamento departamento;

    @OneToOne(mappedBy = "gerente", optional = true)
    private Departamento departamento_gerenciado;

}
