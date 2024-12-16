package com.example.naaman_oussama_controle11.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auteur_id;
    private String Nom;
}
