package funciones;

import java.text.DateFormat;

public class Usuario {

	private String Nombre;
	private String Apellido;
	private String id_user;
	private String password;
	private String correo;
	private DateFormat FechaNacimiento;
	private String genero;
	private String telefono;
	private float altura;
	private float peso;
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	public Usuario(String Nombre, String Apellido, String id_user, String password, String correo, 
			DateFormat fechaNacimiento2, String genero, String telefono, float altura, float peso){
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.id_user = id_user;
		this.password = password;
		this.correo = correo;
		this.FechaNacimiento = fechaNacimiento2;
		this.genero = genero;
		this.telefono = telefono;
		this.altura= altura;
		this.peso = peso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public DateFormat getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(DateFormat fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getId_user() {
		return id_user;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
