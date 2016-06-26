package frsf.cidici.faia.chatBot;

import java.util.ArrayList;

public class Diccionario {

//	ArrayList<String> Andar = new ArrayList<String>();
//	ArrayList<String> Estar = new ArrayList<String>();
//	ArrayList<String> Ser = new ArrayList<String>();
//	ArrayList<String> Cursar = new ArrayList<String>();
//	ArrayList<String> Hacer = new ArrayList<String>();
//	ArrayList<String> Llamar = new ArrayList<String>();
//	ArrayList<String> Querer = new ArrayList<String>();
//	ArrayList<String> Ir = new ArrayList<String>();
//	ArrayList<String> Rendir = new ArrayList<String>();
//	ArrayList<String> Ver = new ArrayList<String>();
//	ArrayList<String> Encontrar = new ArrayList<String>();
//	ArrayList<String> SaludoBienv = new ArrayList<String>();
//	ArrayList<String> SaludoDesp = new ArrayList<String>();
	
	ArrayList<String> SaludoBienv = new ArrayList<String>();
	ArrayList<String> SaludoDesp = new ArrayList<String>();
	ArrayList<String> ComoAndar = new ArrayList<String>();
	ArrayList<String> ComoTeLlamas = new ArrayList<String>();	
	ArrayList<String> DondeEstar = new ArrayList<String>();
	ArrayList<String> DondeCurso = new ArrayList<String>();
	ArrayList<String> DondeRindo = new ArrayList<String>();
	ArrayList<String> SistemasGestion = new ArrayList<String>();
	ArrayList<String> Inteligencia = new ArrayList<String>();
	ArrayList<String> AnalisisMatematicoII = new ArrayList<String>();
	ArrayList<String> Ontologias = new ArrayList<String>();
	ArrayList<String> Redes = new ArrayList<String>();
	ArrayList<String> Milagros = new ArrayList<String>();
	ArrayList<String> Susana = new ArrayList<String>();
	ArrayList<String> Jorge = new ArrayList<String>();
	ArrayList<String> Ignacio = new ArrayList<String>();
	ArrayList<String> Ramos = new ArrayList<String>();
	ArrayList<String> Laura = new ArrayList<String>();
	ArrayList<String> Alfonso = new ArrayList<String>();
	ArrayList<String> Taravini = new ArrayList<String>();
	ArrayList<String> Pastorelli = new ArrayList<String>();
	ArrayList<String> Villarreal = new ArrayList<String>();
	ArrayList<String> Gracias = new ArrayList<String>();
	ArrayList<String> Bien = new ArrayList<String>();
	ArrayList<String> ComoLlegar = new ArrayList<String>();
	
	String Como = "como";
	String Cual = "cual";
	String Donde =  "donde";
	String Cuando = "cuando";
	
	//DICCIONARIO DE MATERIAS
	ArrayList<String> Materias = new ArrayList<String>();
	
	//DICCIONARIO PERSONAS: DOCENTES..
	ArrayList<String> Persona = new ArrayList<String>();
	
	
	
	//HAY QUE AGREGAR MÁS PUSE SOLO ALGUNAS
	//EN CUANTO APAREZCAN EN LAS FRASES DEL USUARIO VAMOS AGREGANDO Y MEJORANDO EL DICCIONARIO
	public Diccionario(){
//		Andar.add("andar");
//		Andar.add("anda");
//		Andar.add("andan");
//		Andar.add("andas");
//		Andar.add("andas?");
//		Andar.add("andamos");
//		
//		Estar.add("estar");//SIEMPRE EN EL PRIMER ELEMENTO VA EL INFINITIVO
//		Estar.add("esta");
//		Estar.add("estan");
//		Estar.add("estas");
//		Estar.add("estamos");
//		Estar.add("estas?");
//		
//		Ser.add("ser");
//		Ser.add("somos");
//		Ser.add("son");
//		Ser.add("es");
//		Ser.add("estamos");
//		
//		Hacer.add("hacer");
//		Hacer.add("hacemos");
//		Hacer.add("hacias");
//		Hacer.add("haces");
//		Hacer.add("hiciste");
//		Hacer.add("haciendo");
//		Hacer.add("acelga");
//		
//		Encontrar.add("encontrar");
//		Encontrar.add("encuentro");
//		Encontrar.add("encuentra");
//		Encontrar.add("encontramos");
//		
//		Ir.add("ir");
//		Ir.add("voy");
//		Ir.add("vamos");
//		Ir.add("llego");
//		
//		Querer.add("querer");
//		Querer.add("quiero");
//		Querer.add("queremos");
//		
//		Ver.add("ver");
//		Ver.add("vemos");
//		Ver.add("veremo");
//		Ver.add("lovemo");
//		
//		Cursar.add("cursar");
//		Cursar.add("cursa");
//		Cursar.add("cursamos");
//		Cursar.add("cursas");
//		
//		Rendir.add("rendir");
//		Rendir.add("rinde");
//		Rendir.add("rendimos");
//		
//		Llamar.add("llamar");
//		Llamar.add("llamas");
//		Llamar.add("llama");
//		
		SaludoBienv.add("hola");
		SaludoBienv.add("buenas");
		SaludoBienv.add("buenosdias");
		SaludoBienv.add("buendia");
		SaludoBienv.add("buenasnoches");
		SaludoBienv.add("buenastardes");
		
		SaludoDesp.add("nosvemos");
		SaludoDesp.add("chau");
		SaludoDesp.add("adios");
		SaludoDesp.add("hastamañana");
		SaludoDesp.add("hastaluego");
		
		ComoAndar.add("comoestas");
		ComoAndar.add("comoandas");
		ComoAndar.add("comoandamos");
		ComoAndar.add("quetal");
		
		ComoTeLlamas.add("comotellamas");
		ComoTeLlamas.add("tunombre");
		ComoTeLlamas.add("nombre");
		
		DondeEstar.add("dondeesta");
		DondeEstar.add("dondeencuentro");
		DondeEstar.add("dondeanda");
		DondeEstar.add("dondeseencuentra");
		
		DondeCurso.add("dondesecursa");
		DondeCurso.add("dondecurso");
		DondeCurso.add("dondecursamos");
		DondeCurso.add("aulacurso");
		DondeCurso.add("aulasecursa");
		
		DondeRindo.add("dondeserinde");
		DondeRindo.add("donderindo");
		DondeRindo.add("donderendimos");
		DondeRindo.add("aularindo");
		DondeRindo.add("aulaserinde");
		
		Gracias.add("muchasgracias");
		Gracias.add("gracias");
		
		SistemasGestion.add("sistemasgestion");
		SistemasGestion.add("sg");
		SistemasGestion.add("gestion");
		
		Inteligencia.add("inteligenciaartificial");
		Inteligencia.add("ia");
		Inteligencia.add("artificial");
		Inteligencia.add("inteligencia");
		
		AnalisisMatematicoII.add("amii");
		AnalisisMatematicoII.add("analisismatematicoii");
		AnalisisMatematicoII.add("analisismatematico");
		AnalisisMatematicoII.add("analisisii");
		
		Ontologias.add("ontologias");
		Ontologias.add("desibo");
		Ontologias.add("dsbo");
		
		Redes.add("redes");
		
		Milagros.add("milagrosgutierrez");
		Milagros.add("milagros");
		Milagros.add("gutierrez");
		
		Susana.add("susanaromaniz");
		Susana.add("susana");
		Susana.add("romaniz");
		
		Jorge.add("jorgeroa");
		Jorge.add("jorge");
		Jorge.add("roa");
		
		Ignacio.add("ignaciogomez");
		Ignacio.add("joseignaciogomez");
		Ignacio.add("ignacio");
		Ignacio.add("nacho");
		Ignacio.add("gomez");
		
		Laura.add("lauracaliusco");
		Laura.add("caliusco");
		Laura.add("laura");
		
		Alfonso.add("alfonsogimenezuribe");
		Alfonso.add("alfonsogimenez");
		Alfonso.add("alfonso");
		Alfonso.add("gimenez");
		Alfonso.add("uribe");
		
		Ramos.add("juancarlosramos");
		Ramos.add("juanramos");
		Ramos.add("juancarlos");
		Ramos.add("ramos");
		
		Villarreal.add("pablovillarreal");
		Villarreal.add("pablo");
		Villarreal.add("villarreal");
		
		Taravini.add("leandrotaravini");
		Taravini.add("leotaravini");
		Taravini.add("leandro");
		Taravini.add("taravini");
		
		Pastorelli.add("soniapastorelli");
		Pastorelli.add("sonia");
		Pastorelli.add("pastorelli");
		
		Bien.add("bien");
		Bien.add("barbaro");
		Bien.add("genial");
		Bien.add("muybien");
		
		ComoLlegar.add("comollego");
		ComoLlegar.add("comollegar");
		ComoLlegar.add("dondevoy");
		ComoLlegar.add("quieroir");
		ComoLlegar.add("comosellega");
		
//		
//		Materias.add("sistemasdegestion");
//		Materias.add("inteligenciaartificial");
//		Materias.add("redes");
//		Materias.add("ontologias");
//		Materias.add("analisismatematicoii");
//		
//		Persona.add("milagrosgutierrez");
//		Persona.add("jorgeroa");
//		Persona.add("ignaciogomez");
//		Persona.add("lauracaliusco");
//		Persona.add("susanaromaniz");
//		Persona.add("alfonsogimenezuribe");
//		Persona.add("juancarlosramos");
//		Persona.add("pablovillareal");
//		Persona.add("leandrotaravini");
//		Persona.add("soniapastorelli");
	}
}