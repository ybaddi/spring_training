package com.example.example_17.controllers;

import com.example.example_17.dao.PersonneRepository;
import com.example.example_17.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;

    @GetMapping("addPersonne")
    public String addPersonne() {
        return "addPersonne";
    }
    @PostMapping("addPersonne")
    public String addPersonne(@RequestParam String nom,
                              @RequestParam String prenom,
                              Model model) {
        Personne p = new Personne(nom,prenom);
        personneRepository.save(p);
        model.addAttribute("personne", p);
        return "confirm";
    }

    @GetMapping("showPersonnes")
    public String showPersonnes(Model model) {
        model.addAttribute("personnes", personneRepository.findAll());
        return "showPersonnes";
    }
}
