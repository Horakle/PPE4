package wololo.ppe4;

public class interet {
	private int id_int;
	private String lib_int;
	
	//Getter & Setter ID
	public int getId_int() {
		return id_int;
	}
	public void setId_int(int id_int) {
		this.id_int = id_int;
	}
	
	//Getter & Setter Libell�
	public String getLib_int() {
		return lib_int;
	}
	public void setLib_int(String lib_int) {
		this.lib_int = lib_int;
	}
	
	//SQL
	public void affich_int(){
		String affich_int = "SELECT * FROM interet";
	}
	
	public void suppr_int(){
		String suppr_int = "DELETE FROM interet";
	}
	
	public void update_int(){
		String update_int = "UPDATE interet SET lib_int = '' ";
	}
	
	public void ajout_int(){
		String ajout_int = "INSERT INTO interet VALUES (0,'')";
	}
}
