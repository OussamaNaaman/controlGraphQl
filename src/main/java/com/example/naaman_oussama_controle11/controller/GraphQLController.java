package com.example.naaman_oussama_controle11.controller;

import com.example.naaman_oussama_controle11.Service.AuteurService;
import com.example.naaman_oussama_controle11.Service.LivreService;
import com.example.naaman_oussama_controle11.entities.auteur;
import com.example.naaman_oussama_controle11.entities.livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController  {

    @Autowired
    private AuteurService auteurService;

    @Autowired
    private LivreService livreService;

    public List<auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    public auteur getAuteurById(Long id) {
        return auteurService.getAuteurById(id);
    }

    public List<livre> getAllLivres() {
        return livreService.getAllLivres();
    }

    public livre getLivreById(Long id) {
        return livreService.getLivreById(id);
    }
}
