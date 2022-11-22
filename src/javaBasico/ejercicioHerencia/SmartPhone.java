package javaBasico.ejercicioHerencia;

public class SmartPhone extends SmartDevice {

	private int display;
	
	public SmartPhone() {
	}
	
	public SmartPhone(String marca, String modelo, double precio, int display) {
		super(marca, modelo, precio);
		this.display = display;
	}

	public int getdisplay() {
		return display;
	}

	public void setBotones(int display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "SmartPhone [Marca=" + getMarca() + ", Modelo="
				+ getModelo() + ", Precio()=" + getPrecio() + ", display " + getdisplay() + "]";
	}
	

}
