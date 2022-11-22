package javaBasico.ejercicioHerencia;

public class SmartWatch extends SmartDevice{

private int botones;
	
	public SmartWatch() {
	}
	
	public SmartWatch(String marca, String modelo, double precio, int botones) {
		super(marca, modelo, precio);
		this.botones = botones;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "SmartWatch [Marca=" + getMarca() + ", Modelo="
				+ getModelo() + ", Precio()=" + getPrecio() + ", Botones " + getBotones() + "]";
	}
	

}

