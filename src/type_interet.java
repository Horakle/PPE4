
public class type_interet {
	private int id_type_int;
	private String lib_type_int;
	public int getId_type_int() {
		return id_type_int;
	}
	public void setId_type_int(int id_type_int) {
		this.id_type_int = id_type_int;
	}
	public String getLib_type_int() {
		return lib_type_int;
	}
	public void setLib_type_int(String lib_type_int) {
		this.lib_type_int = lib_type_int;
	}
	
	public void affich_type_int(){
		String affich_type_int = "SELECT * FROM type_interet";
	}
	
	public void suppr_type_int(){
		String suppr_type_int = "DELETE FROM type_interet";
	}
	
	public void update_type_int(){
		String update_type_int = "UPDATE type_interet SET lib_type_int = '' ";
	}
	
	public void ajout_type_int(){
		String ajout_type_int = "INSERT INTO type_interet VALUES (0,'')";
	}
}
