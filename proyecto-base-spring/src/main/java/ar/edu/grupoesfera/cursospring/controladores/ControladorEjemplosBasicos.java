package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Modelo.Persona;



@Controller
public class ControladorEjemplosBasicos {
	
	@RequestMapping(value="/home") //url
	public ModelAndView vista(){
		return new ModelAndView("VistaEjemplo1");//devuelve una vista
	}
	
	@RequestMapping(value="/lista")
	public ModelAndView listar_turnos(){
		return new ModelAndView("listado_turnos");
	}

	
	@RequestMapping(value="/inicio")
	public ModelAndView inicioConRP(@RequestParam("nombre") String n,
			 @RequestParam("apellido") String a){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", n);
		modelo.put("clave_apellido", a);
		return new ModelAndView("PaginaRP",modelo);
	}
	
	@RequestMapping(value="/inicio/{nombre}/tallerweb/{apellido}")
	public ModelAndView inicioConPV(@PathVariable String nombre,
			 @PathVariable String apellido){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", nombre);
		modelo.put("clave_apellido", apellido);
		return new ModelAndView("PaginaPV",modelo);
	}
	
	
	//Ejemplo 3 Envia parametros por POST
	@RequestMapping(value="/formulario")
	public ModelAndView vista3(){
		return new ModelAndView("VistaEjemplo3","persona",new Persona());
	}
	
	
	//Ejemplo 3, Recibe y Envia parametros por POST
	@RequestMapping(value="/ej2_recibe", method = RequestMethod.POST)
	public ModelAndView crearPersona(@ModelAttribute Persona persona){
		ModelMap modelo = new ModelMap();
		modelo.put("clave_nombre", persona.getNombre());
		modelo.put("clave_apellido", persona.getApellido());
		return new ModelAndView("ResultadoEjemplo3",modelo);
	}
	
}
