package frsf.cidici.faia.chatBot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
	
	static File archivo;
	String ruta;
	static BufferedWriter bw;
	FileWriter fw;
	
	public Util(){
		ruta = "C:\\Users\\Evelyn\\Desktop\\log.txt";
		archivo = new File(ruta);

	}
	public static void escribir(String oracion){
		
		if(archivo.exists()) {
		      // El fichero ya existe
				try {
					bw = new BufferedWriter(new FileWriter(archivo, true));
					bw.newLine();
					bw.append(oracion);
					bw.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} else {
		      // El fichero no existe y hay que crearlo
			try {
				archivo.createNewFile();
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(oracion);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
