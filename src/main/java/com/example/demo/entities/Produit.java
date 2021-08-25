package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdProduit;
	private String NomProduit;
	private String Discription;
	private int Prix;
	
	public Produit() {
		super();
	}

	public Produit( String nomProduit, String discription, int prix) {
		super();
		
		NomProduit = nomProduit;
		Discription = discription;
		Prix = prix;
	}

	public long getIdProduit() {
		return IdProduit;
	}

	public void setIdProduit(long idProduit) {
		IdProduit = idProduit;
	}

	public String getNomProduit() {
		return NomProduit;
	}

	public void setNomProduit(String nomProduit) {
		NomProduit = nomProduit;
	}

	public String getDiscription() {
		return Discription;
	}

	public void setDiscription(String discription) {
		Discription = discription;
	}

	public int getPrix() {
		return Prix;
	}

	public void setPrix(int prix) {
		Prix = prix;
	}
	
	

}
