package com.example.projetoaula20032025.dto;

import com.example.projetoaula20032025.classesPadrao.Phone;
import com.example.projetoaula20032025.classesPadrao.User;

public record dtoPhone(Long id, String number, User user) {

    public static dtoPhone fromPhone(Phone phone) {
        return new dtoPhone(phone.getId(), phone.getNumber(), phone.getUsuario());
    }
}

