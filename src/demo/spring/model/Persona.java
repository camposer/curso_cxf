package demo.spring.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")
public class Persona {
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private List<Ordenador> ordenadores;

	public Persona() {
	}
	
	public Persona(Integer id, String nombre, String apellido, Date fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona(String nombre, String apellido) {
		this(null, nombre, apellido, null);
	}

	public Persona(String nombre, String apellido, Date fechaNacimiento) {
		this(null, nombre, apellido, fechaNacimiento);
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Ordenador> getOrdenadores() {
		return ordenadores;
	}

	public void setOrdenadores(List<Ordenador> ordenadores) {
		this.ordenadores = ordenadores;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", ordenadores=" + ordenadores + "]";
	}	
}
