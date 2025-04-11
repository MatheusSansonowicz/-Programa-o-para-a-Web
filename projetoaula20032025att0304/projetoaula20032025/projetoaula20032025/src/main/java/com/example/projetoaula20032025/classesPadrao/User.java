package com.example.projetoaula20032025.classesPadrao;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Phone> phones;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public User(long id, String username, String email, List<Phone> phones) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phones = phones;
    }

    public User() {
    }

    public User(String username, List<Phone> phones, String email) {
        this.username = username;
        this.phones = phones;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{ username='" + username + '\'' +
                ", email='" + email + '\'' +
                 "'}'";
    }
}

