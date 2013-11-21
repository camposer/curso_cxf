package demo.spring.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import demo.spring.business.PersonaBusiness;
import demo.spring.model.Persona;

@Produces({ "application/json" })
@Consumes({ "application/json", "application/xml" })
public class PersonaService {
	private PersonaBusiness personaBusiness;

	/**
	 * Ej. GET /personas
	 * @return
	 */
	@GET
	@Path("")
	public List<Persona> obtenerPersonas() {
		return personaBusiness.obtenerPersonas();
	}

	/**
	 * Ej. GET /personas/1
	 * @return
	 */
	@GET
	@Path("/{id}")
	public Persona obtenerPersona(@PathParam("id") Integer id) {
		return personaBusiness.obtenerPersona(id);
	}
	
	/**
	 * POST /personas
	 * @return
	 */
	@POST
	@Path("")
	public void agregarPersona(Persona p) { // El framework hace la traducción JSON - Persona automáticamente
		personaBusiness.agregarPersona(p);
	}
	
	/**
	 * PUT /personas
	 * @return
	 */
	@PUT
	@Path("")
	public void modificarPersona(Persona p) { // El framework hace la traducción JSON - Persona automáticamente
		personaBusiness.modificarPersona(p);
	}

	/**
	 * PUT /personas
	 * @return
	 */
	@DELETE
	@Path("/{id}")
	public void eliminarPersona(@PathParam("id") Integer id) {
		personaBusiness.eliminarPersona(id);
	}

	public PersonaBusiness getPersonaBusiness() {
		return personaBusiness;
	}

	public void setPersonaBusiness(PersonaBusiness personaBusiness) {
		this.personaBusiness = personaBusiness;
	}

}
