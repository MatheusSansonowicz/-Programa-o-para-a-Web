package com.example.projetoaula20032025.classesPadrao;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User usuario;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public User getUsuario() {
        return usuario;
    }
    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Phone(long id, String number, User usuario) {
        this.id = id;
        this.number = number;
        this.usuario = usuario;
    }

    public Phone(User usuario, String number) {
        this.usuario = usuario;
        this.number = number;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{ number='" + number + '\'' +
                ", usuario=" + usuario.getUsername() +
                '}';
    }
}

