package ar.edu.grupoesfera.cursospring.modelo;

public class Turno {
	private String disponible;
	private String nombre_doctor;
	private String especialidad;
	private String fecha;
	private String horario;
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String getNombre_doctor() {
		return nombre_doctor;
	}
	public void setNombre_doctor(String nombre_doctor) {
		this.nombre_doctor = nombre_doctor;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
