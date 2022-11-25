package javaBasico.implementaciones;

import java.util.List;

public interface CocheCRUD {
	public List<Coche> findAll();
	public void save(Coche coche);
	public void delete();
}
