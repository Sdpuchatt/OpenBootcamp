package javaBasico;

public class EjercicioTema2 {
	public static void main(String[] args) {
		double precioArticulo = 100;
		double resultado;
		System.out.println("---------------");
		System.out.println("precio sin iva: "+ precioArticulo);
		System.out.println("---------------");
		resultado = calcularIva(precioArticulo);
		System.out.println("precio con iva: "+resultado);
	}
	public static double calcularIva(double precio) {
		double iva = 0.21;
		return (precio*iva)+precio; 
	}
}
