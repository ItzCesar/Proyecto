package com.dwa.asej.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.asej.modelo.Usuario;

@Service
public class ServicioUsuario {
	@Autowired
	private RepoUsuario repousu;
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje= mensaje;
	}
	
	public boolean validar(String curp, String clave)
	{
		Usuario usr= repousu.validar(curp,clave);
		if(usr !=null)
		{
			return true;
		}
		Mensaje= "Datos de acceso incorrecto";
		return false;
	}
}
