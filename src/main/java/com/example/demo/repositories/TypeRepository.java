package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Type;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    // Outras consultas específicas, se necessário
}
