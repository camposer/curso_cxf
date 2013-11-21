package demo.spring.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ordenador")
public class Ordenador {
	Integer id;
	String nombre;
	String serial;
	Persona persona;
	
	public Ordenador() { }

	public Ordenador(Integer id, String nombre, String serial) {
		this.id = id;
		this.nombre = nombre;
		this.serial = serial;
	}
	
	public Ordenador(String nombre, String serial) {
		this(null, nombre, serial);
	}	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", nombre=" + nombre + ", serial="
				+ serial + "]";
	}
}
