package com.example.programacaoweb06032025;

import jakarta.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;
    private String type;
    private String areaCode;
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
}
