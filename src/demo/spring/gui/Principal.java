package demo.spring.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.business.PersonaBusiness;
import demo.spring.model.Persona;

public class Principal {
	private PersonaBusiness personaBusiness;
	private Scanner scanner;
	
	public Principal() {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo/spring/config/applicationContext.xml");
		personaBusiness = context.getBean("personaBusiness", PersonaBusiness.class);
		scanner = new Scanner(System.in);
	}
	
	public void agregar() {
		System.out.println("Nombre? ");
		String nombre = scanner.nextLine();
		System.out.println("Apellido? ");
		String apellido = scanner.nextLine();
		System.out.println("Fecha de Nacimiento (yyyy-MM-dd)? ");
		String sfechaNacimiento = scanner.nextLine();
		
		Date fechaNacimiento = new Date();
		try {
			fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(sfechaNacimiento);
		} catch (ParseException e) { }
		
		Persona p = new Persona(nombre, apellido, fechaNacimiento);
		
		personaBusiness.agregarPersona(p);
	}

	public void modificar() {
		System.out.println("Id? ");
		String sid = scanner.nextLine();
		System.out.println("Nombre? ");
		String nombre = scanner.nextLine();
		System.out.println("Apellido? ");
		String apellido = scanner.nextLine();
		System.out.println("Fecha de Nacimiento (yyyy-MM-dd)? ");
		String sfechaNacimiento = scanner.nextLine();
		
		Date fechaNacimiento = new Date();
		try {
			fechaNacimiento = new SimpleDateFormat("yyyy-MM-dd").parse(sfechaNacimiento);
		} catch (ParseException e) { }
		
		Persona p = new Persona(Integer.parseInt(sid), nombre, apellido, fechaNacimiento);
		
		personaBusiness.modificarPersona(p);
	}
	
	public void eliminar() {
		System.out.println("Id? ");
		String sid = scanner.nextLine();

		personaBusiness.eliminarPersona(Integer.parseInt(sid));
	}
	
	public void obtener() {
		System.out.println("Id? ");
		String sid = scanner.nextLine();

		imprimir(
				Arrays.asList(new Persona[] {
					personaBusiness.obtenerPersona(Integer.parseInt(sid))
				})
			);
	}

	public void obtenerTodos() {
		imprimir(personaBusiness.obtenerPersonas());
	}

	public void imprimir(List<Persona> personas) {
		for (Persona p : personas) {
			System.out.println(p);
		}
	}
	
	public void iniciar() {
		while (true) {
			System.out.println();
			System.out.println("1. Agregar persona");
			System.out.println("2. Modificar persona");
			System.out.println("3. Eliminar persona");
			System.out.println("4. Obtener persona");
			System.out.println("5. Obtener todas las personas");
			System.out.println("? ");
			
			String opcion = scanner.nextLine(); 
	
			if (opcion.equals("1")) 
				agregar();
			else if (opcion.equals("2"))
				modificar();
			else if (opcion.equals("3"))
				eliminar();
			else if (opcion.equals("4"))
				obtener();
			else if (opcion.equals("5"))
				obtenerTodos();
		}
	}
	
	public static void main(String[] args) {
		new Principal().iniciar();
	}

}
