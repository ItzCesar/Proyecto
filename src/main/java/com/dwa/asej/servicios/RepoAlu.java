package com.dwa.asej.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.asej.modelo.Solialumno;

public interface RepoAlu extends CrudRepository<Solialumno, Integer>{
	@Query(value = "SELECT * FROM solialumno WHERE ncontrol = ?1", nativeQuery = true)
	ArrayList<Solialumno> mostrarsoli(String ncontrol);
}
