package javaBasico;

public class EjercicioTema3 {
	public static void main(String[] args) {
	
		String[] nombres = {"lala", "lele", "lili", "lolo"};
		String concatenacionNombres = "";
		int i = 0;
		
		while(i<nombres.length) {
			concatenacionNombres += nombres[i] + " ";
			i++;
		}
		System.out.println(concatenacionNombres);
	}
}
