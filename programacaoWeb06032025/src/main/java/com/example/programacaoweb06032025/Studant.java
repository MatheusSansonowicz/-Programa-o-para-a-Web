package com.example.programacaoweb06032025;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Studant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @ManyToMany
    @JoinTable(name = "student_curso",
            joinColumns = @JoinColumn (name ="studant_id"),
            inverseJoinColumns = @JoinColumn (name = "curso_id"))
    private List<Curso> cursos;
}
