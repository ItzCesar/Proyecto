package com.dwa.asej.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.asej.modelo.Soliadmin;

public interface RepoAdmin extends CrudRepository<Soliadmin, Integer>{
	@Query(value = "SELECT * FROM soliadmin WHERE materia = ?1", nativeQuery = true)
	ArrayList<Soliadmin> mostrarsoli(String materia);
}
