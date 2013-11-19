package demo.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.business.PersonaBusiness;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("demo/spring/config/applicationContext.xml");
		PersonaBusiness personaBusiness = 
				context.getBean("personaBusiness", PersonaBusiness.class);
		
		System.out.println(personaBusiness.obtenerPersonas());
	}
}
