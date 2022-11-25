package javaBasico.implementaciones;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImplSQL implements CocheCRUD {
	List <Coche> listaDeAutos = new ArrayList<>();
	@Override
	public List<Coche> findAll() {
		return listaDeAutos;
	}

	@Override
	public void save(Coche coche) {
		listaDeAutos.add(coche);
		
	}

	@Override
	public void delete() {
		listaDeAutos.clear();
		
	}
	
}
