package com.example.projetoaula20032025.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Anotação usada para definir a resposta HTTP que deve ser retornada quando essa exceção for lançada.
// Neste caso, indica que a resposta HTTP será 404 NOT FOUND, sugerindo que o recurso solicitado não foi encontrado.
@ResponseStatus(value = HttpStatus.NOT_FOUND)

// Definição da classe ResourceNotFoundException que estende RuntimeException, permitindo que essa exceção seja
// lançada durante a execução do programa sem a necessidade de tratá-la obrigatoriamente com try-catch.
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
