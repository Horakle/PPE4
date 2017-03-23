import java.sql.Date;

public class utilisateur {
	private int id_util;
	private String nom_util;
	private String prenom_util;
	private Date dna_util;
	private char sexe;
	private String situation;
	private String secteur_util;
	private String mail;
	private String photo;
	private String pays;
	private String ville;
	private String cp;
	private String description; 
	
	//Getter & Setter ID
	public int getId_util() {
		return id_util;
	}
	public void setId_util(int id_util) {
		this.id_util = id_util;
	}
	
	//Getter & Setter Nom
	public String getNom_util() {
		return nom_util;
	}
	public void setNom_util(String nom_util) {
		this.nom_util = nom_util;
	}
	
	//Getter & Setter Prénom
	public String getPrenom_util() {
		return prenom_util;
	}
	public void setPrenom_util(String prenom_util) {
		this.prenom_util = prenom_util;
	}
	
	//Getter & Setter Dna
	public Date getDna_util() {
		return dna_util;
	}
	public void setDna_util(Date dna_util) {
		this.dna_util = dna_util;
	}
	
	//Getter & Setter Sexe
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	//Getter & Setter Situation
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	
	//Getter & Setter Secteur
	public String getSecteur_util() {
		return secteur_util;
	}
	public void setSecteur_util(String secteur_util) {
		this.secteur_util = secteur_util;
	}
	
	//Getter & Setter Mail
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	//Getter & Setter Photo
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	//Getter & Setter Pays
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	//Getter & Setter Ville
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	//Getter & Setter Code Postal
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	//Getter & Setter Description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//SQL
	public void affich_util(){
		String affich_util = "SELECT * FROM utilisateur";
	}
	
	public void suppr_util(){
		String suppr_util = "DELETE FROM utilisateur";
	}
	
	public void update_util(){
		String update_util = "UPDATE utilisateur SET nom_util = '',	prenom_util = '', dna_util = '', sexe = '', situation = '',	secteur_util = '', mail = '', photo = '', pays = '', ville = '', cp = '', description = '' ";
	}
	
	public void ajout_util(){
		String ajout_util = "INSERT INTO utilisateur VALUES (0, '', '', '', '', '', '', '', '', '', '', '', '')";
	}
}
