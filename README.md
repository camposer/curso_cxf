curso_cxf
=========

Curso de CXF y MyBatis

Herramientas:
	- Java 7
	- Maven 2
	- Tomcat 7.X

Notas: 
	- Si debea utilizar Java 6, debe cambiar en el pom.xml los source y target del build y la versión de CXF a 2.6.X. Esto por compatibilidad con JAX-RS 2.0 (Java 7) o JAX-RS 1.1 (Java 6)
	- Compartidos ficheros de configuración de Eclipse

Cómo ejecutar:
	- SOAP
		http://localhost:8080/PersonaCXF/service/HelloWorld?wsdl
		http://localhost:8080/PersonaCXF/service/personaSoap?wsdl
		Cliente: demo.spring.gui.Principal (utiliza personaSoap)
	
	- REST
		http://localhost:8080/PersonaCXF/service/personas
		Cliente: WebContent/persona.html (http://localhost:8080/PersonaCXF/persona.html)

Cómo configurar:
1.- Descargar derby
2.- Levantar el RDBMS:
  C:\db-derby-10.10.1.1-bin\bin> startNetworkServer.bat
3.- Conectar el Eclipse (Database Development) al Derby (el Driver JDBC está en DERBY_HOME\lib\derbyclient.jar
4.- Ejecutar los scripts sql\create.sql y sql\insert.sql

