package demo.spring.service;
 
import java.util.List;

import javax.jws.WebService;
 
@WebService
public interface HelloWorld {
    String sayHi(String text);
    List<String> sayHis();
}