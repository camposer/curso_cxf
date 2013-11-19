package demo.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.spring.service.HelloWorld;

public class HelloWorldClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo/spring/config/applicationContext.xml");
		HelloWorld client = context.getBean("helloClient", HelloWorld.class); // => Referencia a la SEI
		System.out.println(client.sayHi("Rodolfo"));
		System.out.println(client.sayHis());
	}
}
