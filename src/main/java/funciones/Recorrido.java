package funciones;

import java.text.DateFormat;
import java.util.Date;

public class Recorrido {

	private String id_recorrido;
	private DateFormat FechaRecorrido;
	/*private float calorias;
	private float velProm;
	private float altitud;
	private float distancia;*/
	private String etiqueta;
	private String comentarios;
	//private DateFormat TiempoTranscurrido;
	
	/*Coordenada coordenada;
	TipodeRecorrido tipoderecorrido;
	Dificultad dificultad;*/
	
	public Recorrido(String id_recorrido, DateFormat FechaRecorrido,String etiqueta,String comentarios){
	
		this.id_recorrido =id_recorrido;
		this.FechaRecorrido= FechaRecorrido;
		this.etiqueta=etiqueta;
		this.comentarios=comentarios;
	}

	public String getId_recorrido() {
		return id_recorrido;
	}

	public void setId_recorrido(String id_recorrido) {
		this.id_recorrido = id_recorrido;
	}

	public DateFormat getFechaRecorrido() {
		return FechaRecorrido;
	}

	public void setFechaRecorrido(DateFormat fechaRecorrido) {
		FechaRecorrido = fechaRecorrido;
	}

	/*public float getCalorias() {
		return calorias;
	}

	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}

	public float getVelProm() {
		return velProm;
	}

	public void setVelProm(float velProm) {
		this.velProm = velProm;
	}

	public float getAltitud() {
		return altitud;
	}

	public void setAltitud(float altitud) {
		this.altitud = altitud;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}*/

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/*public DateFormat getTiempoTranscurrido() {
		return TiempoTranscurrido;
	}

	public void setTiempoTranscurrido(DateFormat tiempoTranscurrido) {
		TiempoTranscurrido = tiempoTranscurrido;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public TipodeRecorrido getTipoderecorrido() {
		return tipoderecorrido;
	}

	public void setTipoderecorrido(TipodeRecorrido tipoderecorrido) {
		this.tipoderecorrido = tipoderecorrido;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	
	*/
	
	
}
