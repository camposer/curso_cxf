curso_cxf
=========

Curso de CXF y MyBatis

Nota: Compartidos ficheros de configuración de Eclipse

Herramientas:
	- Maven
	- Tomcat

Cómo ejecutar:
	- SOAP
		http://localhost:8080/PersonaCXF/service/HelloWorld?wsdl
		http://localhost:8080/PersonaCXF/service/personaSoap?wsdl
		Cliente: demo.spring.gui.Principal (utiliza personaSoap)
	
	- REST
		http://localhost:8080/PersonaCXF/service/personas
		Cliente: WebContent/persona.html (http://localhost:8080/PersonaCXF/persona.html)


