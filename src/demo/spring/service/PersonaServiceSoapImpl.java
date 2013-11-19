package demo.spring.service;

import java.util.List;

import javax.jws.WebService;

import demo.spring.business.PersonaBusiness;
import demo.spring.model.Persona;

@WebService(endpointInterface = "demo.spring.service.PersonaServiceSoap")
public class PersonaServiceSoapImpl implements PersonaServiceSoap {
	private PersonaBusiness personaBusiness;
	
	@Override
	public void agregarPersona(Persona p) {
		personaBusiness.agregarPersona(p);
	}

	@Override
	public void modificarPersona(Persona p) {
		personaBusiness.modificarPersona(p);
	}

	@Override
	public void eliminarPersona(Integer id) {
		personaBusiness.eliminarPersona(id);
	}

	@Override
	public Persona obtenerPersona(Integer id) {
		Persona pers = personaBusiness.obtenerPersona(id);
		return pers;
	}

	@Override
	public List<Persona> obtenerPersonas() {
		List<Persona> lpers = personaBusiness.obtenerPersonas();
		return lpers;
	}

	public PersonaBusiness getPersonaBusiness() {
		return personaBusiness;
	}

	public void setPersonaBusiness(PersonaBusiness personaBusiness) {
		this.personaBusiness = personaBusiness;
	}
	
	
}
