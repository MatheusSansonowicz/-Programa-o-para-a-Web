package com.example.programacaoweb06032025;

import jakarta.persistence.*;

@Entity
public class Employeer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    @Embedded
    private Address address;

}
