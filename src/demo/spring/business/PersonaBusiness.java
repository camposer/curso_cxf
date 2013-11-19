package demo.spring.business;

import java.util.List;

import demo.spring.model.Persona;

public interface PersonaBusiness {
	public void agregarPersona(Persona p);
	public void modificarPersona(Persona p);
	public void eliminarPersona(Integer id);
	public Persona obtenerPersona(Integer id);
	public List<Persona> obtenerPersonas();	
}
