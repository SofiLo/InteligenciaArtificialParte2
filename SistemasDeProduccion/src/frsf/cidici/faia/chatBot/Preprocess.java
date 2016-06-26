package frsf.cidici.faia.chatBot;

import java.util.ArrayList;

public class Preprocess {
	
	public ArrayList<String> procesar(String cadena){
		Diccionario dic = new Diccionario();
		
		ArrayList<String> normalizada = new ArrayList<String>();
		
		String[] separada;
		if(cadena.split(" ").length > 1)
			cadena = cadena.substring(0, cadena.indexOf("?")) + " "+ cadena.substring(cadena.indexOf("?"));
		
		separada = cadena.toLowerCase().split(" ");
		
		
		//JUNTO PALABRAS DE SALUDO INICIAL
		juntarSaludoBienvenida(separada);
		
		//JUNTO PALABRAS DE SALUDO FINAL
		juntarSaludoDespedida(separada);
		
		//JUNTO PREGUNTAS
		juntarPreguntas(separada);
		
		//JUNTO MATERIAS
		juntarMaterias(separada);
		
		//JUNTO DOCENTES
		juntarNombres(separada);
				
				
		for(String palabra : separada){
			System.out.println(palabra);
			if(dic.SaludoBienv.contains(palabra)){
				normalizada.add("SaludoBienv");
			}if(dic.SaludoDesp.contains(palabra)){
				normalizada.add("SaludoDesp");
			}if(dic.ComoAndar.contains(palabra)){
				normalizada.add("ComoAndar");
			}if(dic.SistemasGestion.contains(palabra)){
				normalizada.add("SistemasGestion");
			}if(dic.Inteligencia.contains(palabra)){
				normalizada.add("Inteligencia");
			}if(dic.AnalisisMatematicoII.contains(palabra)){
				normalizada.add("AnalisisMatematicoII");
			}if(dic.Redes.equals(palabra)){
				normalizada.add("Redes");
			}if(dic.Ontologias.contains(palabra)){
				normalizada.add("Ontologias");
			}if(dic.Milagros.contains(palabra)){
				normalizada.add("Milagros");
			}if(dic.Jorge.contains(palabra)){
				normalizada.add("Jorge");
			}if(dic.Laura.contains(palabra)){
				normalizada.add("Laura");
			}if(dic.Ignacio.contains(palabra)){
				normalizada.add("Ignacio");
			}if(dic.Susana.contains(palabra)){
				normalizada.add("Susana");
			}if(dic.Alfonso.contains(palabra)){
				normalizada.add("Alfonso");
			}if(dic.Ramos.contains(palabra)){
				normalizada.add("Ramos");
			}if(dic.Villarreal.contains(palabra)){
				normalizada.add("Villarreal");
			}if(dic.Taravini.contains(palabra)){
				normalizada.add("Taravini");
			}if(dic.Pastorelli.contains(palabra)){
				normalizada.add("Pastorelli");
			}if(dic.DondeEstar.contains(palabra)){
				normalizada.add("DondeEstar");
			}if(dic.DondeRindo.contains(palabra)){
				normalizada.add("DondeRindo");
			}if(dic.DondeCurso.contains(palabra)){
				normalizada.add("DondeCurso");
			}if(dic.ComoTeLlamas.contains(palabra)){
				normalizada.add("ComoTeLlamas");
			}if(dic.Gracias.contains(palabra)){
				normalizada.add("Gracias");
			}if(dic.Bien.contains(palabra)){
				normalizada.add("Bien");
			}if(dic.ComoLlegar.contains(palabra)){
				normalizada.add("ComoLlegar");
			}
		}
		//imprimenomas
		System.out.println(normalizada);
		
		return normalizada;
	
	}

	private static void juntarNombres(String[] separada) {
		for(int i=0; i<separada.length; i++){
			if(separada.length!=1){
				if(separada[i].equals("milagros") && separada[i+1].equals("gutierrez")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("susana") && separada[i+1].equals("romaniz")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("jorge") && separada[i+1].equals("roa")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("ignacio") && separada[i+1].equals("gomez")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("jose") && separada[i+1].equals("ignacio")
						&& separada[i+2].equals("gomez")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" ";
					separada[i+2]=" ";
				}else if(separada[i].equals("laura") && separada[i+1].equals("caliusco")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("alfonso") && separada[i+1].equals("gimenez") 
						&& separada[i+2].equals("uribe")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" ";separada[i+2]=" ";
				}else if(separada[i].equals("alfonso") && separada[i+1].equals("gimenez")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("juan") && separada[i+1].equals("ramos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("juan") && separada[i+1].equals("carlos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("juan") && separada[i+1].equals("carlos") 
						&& separada[i+2].equals("ramos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" ";separada[i+2]=" ";
				}else if(separada[i].equals("pablo") && separada[i+1].equals("villarreal")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("leandro") && separada[i+1].equals("taravini")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("leo") && separada[i+1].equals("taravini")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("sonia") && separada[i+1].equals("pastorelli")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
			}
		}	
		
	}

	private static void juntarMaterias(String[] separada) {
		
		for(int i=0; i<separada.length; i++){
			if(separada.length!=1){
				if(separada[i].equals("sistemas") && separada[i+1].equals("de") && separada[i+2].equals("gestion")){
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("inteligencia") && separada[i+1].equals("artificial")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("analisis") && separada[i+1].equals("matematico") && separada[i+2].equals("ii")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" ";
					separada[i+2]=" ";
				}
			}	
		}
	}

	private static void juntarPreguntas(String[] separada) {
		
		for(int i=0; i<separada.length; i++){
			if(separada.length!=1){
				if(separada[i].equals("como") && separada[i+1].equals("andas")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("como") && separada[i+1].equals("estas")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("que") && separada[i+1].equals("tal")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("como") && separada[i+1].equals("andamos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("esta")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("anda")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("encuentro")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("se")
						&& separada[i+2].equals("encuentra")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("curso")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("se")
						&& separada[i+2].equals("cursa")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("cursamos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("aula") && separada[i+1].equals("curso")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("aula") && separada[i+1].equals("se")
						&& separada[i+2].equals("cursa")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("como") && separada[i+1].equals("te")
						&& separada[i+2].equals("llamas")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("tu") && separada[i+1].equals("nombre")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("rindo")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("se")
						&& separada[i+2].equals("rinde")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("rendimos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("aula") && separada[i+1].equals("rindo")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("aula") && separada[i+1].equals("se")
						&& separada[i+2].equals("rinde")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" "; separada[i+2]=" ";
				}
				else if(separada[i].equals("muchas") && separada[i+1].equals("gracias")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("como") && separada[i+1].equals("llego")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("como") && separada[i+1].equals("llegar")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
				else if(separada[i].equals("como") && separada[i+1].equals("se")
						&& separada[i+1].equals("llega")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i] = separada[i].concat(separada[i+2]);
					separada[i+1]=" ";separada[i+2]=" ";
				}else if(separada[i].equals("quiero") && separada[i+1].equals("ir")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("donde") && separada[i+1].equals("voy")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
			}	
		}
		
	}

	private static void juntarSaludoDespedida(String[] separada) {
		
		for(int i=0; i<separada.length; i++){
			if(separada.length!=1){
				if(separada[i].equals("nos") && separada[i+1].equals("vemos")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("hasta") && separada[i+1].equals("mañana")){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
			}	
		}
	}

	private static void juntarSaludoBienvenida(String[] separada) {
		for(int i=0; i<separada.length; i++){
			if(separada.length!=1){
				if(separada[i].equals("buenas") && 
						((separada[i+1]).equals("tardes") || (separada[i+1]).equals("noches"))){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if((separada[i].equals("buenos") && ((separada[i+1]).equals("dias")))){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("buen") && (separada[i+1].equals("dia"))){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}else if(separada[i].equals("muy") && (separada[i+1].equals("bien"))){
					separada[i] = separada[i].concat(separada[i+1]);
					separada[i+1]=" ";
				}
			}
			
		}
	}

}

