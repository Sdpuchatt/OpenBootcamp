package bootCamp;

public class EjercicioTema8 {
	public static void main(String[] args) {
		Persona personita = new Persona();
		personita.setEdad(33);
		personita.setNombre("Sergio Puchatt");
		personita.setTelefono(2235215);
		
		System.out.println("Soy "+personita.getNombre()+" tengo "+personita.getEdad());
		System.out.println("Mi telefono es : "+personita.getTelefono());
		
		
		
	}
}
class Persona{
	int edad;
	String nombre;
	int telefono;
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return this.telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
