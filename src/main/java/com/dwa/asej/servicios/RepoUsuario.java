package com.dwa.asej.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.asej.modelo.Usuario;


public interface RepoUsuario extends CrudRepository<Usuario, Integer>{
	@Query(value= "SELECT * FROM usuario WHERE curp= ?1 AND claveacceso= ?2", nativeQuery= true)
	Usuario validar(String curp, String claveacceso);
}
