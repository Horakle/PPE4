<?php
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
@@ -15,6 +19,7 @@ public class interet {
		this.lib_int = lib_int;
	}
	
	//SQL
	public void affich_int(){
		String affich_int = "SELECT * FROM interet";
	}
@@ -28,6 +33,6 @@ public class interet {
	}
	
	public void ajout_int(){
		String ajout_int = "INSERT INTO formation VALUES (0,'')";
		String ajout_int = "INSERT INTO interet VALUES (0,'')";
	}
}
?>