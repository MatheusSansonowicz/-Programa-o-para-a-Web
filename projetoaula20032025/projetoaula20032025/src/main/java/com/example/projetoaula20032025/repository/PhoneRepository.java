package com.example.projetoaula20032025.repository;

import com.example.projetoaula20032025.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}