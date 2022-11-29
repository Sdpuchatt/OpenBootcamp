package lecturaFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fichero = new FileInputStream("C:\\Users\\Familia\\eclipse-workspace2\\openBootcampTarea\\src\\lecturaFicheros\\fichero.txt");
			try {
				byte [] datos = fichero.readAllBytes();
				for(byte dato : datos) {
					System.out.print((char)dato);
				}
				
				// Escribiendo un archivo
				PrintStream	 info = new PrintStream("copia.txt");
				info.println("Hola hola");
				
			}catch(IOException e) {
				
			}
		
		}catch(FileNotFoundException e){
			System.out.println("El archivo no se encontro: "+ e.getMessage());
		}
		
		
		
		
	}
}
