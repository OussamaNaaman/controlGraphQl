package com.example.naaman_oussama_controle11.Service;

import com.example.naaman_oussama_controle11.entities.livre;
import com.example.naaman_oussama_controle11.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public livre getLivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    public livre createLivre(livre livre) {
        return livreRepository.save(livre);
    }

    public livre updateLivre(livre livre) {
        return livreRepository.save(livre);
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }

}
