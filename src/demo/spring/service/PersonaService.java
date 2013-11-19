package demo.spring.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import demo.spring.model.Persona;

@Produces({ "application/json" })
public class PersonaService {
	@GET
	@Path("")
	public List<Persona> getPersonas() {
		return Arrays.asList(new Persona[] {
			new Persona("Rodolfo", "Campos"),
			new Persona("Oscar", "Cano"),
		});
	}
}
