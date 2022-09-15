package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.dao.PersonneDao;
import com.mycompany.dao.PersonneRepository;
import com.mycompany.model.Personne;

@Controller
public class PersonneController {

	@Autowired
//	private PersonneDao personneDao;
	private PersonneRepository personneRepository;
	
	@GetMapping("addPersonne")
	public String addPersonne(){
		return "addPersonne";
	}
	
	@PostMapping("addPersonne")
	public String addPersonn(@RequestParam String nom,
			@RequestParam String prenom, Model model){
		Personne p = new Personne(nom,prenom);
		System.out.println(personneRepository.save(p));
		model.addAttribute("nom", nom);
		model.addAttribute("prenom",prenom);
		return "confirm";
	}
	
	@GetMapping("getPersonne/{num}")
	public String getPersonn(@PathVariable Long num, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		Personne p = personneRepository.findById(num).get();
		System.out.println(p);
		model.addAttribute("personne",p);
		return "showPersonne";
	}
	
	@GetMapping("getPersonneByName/{nom}")
	public String getPersonn(@PathVariable String nom, Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
		model.addAttribute("personnes",personneRepository.findByNomContaining(nom));
		return "allPersonnes";
	}
	
	@GetMapping("getAllPersonne")
	public String getPersonn(Model model){
//		Personne p = new Personne(nom,prenom);
//		System.out.println(personneDao.save(p));
//		model.addAttribute("nom", nom);
//		System.out.println(p);
		model.addAttribute("personnes",personneRepository.findAll());
		return "allPersonnes";
	}
}
