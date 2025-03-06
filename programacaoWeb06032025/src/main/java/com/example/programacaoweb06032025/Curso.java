package com.example.programacaoweb06032025;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique=true, length = 3)
    private int codigo;

    @ManyToMany(mappedBy = "curso")
    private List<Studant> studants;
}
