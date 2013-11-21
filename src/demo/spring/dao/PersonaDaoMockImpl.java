package demo.spring.dao;

import java.util.LinkedList;
import java.util.List;

import demo.spring.model.Persona;

public class PersonaDaoMockImpl implements PersonaDao {
	private List<Persona> personas = new LinkedList<Persona>();
	private int contador = 1;
	
	public void inicializar() {
		agregar(new Persona("Rodolfo", "Campos"));
		agregar(new Persona("Oscar", "Cano"));
		agregar(new Persona("Fulanito", "Detal"));
	}
	
	public void agregar(Persona p) {
		p.setId(contador++);
		personas.add(p);
	}
	
	private int buscarPos(Integer id) {
		int pos = -1;
		
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getId().equals(id)) {
				pos = i;
				break;
			}
		}
		
		return pos;
	}
	
	public void modificar(Persona p) {
		int pos = buscarPos(p.getId());
		
		if (pos >= 0) {
			personas.set(pos, p);
		}
	}
	
	public void eliminar(Integer id) {
		int pos = buscarPos(id);
		
		if (pos >= 0) {
			personas.remove(pos);
		}
	}

	public Persona obtener(Integer id) {
		int pos = buscarPos(id);
		Persona resultado = null;
		
		if (pos >= 0) {
			resultado = personas.get(pos);
		}
		
		return resultado;
	}

	public List<Persona> obtenerTodos() {
		return personas;
	}
}
