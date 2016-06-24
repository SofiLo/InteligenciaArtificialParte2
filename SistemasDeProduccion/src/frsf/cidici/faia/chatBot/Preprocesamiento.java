package frsf.cidici.faia.chatBot;

import java.util.ArrayList;
import java.util.Iterator;

public class Preprocesamiento {
	
	public Preprocesamiento(){
		
	}
	/* En vez de main es: public void procesamiento(String original). Solo est� el main
	 * para poder ejecutar y probarlo*/
	public static void main(String[] args){
		
		//Esta ser�a la oraci�n que nos escriba el usuairo
		String original = "donde se cursa dise�o de sistemas ?";
		
		//En el separador se guarda la oracion en minuscula y separada por palabra.
		//Queda un arreglo de palabras
		String[] separador = original.toLowerCase().split(" ");
		
		/* normalizada es la oracion normalizada/parseada. Por ejemplo si el usuario ingresa: 
		 * "Donde encuentro a Fulanita??" en normalizada guardo "Donde encontrar Persona"*/
		ArrayList<String> normalizada = new ArrayList<String>();
		
		Diccionario dic = new Diccionario();
		ArrayList<String> separadas = new ArrayList<String>();
		//Para imprimir
		System.out.println("Array separador: ");
		
		//saco los signos de puntuaci�n
		for(int i=0; i<separador.length; i++)
			if(separador[i].length() > 1)  separadas.add(separador[i]);
		
		//separadas.remove(separadas.size()-1);
		
		//Verificamos materias
		Iterator<String> iter = separadas.iterator();
		while(iter.hasNext()) {
			String palabra = iter.next();
			if(dic.Cursar.contains(palabra) || dic.Rendir.contains(palabra)) {
				System.out.println(palabra);
				break;
			}
		}
		String materia = new String();
		while(iter.hasNext())
			materia = materia.concat(iter.next());
		
		//Verificamos personas
		iter = separadas.iterator();
		while(iter.hasNext()) {
			String palabra = iter.next();
			if(dic.Encontrar.contains(palabra) || dic.Estar.contains(palabra)) {
				System.out.println(palabra);
				break;
			}
		}
		String persona = new String();
		while(iter.hasNext())
			persona = persona.concat(iter.next());
		
		
		/*Este for recorre el arreglo separador y busca si coincide con las palabras sinonimos. Para normalizar y pasar
		 * a infinitivo y palabras comunes/claves*/
		for(String palabra : separador){
			if(dic.Andar.contains(palabra)){
				normalizada.add(dic.Andar.get(0));
			}else if(dic.Cursar.contains(palabra)){
				normalizada.add(dic.Cursar.get(0));
			}else if(dic.Encontrar.contains(palabra)){
				normalizada.add(dic.Encontrar.get(0));
			}else if(dic.Estar.contains(palabra)){
				normalizada.add(dic.Estar.get(0));
			}else if(dic.Hacer.contains(palabra)){
				normalizada.add(dic.Hacer.get(0));
			}else if(dic.Ir.contains(palabra)){
				normalizada.add(dic.Ir.get(0));
			}else if(dic.Llamar.contains(palabra)){
				normalizada.add(dic.Llamar.get(0));
			}else if(dic.Querer.contains(palabra)){
				normalizada.add(dic.Querer.get(0));
			}else if(dic.Rendir.contains(palabra)){
				normalizada.add(dic.Rendir.get(0));
			}else if(dic.Ver.contains(palabra)){
				normalizada.add(dic.Ver.get(0));
			}
			
		}
		System.out.println();
		System.out.println("Array normalizada: ");
		for(int i=0; i<normalizada.size(); i++)
			System.out.print(normalizada.get(i)+" ");
	}
	
}
