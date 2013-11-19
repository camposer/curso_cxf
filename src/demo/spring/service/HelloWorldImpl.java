package demo.spring.service;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "demo.spring.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	@Override
	public List<String> sayHis() {
		return Arrays.asList(new String[] { "uno", "dos", "tres" });
	}

}
