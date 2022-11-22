package javaBasico.ejercicioHerencia;

public class App {
	public static void main(String[] args) {
		
		//Creo objetos de la clase Smartphone con parametros y vacio
		SmartWatch reloj = new SmartWatch("Rolex", "XII", 15500, 6);
		System.out.println(reloj.toString());
		SmartWatch reloj2 = new SmartWatch(); 
		System.out.println(reloj2);
		//Objetos tipo SmartPhone
		System.out.println("----------------------------");
		SmartPhone cel1 = new SmartPhone("Motorola", "G40", 48750, 8);
		System.out.println(cel1.toString());
		SmartPhone cel2 = new SmartPhone(); 
		System.out.println(cel2);
		
		
	}
}
