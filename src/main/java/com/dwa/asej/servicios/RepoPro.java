package com.dwa.asej.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.asej.modelo.Soliprofe;

public interface RepoPro extends CrudRepository<Soliprofe, Integer>{
	@Query(value = "SELECT * FROM soliprofe WHERE ntrabajador = ?1", nativeQuery = true)
	ArrayList<Soliprofe> mostrarsoli(String ntrabajador);
}
