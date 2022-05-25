package com.dwa.asej.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dwa.asej.modelo.Soliadmin;
import com.dwa.asej.modelo.Solialumno;
import com.dwa.asej.modelo.Soliprofe;
import com.dwa.asej.servicios.ServicioAdministrador;
import com.dwa.asej.servicios.ServicioAlumno;
import com.dwa.asej.servicios.ServicioProfesor;
import com.dwa.asej.servicios.ServicioUsuario;

class Alumno{
    static String control;
}

@Controller
public class UsuarioController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	@Autowired
	ServicioAlumno servicioalumno;
	@Autowired
	ServicioProfesor servicioprofesor;
	@Autowired
	ServicioAdministrador servicioadministrador;
	
	@GetMapping(path= {"/usuario/validar", "/"})
	public String validar()
	{
		return "usuario/validar";
	}
	
	@PostMapping("/usuario/validar")
	public String validar(@RequestParam("curp")String curp, @RequestParam("clave") String clave,@RequestParam("rango") String rango, Model modelo)
	{
		boolean res = servicioUsuario.validar(curp, clave);
		if(rango.equals("Alumno"))
		{
			if(res)
			{
				return "redirect:/alumno/solicitud";
			}
		}
		else
		{
			if(rango.equals("Profesor"))
			{
				if(res)
				{
					return "redirect:/profesor/solicitud";
				}
			}
			else
			{
				if(res)
				{
					return "redirect:/administrador/solicitud";
				}
			}
		}
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		modelo.addAttribute("curp", curp);
		modelo.addAttribute("clave", clave);
		modelo.addAttribute("rango", rango);
		return "/usuario/validar";
	}
	
	@GetMapping("/alumno/solicitud")
	public String agregar(Model model)
	{
		model.addAttribute("usuario", new Solialumno());
		return "alumno/solicitud";
	}
	
	@PostMapping("/alumno/solicitud")
	public String agregar(Model modelo,@RequestParam("ncontrol") String ncontrol, @ModelAttribute Solialumno soli)
	{
		boolean res= servicioalumno.agregar(soli);
		Alumno.control= ncontrol;
		if(res)
		{
			return "redirect:/alumno/listar";
		}
		modelo.addAttribute("error", servicioalumno.getMensaje());
		return "/alumno/solicitud";
	}
	
	@GetMapping("/alumno/listar")
	public String detalles(Model modelo)
	{
		String ncontrol= Alumno.control;
		Iterable<Solialumno> replicas = servicioalumno.filtrarPorTema(ncontrol);
		if(replicas!=null && replicas.iterator().hasNext())
		{
			modelo.addAttribute("replicas", replicas);
		}
		else
		{
			modelo.addAttribute("error", "Aun no hay replicas registradas...");
		}
		return "alumno/listar";
	}
	
	@GetMapping("/profesor/solicitud")
	public String agregarpro(Model model)
	{
		model.addAttribute("usuario", new Soliprofe());
		return "profesor/solicitud";
	}
	
	@PostMapping("/profesor/solicitud")
	public String agregarpro(Model modelo,@RequestParam("ntrabajador") String ntrabajador, @ModelAttribute Soliprofe soli)
	{
		boolean res= servicioprofesor.agregar(soli);
		Alumno.control= ntrabajador;
		if(res)
		{
			return "redirect:/profesor/listar";
		}
		modelo.addAttribute("error", servicioalumno.getMensaje());
		return "/profesor/solicitud";
	}
	
	@GetMapping("/profesor/listar")
	public String detallespro(Model modelo)
	{
		String ntrabajador= Alumno.control;
		Iterable<Soliprofe> replicas = servicioprofesor.filtrarPorTema(ntrabajador);
		if(replicas!=null && replicas.iterator().hasNext())
		{
			modelo.addAttribute("replicas", replicas);
		}
		else
		{
			modelo.addAttribute("error", "Aun no hay replicas registradas...");
		}
		return "profesor/listar";
	}
	
	@GetMapping("/administrador/solicitud")
	public String agregaradmin(Model model)
	{
		model.addAttribute("usuario", new Soliadmin());
		return "administrador/solicitud";
	}
	
	@PostMapping("/administrador/solicitud")
	public String agregaradmin(Model modelo, @ModelAttribute Soliadmin soli)
	{
		boolean res= servicioadministrador.agregar(soli);
		if(res)
		{
			return "redirect:/administrador/listar";
		}
		modelo.addAttribute("error", servicioalumno.getMensaje());
		return "/administrador/solicitud";
	}
	
	@GetMapping("/administrador/listar")
	public String detallesadmin(Model modelo)
	{
		Iterable<Soliadmin> replicas = servicioadministrador.verTodos();
		if(replicas!=null && replicas.iterator().hasNext())
		{
			modelo.addAttribute("replicas", replicas);
		}
		else
		{
			modelo.addAttribute("error", "Aun no hay solicitudes registradas...");
		}
		return "administrador/listar";
	}
}
