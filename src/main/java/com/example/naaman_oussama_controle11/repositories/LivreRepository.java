package com.example.naaman_oussama_controle11.repositories;

import com.example.naaman_oussama_controle11.entities.livre;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<livre, Long> {
}
