package demo.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import demo.spring.model.Persona;

public interface PersonaMapper {
	@Select("SELECT * FROM persona")
	public List<Persona> obtenerTodos();
}
