package bootcampHerencia;

public class EjercicioTema9 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(33, "Sergio", 4782419, 1000);
		System.out.println("Tengo " + cliente1.getEdad());
		System.out.println("Me llamo "+cliente1.getNombre());
		System.out.println("Mi telefono es "+ cliente1.getTelefono());
		System.out.println("Tengo "+ cliente1.getCredito()+" de credito");
	}
}

class Persona {
	private int edad;
	private String nombre;
	private int telefono;
	
	public Persona() {}
	
	public Persona(int edad, String nombre, int telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getTelefono () {
		return this.telefono;
	}
	
}
class Cliente extends Persona{
	private int credito;
	public Cliente(int edad, String nombre, int telefono, int credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
	}
	public int getCredito () {
		return this.credito;
	}

}