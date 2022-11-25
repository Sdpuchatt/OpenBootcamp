package javaBasico.implementaciones;

public class Coche {
	private String marca;
	private String modelo;
	private int year;
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", year=" + year + "]";
	}

	public Coche(String marca, String modelo, int year) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
	}
}
