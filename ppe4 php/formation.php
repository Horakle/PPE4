<?php
	private int annee_debut;
	private int annee_fin;
	
	//Getter & Setter ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Getter & Setter Ecole
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	
	//Getter & Setter Diplome
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	//Getter & Setter Ville
	public String getVille() {
		return ville_ecole;
	}
	public void setVille(String ville_ecole) {
		this.ville_ecole = ville_ecole;
	}
	
	//Getter & Setter Pays
	public String getPays() {
		return pays_ecole;
	}
	public void setPays(String pays_ecole) {
		this.pays_ecole = pays_ecole;
	}
	
	//Getter & Setter Ann�e d�but
	public int getAnnee_debut() {
		return annee_debut;
	}
	public void setAnnee_debut(int annee_debut) {
		this.annee_debut = annee_debut;
	}
	
	//Getter & Setter Ann�e fin
	public int getAnnee_fin() {
		return annee_fin;
	}
		public class formation {
		this.annee_fin = annee_fin;
	}
	
	//SQL
	public void affich_form(){
		String affich_form = "SELECT * FROM formation";
	}
	
	?>