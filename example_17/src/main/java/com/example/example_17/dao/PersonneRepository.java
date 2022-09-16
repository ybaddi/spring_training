package com.example.example_17.dao;

import com.example.example_17.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
    List<Personne> findByNom(String nom);
}
