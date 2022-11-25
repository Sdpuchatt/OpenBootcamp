package javaBasico.implementaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Coche auto1 = new Coche("Alfa","Romeo",1989);
		Coche auto2 = new Coche("Renault","Clio",2006);
		
		CocheCRUD cocheCrud =  new CocheCRUDImpl();
		cocheCrud.save(auto1);
		cocheCrud.save(auto2);
		
		List<Coche> listaAuto = new ArrayList<>();
		listaAuto = cocheCrud.findAll();
		System.out.println(listaAuto);
		cocheCrud.delete();
		System.out.println(listaAuto);
	}
}
