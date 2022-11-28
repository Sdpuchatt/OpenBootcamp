package ejercicio78y9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicio789 {
	/*Escribe el c�digo que devuelva una cadena al rev�s. 
	 * Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
	 */
	public static String reverse(String texto) { 
		String alReves ="";
		for(int i=0;i<texto.length();i++) {
			alReves+=texto.charAt((texto.length()-1)-i);
		}
		return alReves ;
	}
	
	public static void main(String[] args) {
		String cadena = "hola mundo";
		String resultado;
		resultado = reverse(cadena);
		System.out.println(resultado);
		
		System.out.println("-----------------------");
		
		/*
		 * Crea un array unidimensional de Strings y rec�rrelo, 
		 *	mostrando �nicamente sus valores.
		 */
		String[] arrayString = {"java", "phyton", "c++"};
		for (String i : arrayString) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		
		/* Crea un array bidimensional de enteros y rec�rrelo, 
		 * mostrando la posici�n y el valor de cada elemento en ambas dimensiones.
		 */
		int [][] arrayEnteros = new int [2][2];
		arrayEnteros [0][0] = 10;
		arrayEnteros [0][1] = 20;
		arrayEnteros [1][0] = 30;
		arrayEnteros [1][1] = 40;
		for(int i=0;i<arrayEnteros.length;i++) {
			for(int j=0; j<arrayEnteros[i].length;j++) {
				System.out.println("Posicion ["+i+"]["+j+"] = "+arrayEnteros[i][j]);
			}
		}
		System.out.println("-----------------------");
		/*
		 * Crea un "Vector" del tipo de dato que prefieras, y a��dele 5 elementos. 
		 *	Elimina el 2o y 3er elemento y muestra el resultado final.
		 */
		Vector<String> lista1 = new Vector<>();
		lista1.add("Sergio");
		lista1.add("Daniel");
		lista1.add("May");
		lista1.add("Martu");
		System.out.println(lista1);
		lista1.remove(1);
		lista1.remove(2);
		System.out.println(lista1);
		
		System.out.println("-----------------------");
		
	/*
	 * Indica cu�l es el problema de utilizar un Vector con la capacidad por 
	 *defecto si tuvi�semos 1000 elementos para ser a�adidos al mismo.
	 *  Respuesta: El problema seria que consume mucho recurso de la computadora.
	 */
		
	/*
	 * Crea un ArrayList de tipo String, con 4 elementos. C�pialo en una LinkedList. 
	 *	Recorre ambos mostrando �nicamente el valor de cada elemento.
	 */
		ArrayList<String> arrayLista = new ArrayList<>();
		arrayLista.add("algebra");
		arrayLista.add("matematica discreta");
		arrayLista.add("analisis matematico");
		arrayLista.add("Resolucion de problemas");
		
		LinkedList<String> linkedLista = new LinkedList<>(arrayLista);
		System.out.println("Imprimiendo ArrayList:");
		for(String i : arrayLista) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		System.out.println("Imprimiendo LinkedList:");
		for(String i : linkedLista) {
			System.out.println(i);
		}
		
		
	}
	/*
	 * 


Crea un ArrayList de tipo int, y, utilizando un bucle rell�nalo 
con elementos 1..10. A continuaci�n, con otro bucle, rec�rrelo y
 elimina los numeros pares. Por �ltimo, vuelve a recorrerlo 
 y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, 
 siempre y cuando cumplas el primer "for" de relleno.

Crea una funci�n DividePorCero. Esta, debe generar una excepci�n ("throws") 
a su llamante del tipo ArithmeticException que ser� capturada por su 
llamante (desde "main", por ejemplo). Si se dispara la excepci�n, 
mostraremos el mensaje "Esto no puede hacerse". Finalmente, 
mostraremos en cualquier caso: "Demo de c�digo".

Utilizando InputStream y PrintStream, crea una funci�n que reciba 
dos par�metros: "fileIn" y "fileOut". 
La tarea de la funci�n ser� realizar la copia del fichero dado en el 
par�metro "fileIn" al fichero dado en "fileOut".

Sorpr�ndenos creando un programa de tu elecci�n que utilice InputStream, 
PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
	 */
}
