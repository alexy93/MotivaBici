package post;

import java.io.InputStream; // 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.Consumes;//Define el tipo de archivo que resive el servicio
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;//formato que usa el servidor 
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import com.google.gson.GsonBuilder;

import funciones.Coordenada;
import funciones.Dificultad;
import funciones.Recorrido;
import funciones.TipodeRecorrido;
import funciones.Usuario;
import funciones.WebMotivaBici;


@Path("/postRecibe")
public class PruebaPost {
	
	Usuario usuario;
	Recorrido recorrido;
	
	
	@Path("/RecibUsuario")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response recibeUsuario(InputStream a) {

		JsonObject respuesta;

		JsonObject ejemplopost;
		JsonReader lector;
		lector = Json.createReader(a);
		ejemplopost = lector.readObject();
		
		System.out.println(usuario(ejemplopost));
		
		respuesta = Json.createObjectBuilder().add("Salida1",usuario(ejemplopost)).build();
				
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
	public String usuario(JsonObject ejemplopost){
	
		String entrada;
		DateFormat FechaNacimiento = new SimpleDateFormat("dd-MM-yyyy");
		
		String Nombre = ejemplopost.getString("Nombre");
		String Apellido = ejemplopost.getString("Apellido");
		String id_user= ejemplopost.getString("id_user");
		String password= ejemplopost.getString("password");
		String correo= ejemplopost.getString("correo");
		FechaNacimiento= (DateFormat) ejemplopost.get(FechaNacimiento);
		String genero = ejemplopost.getString("genero");
		String telefono = ejemplopost.getString("telefono");
		
		usuario =new Usuario(Nombre, Apellido, id_user, password, correo,  FechaNacimiento,  genero,  telefono);
		
		entrada=usuario.getNombre()+usuario.getApellido()+usuario.getId_user()+usuario.getPassword()+usuario.getCorreo()+usuario.getFechaNacimiento()+
				usuario.getGenero()+usuario.getTelefono();
		
		return entrada;
	}
	
	
	
	@Path("/RecibRecorrido")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response recibeRecorrido(InputStream a) {

		
		JsonObject respuesta;

		JsonObject ejemplopost;
		JsonReader lector;
		lector = Json.createReader(a);
		ejemplopost = lector.readObject();
		
		
		
		System.out.println(recorrido(ejemplopost));
		
		
		
		respuesta = Json.createObjectBuilder().add("Salida1",recorrido(ejemplopost)).build();
				
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
	public String recorrido(JsonObject ejemplopost){
		
		String entrada;
		DateFormat FechaRecorrido = new SimpleDateFormat("dd-MM-yyyy");
		
		String id_recorrido = ejemplopost.getString("id_recorrido");
		FechaRecorrido = (DateFormat)ejemplopost.get(FechaRecorrido);
		String etiqueta= ejemplopost.getString("etiqueta");
		String comentarios = ejemplopost.getString("comentarios");
		String coordenada= ejemplopost.getString("coordenada"); 
		/*String tipoderecorrido=  ejemplopost.getString("tiporecorrido");
		String dificultad= ejemplopost.getString("dificultad");*/
		

	    JSONArray jsonArray = new JSONArray(coordenada);
		
		//Coordenada[] coordenadaArray = new GsonBuilder().create().fromJson(coordenada, Coordenada[].class);
		/*TipodeRecorrido[] tiporecArray = new GsonBuilder().create().fromJson(tipoderecorrido, TipodeRecorrido[].class);*/
		
		
		recorrido = new Recorrido( id_recorrido,  FechaRecorrido,  etiqueta,  comentarios);
		
		entrada=recorrido.getId_recorrido()+recorrido.getFechaRecorrido()+recorrido.getEtiqueta()+recorrido.getComentarios()+jsonArray;
		
		return entrada;
	}
	
	
}
