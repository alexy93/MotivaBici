package funciones;

public class Dificultad {

	private String id_dificultad;
	private String Nombre_dif;
	
	public Dificultad(){
		this.id_dificultad="1";
		this.Nombre_dif="Baja";
	}

	public String getId_dificultad() {
		return id_dificultad;
	}

	public void setId_dificultad(String id_dificultad) {
		this.id_dificultad = id_dificultad;
	}

	public String getNombre_dif() {
		return Nombre_dif;
	}

	public void setNombre_dif(String nombre_dif) {
		
		switch(nombre_dif){
			case "1":this.Nombre_dif="Baja"; break;
			case "2":this.Nombre_dif="Media";break;
			case "3":this.Nombre_dif="Alta";break;	
			default:this.Nombre_dif="Baja"; break;
		}
		
		
	}
	
	
}
