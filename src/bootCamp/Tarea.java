package bootCamp;

public class Tarea {
	public static void main (String[]args) {
	//Primer ejercicio
		int resultado;
		resultado = suma(10,5,50);
		System.out.println(resultado);

	//Segundo Ejercicio
		Coche miCoche = new Coche();
		miCoche.incrementaPuerta();
		miCoche.incrementaPuerta();
		System.out.println("la cantidad de puertas son: " + miCoche.Cantidadpuertas);
	}
	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
	
}
class Coche{
	public int Cantidadpuertas = 0;
	
	public void incrementaPuerta () {
		this.Cantidadpuertas ++;
	}
}
