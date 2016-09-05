package funciones;

import java.util.Date;

public class Coordenada {

	private double latitud;
	private double longitud;
	private int altitud;
	private String hora_registro;
	
	
	public Coordenada(double latitud, double longitud, int altitud, String tiempo) {
		
		this.latitud=latitud;
		this.longitud=longitud;
		this.altitud=altitud;
		this.hora_registro=tiempo;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}

	public void setHora_registro(String hora_registro) {
		this.hora_registro = hora_registro;
	}

	public double getLatitud() {
		return latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public int getAltitud() {
		return altitud;
	}

	public String getHora_registro() {
		return hora_registro;
	}

		
	
}
