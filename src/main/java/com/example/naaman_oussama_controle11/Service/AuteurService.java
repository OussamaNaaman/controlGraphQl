package com.example.naaman_oussama_controle11.Service;

import com.example.naaman_oussama_controle11.entities.auteur;
import com.example.naaman_oussama_controle11.repositories.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public List<auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public auteur getAuteurById(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    public auteur createAuteur(auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public auteur updateAuteur(auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }
}
