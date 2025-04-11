package com.example.projetoaula20032025.dto;

import java.util.List;

public record dtoUser(Long id, String username, String email, List<dtoPhone> phones) {

}