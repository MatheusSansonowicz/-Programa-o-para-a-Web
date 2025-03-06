package com.example.programacaoweb06032025;

import jakarta.persistence.*;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @OneToOne
    @JoinColumn (name = "user_id")
    private User user;
}
