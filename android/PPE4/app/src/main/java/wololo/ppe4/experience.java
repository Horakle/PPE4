import java.sql.Date;

public class experience {
	private int id_exp;
	private String entreprise;
	private String ville_exp;
	private String pays_exp;
	private Date date_debut;
	private Date date_fin;
	private String description;
	
	//Getter & Setter ID
	public int getId_exp() {
		return id_exp;
	}
	public void setId_exp(int id_exp) {
		this.id_exp = id_exp;
	}
	
	//Getter & Setter Entreprise
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	//Getter & Setter Ville
	public String getVille_exp() {
		return ville_exp;
	}
	public void setVille_exp(String ville_exp) {
		this.ville_exp = ville_exp;
	}
	
	//Getter & Setter Pays
	public String getPays_exp() {
		return pays_exp;
	}
	public void setPays_exp(String pays_exp) {
		this.pays_exp = pays_exp;
	}
	
	//Getter & Setter Date début
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	
	//Getter & Setter Date fin
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	//Getter & Setter Description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//SQL
	public void affich_exp(){
		String affich_exp = "SELECT * FROM experience";
	}
	
	public void suppr_exp(){
		String suppr_exp = "DELETE FROM experience";
	}
	
	public void update_exp(){
		String update_exp = "UPDATE experience SET entreprise = '', ville_exp = '', pays_exp = '', date_debut = '', date_fin = '', description = '' ";
	}
	
	public void ajout_exp(){
		String ajout_exp = "INSERT INTO experience VALUES (0, '', '', '', '', '', '')";
	}
}
