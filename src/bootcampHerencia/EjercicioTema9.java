package bootcampHerencia;

public class EjercicioTema9 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(33, "Sergio", 4782419, 1000);
		System.out.println("Soy un cliente, tengo " + cliente1.getEdad());
		System.out.println("Me llamo "+cliente1.getNombre());
		System.out.println("Mi telefono es "+ cliente1.getTelefono());
		System.out.println("Tengo "+ cliente1.getCredito()+" de credito");
		System.out.println("--------------------------");
		
		Trabajador t1 = new Trabajador(33, "Daniel", 4783555, 200000);
		System.out.println("Soy un trabajador tengo "+t1.getEdad() +"\n Mi nombre es "+ t1.getNombre() 
		+"\n Telefono: " + t1.getTelefono() + "\n mi salario "+ t1.getSalario());
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
class Trabajador extends Persona{
	private int salario;
	public Trabajador(int edad, String nombre, int telefono, int salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}
	public int getSalario() {
		return this.salario;
	}
}