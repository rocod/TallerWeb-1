package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ListaDeTurnos;
import ar.edu.grupoesfera.cursospring.modelo.Persona;

@Controller
public class ControladorEjemplosBasicos {
	
	@RequestMapping(value="/home") //url
	public ModelAndView vista(){
		return new ModelAndView("VistaEjemplo1");//devuelve una vista
	}
	/*
	@RequestMapping(value="/inicio")
	public ModelAndView inicioConRP(){
		return new ModelAndView("PaginaRP");
	}
	*/
	
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
	
	/*
	@RequestMapping(value="/listado") //url
	public ModelAndView vistaListado(){
		return new ModelAndView("listado_turnos");//devuelve una vista
	}*/
	
	
	@RequestMapping(value="/solicita") //url
	public ModelAndView vistaSolicita(
			@RequestParam("especialidad") String especialidad,
			 @RequestParam("fecha") String fecha,
			 @RequestParam("horario") String horario
			){
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_especialidad", especialidad);
		modelo.put("clave_fecha", fecha);
		modelo.put("clave_horario", horario);
		modelo.put("persona", new Persona());
		
		return new ModelAndView("solicitar_turno",modelo);//devuelve una vista
	}
	
	@RequestMapping(value="/ej2_recibe", method = RequestMethod.POST)
	public ModelAndView crearPersona(@ModelAttribute Persona persona){
		ModelMap modelo = new ModelMap();
		modelo.put("clave_nombre", persona.getNombre());
		modelo.put("clave_apellido", persona.getApellido());
		return new ModelAndView("mostrar",modelo);
	}
	
	/*COMENZANDO CON EL PROYECTO*/
	
	@RequestMapping(value="/uno")
	public ModelAndView vista3(){
		return new ModelAndView("vista_uno","turno",new ListaDeTurnos().getLista().get(0));
	}
	
}
