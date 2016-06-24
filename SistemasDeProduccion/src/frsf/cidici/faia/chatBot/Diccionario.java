package frsf.cidici.faia.chatBot;

import java.util.ArrayList;

public class Diccionario {

	ArrayList<String> Andar = new ArrayList<String>();
	ArrayList<String> Estar = new ArrayList<String>();
	ArrayList<String> Ser = new ArrayList<String>();
	ArrayList<String> Cursar = new ArrayList<String>();
	ArrayList<String> Hacer = new ArrayList<String>();
	ArrayList<String> Llamar = new ArrayList<String>();
	ArrayList<String> Querer = new ArrayList<String>();
	ArrayList<String> Ir = new ArrayList<String>();
	ArrayList<String> Rendir = new ArrayList<String>();
	ArrayList<String> Ver = new ArrayList<String>();
	ArrayList<String> Encontrar = new ArrayList<String>();
	
	//DICCIONARIO DE MATERIAS
	ArrayList<String> Materias = new ArrayList<String>();
	
	//DICCIONARIO PERSONAS: DOCENTES..
	ArrayList<String> Persona = new ArrayList<String>();
	
	
	
	//HAY QUE AGREGAR MÁS PUSE SOLO ALGUNAS
	//EN CUANTO APAREZCAN EN LAS FRASES DEL USUARIO VAMOS AGREGANDO Y MEJORANDO EL DICCIONARIO
	public Diccionario(){
		Andar.add("andar");
		Andar.add("anda");
		Andar.add("andan");
		Andar.add("andas");
		Andar.add("andamos");
		
		Estar.add("estar");//SIEMPRE EN EL PRIMER ELEMENTO VA EL INFINITIVO
		Estar.add("esta");
		Estar.add("estan");
		Estar.add("estas");
		Estar.add("estamos");
		
		Ser.add("ser");
		Ser.add("somos");
		Ser.add("son");
		Ser.add("es");
		Ser.add("estamos");
		
		Hacer.add("hacer");
		Hacer.add("hacemos");
		Hacer.add("hacias");
		Hacer.add("haces");
		Hacer.add("hiciste");
		
		Encontrar.add("encontrar");
		Encontrar.add("encuentro");
		Encontrar.add("encuentra");
		Encontrar.add("encontramos");
		
		Hacer.add("hacer");
		Hacer.add("haciendo");
		Hacer.add("haces");
		Hacer.add("acelga");
		
		Ir.add("ir");
		Ir.add("voy");
		Ir.add("vamos");
		Ir.add("llego");
		
		Querer.add("querer");
		Querer.add("quiero");
		Querer.add("queremos");
		
		Ver.add("ver");
		Ver.add("vemos");
		Ver.add("veremo");
		Ver.add("lovemo");
		
		Cursar.add("cursar");
		Cursar.add("cursa");
		Cursar.add("cursamos");
		Cursar.add("cursas");
		
		Rendir.add("rinde");
		Rendir.add("rendir");
		Rendir.add("rendimos");
		
		Llamar.add("llamar");
		Llamar.add("llamas");
		Llamar.add("llama");
		
		Materias.add("sistemas de gestion");
		Materias.add("inteligencia artificial");
		Materias.add("redes");
		Materias.add("ontologias");
		Materias.add("analisis matematico ii");
		
		Persona.add("milagros gutierrez");
		Persona.add("jorge roa");
		Persona.add("ignacio gomes");
		Persona.add("laura caliusco");
		Persona.add("susana romaniz");
		Persona.add("alfonso gimenez uribe");
		Persona.add("juan carlos ramos");
		Persona.add("pablo villareal");
		Persona.add("leandro taravini");
		Persona.add("sonia pastorelli");
				
	}
}
