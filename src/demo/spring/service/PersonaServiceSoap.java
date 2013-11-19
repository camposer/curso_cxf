package demo.spring.service;

import java.util.List;
import javax.jws.WebService;
import demo.spring.model.Persona;

@WebService
public interface PersonaServiceSoap {
	public void agregarPersona(Persona p);
	public void modificarPersona(Persona p);
	public void eliminarPersona(Integer id);
	public Persona obtenerPersona(Integer id);
	public List<Persona> obtenerPersonas();	
}
