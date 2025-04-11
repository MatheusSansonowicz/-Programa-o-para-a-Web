package com.example.projetoaula20032025.repository;

import com.example.projetoaula20032025.classesPadrao.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Encontra um usuário pelo nome
    List<User> findByUsername(String username);

    // Encontra um usuário pelo email
    User findByEmail(String email);

    // Encontra usuários por um trecho do nome
    List<User> findByUsernameContaining(String username);

    // Encontra usuários com email específico e ordena pelo nome
    //List<User> findByEmailOrderByAsc(String email);
}
