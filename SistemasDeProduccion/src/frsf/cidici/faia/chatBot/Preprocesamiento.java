//package frsf.cidici.faia.chatBot;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Preprocesamiento {
//
//	public Preprocesamiento() {
//
//	}
//
//	public ArrayList<String> procesamiento(String original) {
//
//		ArrayList<String> normalizada = new ArrayList<String>();
//		Diccionario dic = new Diccionario();
//		ArrayList<String> separadas = new ArrayList<String>();
//		String materia = new String();
//
//		String[] separador = original.toLowerCase().split(" ");
//
//		// saco los signos de puntuación
//		for (int i = 0; i < separador.length; i++)
//			if (separador[i].length() > 1)
//				separadas.add(separador[i]);
//
//		// separadas.remove(separadas.size()-1);
//
//		// Verificamos materias
//		Iterator<String> iter = separadas.iterator();
//		while (iter.hasNext()) {
//			String palabra = iter.next();
//			if (dic.Cursar.contains(palabra) || dic.Rendir.contains(palabra)) {
//				// System.out.println(palabra);
//				break;
//			}
//		}
//
//		while (iter.hasNext())
//			materia = materia.concat(iter.next());
//
//		// Verificamos personas
//		iter = separadas.iterator();
//		while (iter.hasNext()) {
//			String palabra = iter.next();
//			if (dic.Encontrar.contains(palabra) || dic.Estar.contains(palabra)) {
//				System.out.println(palabra);
//				break;
//			}
//		}
//		String persona = new String();
//		while (iter.hasNext())
//			persona = persona.concat(iter.next());
//
//		int indice;
//		if (!materia.equals(""))
//			indice = separadas.indexOf(materia.split(" ")[0]);
//
//		for (String palabra : separador) {
//			if (dic.SaludoBienv.contains(palabra)) {
//				normalizada.add(dic.SaludoBienv.get(0));
//			} else if (dic.SaludoDesp.contains(palabra)) {
//				normalizada.add(dic.SaludoDesp.get(0));
//			} else if (dic.Cuando.equals(palabra)) {
//				normalizada.add(dic.Cuando);
//			} else if (dic.Donde.equals(palabra)) {
//				normalizada.add(dic.Donde);
//			} else if (dic.Cual.equals(palabra)) {
//				normalizada.add(dic.Cual);
//			} else if (dic.Andar.contains(palabra)) {
//				normalizada.add(dic.Andar.get(0));
//			} else if (dic.Cursar.contains(palabra)) {
//				normalizada.add(dic.Cursar.get(0));
//				normalizada.add(materia);
//			} else if (dic.Encontrar.contains(palabra)) {
//				normalizada.add(dic.Encontrar.get(0));
//				normalizada.add(persona);
//			} else if (dic.Estar.contains(palabra)) {
//				normalizada.add(dic.Estar.get(0));
//			} else if (dic.Hacer.contains(palabra)) {
//				normalizada.add(dic.Hacer.get(0));
//			} else if (dic.Ir.contains(palabra)) {
//				normalizada.add(dic.Ir.get(0));
//			} else if (dic.Llamar.contains(palabra)) {
//				normalizada.add(dic.Llamar.get(0));
//			} else if (dic.Querer.contains(palabra)) {
//				normalizada.add(dic.Querer.get(0));
//			} else if (dic.Rendir.contains(palabra)) {
//				normalizada.add(dic.Rendir.get(0));
//			} else if (dic.Ver.contains(palabra)) {
//				normalizada.add(dic.Ver.get(0));
//			} else if (dic.Como.equals(palabra)) {
//				normalizada.add(dic.Como);
//			}
//		}
//		System.out.println();
//		System.out.println("Array normalizada: ");
//		for (int i = 0; i < normalizada.size(); i++)
//			System.out.print(normalizada.get(i) + " ");
//
//		return normalizada;
//	}
//
//}
