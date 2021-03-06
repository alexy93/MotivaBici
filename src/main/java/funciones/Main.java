package funciones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class Main {

	public static void main(String[] args) throws ParseException {
		// ------------------------------------------------------------------------------------------------
				//coordenadas "inventadas" (de prueba)
				
				// todo esto se reemplaza con la lista que se saca de la base de datos
				Coordenada coordenada1 =new Coordenada(7.133933,-73.124321,980,"15/05/2006 06:00:40");
				Coordenada coordenada2 =new Coordenada(7.133973,-73.124063,981,"15/05/2006 06:30:30");
				Coordenada coordenada3 =new Coordenada(7.134050,-73.123773,982,"15/05/2006 07:00:30");
				Coordenada coordenada4 =new Coordenada(7.134152,-73.123287,983,"15/05/2006 07:30:30");
				Coordenada coordenada5 =new Coordenada(7.134291,-73.123001,984,"15/05/2006 08:00:00");
				Coordenada coordenada6 =new Coordenada(7.134292,-73.123001,984,"15/05/2006 08:20:30");
				Coordenada coordenada7 =new Coordenada(7.134421,-73.122394,982,"15/05/2006 08:40:30");
				Coordenada coordenada8 =new Coordenada(7.134627,-73.122200,975,"15/05/2006 09:00:30");
				Coordenada coordenada9 =new Coordenada(7.134978,-73.122272,977,"15/05/2006 09:20:30");
				Coordenada coordenada10 =new Coordenada(7.135417,-73.122340,980,"15/05/2006 09:40:30");
				Coordenada coordenada11 =new Coordenada(7.135963,-73.122455,982,"15/05/2006 09:45:30");
				Coordenada coordenada12 =new Coordenada(7.136567,-73.122556,984,"15/05/2006 09:50:30");
				Coordenada coordenada13 =new Coordenada(7.136992,-73.122656,986,"15/05/2006 09:51:30");
				Coordenada coordenada14 =new Coordenada(7.137378,-73.122745,982,"15/05/2006 09:52:30");
				Coordenada coordenada15 =new Coordenada(7.137740,-73.122818,990,"15/05/2006 09:53:30");
				Coordenada coordenada16 =new Coordenada(7.138285,-73.122888,985,"15/05/2006 09:55:30");
				Coordenada coordenada17 =new Coordenada(7.138911,-73.123022,982,"15/05/2006 10:00:30");
				Coordenada coordenada18 =new Coordenada(7.139581,-73.123150,983,"15/05/2006 11:30:30");
				Coordenada coordenada19 =new Coordenada(7.139951,-73.123204,984,"15/05/2006 12:00:30");
				Coordenada coordenada20 =new Coordenada(7.139967,-73.123150,985,"15/05/2006 12:30:30");
				
				
				
				// a�ado todas las coordenadas a una lista llamada recorrido
				List<Coordenada> recorrido = new ArrayList<Coordenada>();
				recorrido.add(coordenada1);
				recorrido.add(coordenada2);
				recorrido.add(coordenada3);
				recorrido.add(coordenada4);
				recorrido.add(coordenada5);
				recorrido.add(coordenada6);
				recorrido.add(coordenada7);
				recorrido.add(coordenada8);
				recorrido.add(coordenada9);
				recorrido.add(coordenada10);
				recorrido.add(coordenada11);
				recorrido.add(coordenada12);
				recorrido.add(coordenada13);
				recorrido.add(coordenada14);
				recorrido.add(coordenada15);
				recorrido.add(coordenada16);
				recorrido.add(coordenada17);
				recorrido.add(coordenada18);
				recorrido.add(coordenada19);
				recorrido.add(coordenada20);
				// ----------------------------------------------------------------------------------------
				List<Coordenada> normalizada = new ArrayList<Coordenada>();
				
				normalizada=normal(recorrido);
				
				// imprimir lista
				System.out.println("Coordenadas filtradas: ");
				for (int i=0;i<normalizada.size(); i++){ 
					System.out.println(i+"     "+normalizada.get(i).getLatitud()+"    "+normalizada.get(i).getLongitud());
				}
				System.out.println("\n");
				System.out.println("Metros Ascendidos: "+obtenerMetrosAsc(recorrido)+"\n");
				System.out.println("Metros Descendidos: "+obtenerMetrosDesc(recorrido)+"\n");
				System.out.println("Duracion: "+new java.text.SimpleDateFormat( "HH:mm:ss" ).format(  new Date(obtenerDuracion(recorrido)) ));
				
			}
			
			public static long obtenerDuracion(List todas) throws ParseException{
				
				
				
				Date hora1 = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss").parse(((Coordenada) todas.get(0)).getHora_registro()); 
				Date hora2 = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss").parse(((Coordenada) todas.get(todas.size()-1)).getHora_registro());
				Date calibrador= new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
				long lantes = hora1.getTime(); 
				long lahora = hora2.getTime();
				long calibrator =calibrador.getTime();
				long diferencia = (lahora - lantes + calibrator);
				
				return diferencia;
			}
			
			
			
			
			public static int obtenerMetrosAsc (List todas){
				int metrosAsc=0;
				int alt1;
				int alt2;
				int res;
				for (int i=1;i<todas.size(); i++){
					alt2= ((Coordenada) todas.get(i)).getAltitud();
					alt1= ((Coordenada) todas.get(i-1)).getAltitud();
					res=alt2-alt1;
					if(res>0){
						metrosAsc=metrosAsc+res;
					}
					
					
				}
				return metrosAsc;
			}
			public static int obtenerMetrosDesc (List todas){
				int metrosDesc=0;
				int alt1;
				int alt2;
				int res;
				for (int i=1;i<todas.size(); i++){
					alt2= ((Coordenada) todas.get(i)).getAltitud();
					alt1= ((Coordenada) todas.get(i-1)).getAltitud();
					res=alt2-alt1;
					if(res<0){
						metrosDesc=metrosDesc+Math.abs(res);
					}
					
					
				}
				return metrosDesc;
			}
			 
			// normaliza la lista con las coordenadas
			public static  List normal(List todas){
				List<Coordenada> normali = new ArrayList<Coordenada>();
				int distanciaMetros=40; //metros l�mite, velocidad promedio 4.5m/s
				double distancia = distanciaMetros*0.00000901941; //distancia l�mite en unidades de coordenada(40 metros)
				double lat2; 
				double lon2;
				double lat1;
				double lon1;
				double diflat; //diferencia positiva entre las dos latitudes
				double diflon; //diferencia positiva entre las dos longitudes
				int apunt=0;
				normali.add((Coordenada) todas.get(0));
				double distanciaM=0;
				double distanciatotal=0;
				
				for (int i=1;i<todas.size(); i++){
					
					lat2= ((Coordenada) todas.get(i)).getLatitud();
					lon2= ((Coordenada) todas.get(i)).getLongitud();
					lat1= ((Coordenada) todas.get(apunt)).getLatitud();
					lon1= ((Coordenada) todas.get(apunt)).getLongitud();
					
					diflat= Math.abs(lat2-lat1);
					diflon= Math.abs(lon2-lon1);
					//se calcula la distancia real usando el m�todo de pit�goras
					distanciaM=Math.sqrt((Math.pow(diflat, 2))+(Math.pow(diflon, 2)));
					
					// se comprueba que la distancia medida sea mayor que la distancia l�mite,
					if(distanciaM>distancia){ // se a�ade dicha coordenada a la lista normalizada y se corre el aputnador
						normali.add((Coordenada) todas.get(i));
						apunt=i;
						distanciatotal=distanciatotal+distanciaM;
					}
					// si no se cumple la condici�n el apuntador se queda en la misma coordenada
					// para verificar si la siguiente coordenada s� cumple la condici�n de distancia
					// compar�ndola con la coordenada que tiene el apuntador
					
					
				}
				
				
				
				distanciatotal=distanciatotal+distanciaM;
				System.out.println("distancia total   "+distanciatotal/0.000009125+"\n");
				return normali;
			}

	}


