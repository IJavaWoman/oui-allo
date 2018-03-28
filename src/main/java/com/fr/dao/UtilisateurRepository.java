package com.fr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
