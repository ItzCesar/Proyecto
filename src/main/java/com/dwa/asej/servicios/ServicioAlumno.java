package com.dwa.asej.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.asej.modelo.Solialumno;


@Service
public class ServicioAlumno {
	@Autowired
	private RepoAlu repoeje;
	
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje= mensaje;
	}
	
	public boolean agregar(Solialumno u)
	{
		try
		{
			repoeje.save(u);
			this.Mensaje= "Datos de la solicitud fueron almacenados con exito";
			return true;
		}
		catch(Exception e)
		{
			this.Mensaje= "Error al registrar la solicitud";
			return false;
		}
	}
	
	public Iterable<Solialumno> filtrarPorTema(String ncontrol)
	{
		try
		{
			this.Mensaje="";
			return repoeje.mostrarsoli(ncontrol);
		}
		catch (Exception e)
		{
			this.Mensaje= e.getMessage();
			return null;
		}
	}
}
