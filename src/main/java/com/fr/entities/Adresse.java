package com.fr.entities;

import java.io.Serializable;

public class Adresse implements Serializable {
	
	private long numeroRue;
	private String nomRue;
	private String complement ;
	private String ville;
	private long codePostal;
	public long getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(long numeroRue) {
		this.numeroRue = numeroRue;
	}
	public Adresse(long numeroRue, String nomRue, String complement, String ville, long codePostal) {
		super();
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.complement = complement;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}

}
