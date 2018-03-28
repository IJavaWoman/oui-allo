package com.fr.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Utilisateur implements Serializable{
	
	@Id @GeneratedValue
	private Long id ;
	private String statut ;
	private String sexe ;
	private String nom ;
	private String prenom ;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance ;
	private String email ;
	private Adresse adresse ;
	private long telephone ;
	private boolean afficherTelephone ;
	private String photo ;
	private String pseudo ;
	private String motDePasse ;
	private String confirmationMotDePasse ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public boolean isAfficherTelephone() {
		return afficherTelephone;
	}
	public void setAfficherTelephone(boolean afficherTelephone) {
		this.afficherTelephone = afficherTelephone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getConfirmationMotDePasse() {
		return confirmationMotDePasse;
	}
	public void setConfirmationMotDePasse(String confirmationMotDePasse) {
		this.confirmationMotDePasse = confirmationMotDePasse;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String statut, String sexe, String nom, String prenom, Date dateNaissance, String email,
			Adresse adresse, long telephone, boolean afficherTelephone, String photo, String pseudo, String motDePasse,
			String confirmationMotDePasse) {
		super();
		this.statut = statut;
		this.sexe = sexe;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.afficherTelephone = afficherTelephone;
		this.photo = photo;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.confirmationMotDePasse = confirmationMotDePasse;
	}
	

}
