package com.example.trabalho1pweb.classes;

import jakarta.persistence.*;

@Entity
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "departamento_numero")
    private Departamento departamento;

    @OneToOne (optional = true)
    @JoinColumn (name = "projeto_num")
    private Projeto projeto;
    /*@Override
    public String toString() {
        return "Localizacoes{" +
                "numero='" + numero + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }*/
}
