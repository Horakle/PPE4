package wololo.ppe4;

public class domaine_etude {
	private int id_dom;
	private String lib_dom;
	
	//Getter & Setter ID
	public int getId_dom() {
		return id_dom;
	}
	public void setId_dom(int id_dom) {
		this.id_dom = id_dom;
	}
	
	//Getter & Setter Libell�
	public String getLib_dom() {
		return lib_dom;
	}
	public void setLib_dom(String lib_dom) {
		this.lib_dom = lib_dom;
	}
	
	//SQL
	public void affich_dom(){
		String affich_dom = "SELECT * FROM domaine";
	}
	
	public void suppr_dom(){
		String suppr_dom = "DELETE FROM domaine";
	}
	
	public void update_dom(){
		String update_dom = "UPDATE domaine SET lib_dom = '' ";
	}
	
	public void ajout_dom(){
		String ajout_dom = "INSERT INTO domaine VALUES (0,'')";
	}
}
