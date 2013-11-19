package demo.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.service.HelloWorld;
import demo.spring.service.PersonaServiceSoap;

public class PersonaSoapClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo/spring/config/applicationContext.xml");
		PersonaServiceSoap client = context.getBean("personaSoapClient", PersonaServiceSoap.class); // => Referencia a la SEI
		System.out.println(client.obtenerPersona(1));
	}
}
