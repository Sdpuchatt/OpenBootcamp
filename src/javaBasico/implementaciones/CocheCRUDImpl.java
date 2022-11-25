package javaBasico.implementaciones;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
	public List <Coche> listaDeCoches = new ArrayList<>();
	@Override
	public List<Coche> findAll() {
		
		return this.listaDeCoches;
	}

	@Override
	public void save(Coche coche) {
		listaDeCoches.add(coche);
		
	}

	@Override
	public void delete() {
		listaDeCoches.clear();
		
	}
	
}
