package demo.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import demo.spring.dao.PersonaDao;
import demo.spring.model.Persona;

public interface PersonaMapper extends PersonaDao {
	//@Select("SELECT * FROM persona")
	public List<Persona> obtenerTodos();
	
	public void agregar(Persona p);
	public void modificar(Persona p);
	
	//@Select("SELECT * FROM persona WHERE id = #{id}")
	public Persona obtener(Integer id);
	

	@Delete("DELETE FROM persona WHERE id = #{id}")
	public void eliminar(Integer id);
}
