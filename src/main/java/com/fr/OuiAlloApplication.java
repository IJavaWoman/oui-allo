package com.fr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fr.dao.UtilisateurRepository;
import com.fr.entities.Adresse;
import com.fr.entities.Utilisateur;

@SpringBootApplication
public class OuiAlloApplication implements CommandLineRunner{
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(OuiAlloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		/*
		Utilisateur utilisateur = new Utilisateur("statut", "sexe", "nom", "prenom", df.parse("12/12/1991"), "email", new Adresse((long)22, "nomRue", "complement", "ville", (long)33), (long)922, true, "photo", "pseudo", "motDePasse", "confirmationMotDePasse");
		utilisateurRepository.save(utilisateur);
		
		utilisateur = new Utilisateur("statut1", "sexe1", "nom1", "prenom1", df.parse("11/11/1991"), "email1", new Adresse((long)22, "nomRue1", "complement1", "ville1", (long)33), (long)922, true, "photo1", "pseudo1", "motDePasse1", "confirmationMotDePasse1");
		utilisateurRepository.save(utilisateur);
		*/
		utilisateurRepository.findAll().forEach(u->{
			System.out.println(u.getPrenom());
		});
		
	}
}
