package com.fr.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Annonce implements Serializable {
	@Id @GeneratedValue
	private long id ;
	private Adresse adresse;
	private String type ;
	private String categorie ;
	private String titre ;
	private String description ;
	private String typeTarif;
	//private List<String> photos ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeTarif() {
		return typeTarif;
	}
	public void setTypeTarif(String typeTarif) {
		this.typeTarif = typeTarif;
	}
	/*public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}*/
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Annonce(Adresse adresse, String type, String categorie, String titre, String description, String typeTarif,
			List<String> photos) {
		super();
		this.adresse = adresse;
		this.type = type;
		this.categorie = categorie;
		this.titre = titre;
		this.description = description;
		this.typeTarif = typeTarif;
		//this.photos = photos;
	}
	
	
	
}
