package modelo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaDeNacimiento;
	
	
	public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}
	
	abstract String tipoDeIdentificacion();
	
	public int calcularEdad() {
		Period periodo=Period.between(fechaDeNacimiento, LocalDate.now());
		return periodo.getYears();
		
	}
}
