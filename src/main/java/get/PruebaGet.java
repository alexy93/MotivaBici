package get;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.json.Json;
import javax.json.JsonObject;



@Path("/Obtener")//acceder a la clase
public class PruebaGet {
	
	@Path("/Respuesta")
	@GET//accede a respues por medio de un get
	@Produces("application/json")//Formato que recibe
	public Response respuesta(){
		
		JsonObject resultado = Json.createObjectBuilder().add("Mensaje", "Hola mundo").build();
		
		return Response.status(200).entity(resultado.toString()).build();
	}
	
	
	@Path("/Respuesta/parametro/{nombre} {v}")
	@GET//accede a respues por medio de un get
	@Produces("application/json")//Formato que recibe
	
	public Response respuestaEncadenada(@PathParam("Nombre") String Nombre, @PathParam("Apellido") String Apellido){
		
		JsonObject resultado= Json.createObjectBuilder().add("parametroPasado", Nombre + Apellido).build(); 
		
		return Response.status(200).entity(resultado.toString()).build();
	}
	
	

}
