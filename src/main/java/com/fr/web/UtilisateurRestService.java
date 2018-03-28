package com.fr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.dao.UtilisateurRepository;
import com.fr.entities.Utilisateur;

@RestController
public class UtilisateurRestService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> getUtilisateurs(){
		return utilisateurRepository.findAll();
	}
	
}
