
public class formation {
	private int id;
	private String ecole;
	private String diplome;
	private int annee_debut;
	private int annee_fin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public int getAnnee_debut() {
		return annee_debut;
	}
	public void setAnnee_debut(int annee_debut) {
		this.annee_debut = annee_debut;
	}
	public int getAnnee_fin() {
		return annee_fin;
	}
	public void setAnnee_fin(int annee_fin) {
		this.annee_fin = annee_fin;
	}
	
	public void affich_form(){
		String affich_form = "SELECT * FROM formation";
	}
	
	public void suppr_form(){
		String suppr_form = "DELETE FROM formation";
	}
	
	public void update_form(){
		String update_form = "UPDATE formation SET ";
	}
	
	public void ajout_form(){
		String ajout_form = "INSERT INTO formation VALUES (0,'', '', '', '')";
	}
}
