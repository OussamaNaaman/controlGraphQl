package com.example.naaman_oussama_controle11.repositories;

import com.example.naaman_oussama_controle11.entities.auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<auteur, Long> {
}
