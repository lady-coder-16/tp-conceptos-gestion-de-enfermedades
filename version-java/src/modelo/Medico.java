package modelo;

import java.time.LocalDate;

public class Medico extends Persona{
	
	private long matricula;
	private String especialidad;
	
	public Medico(String nombre, String apellido, LocalDate fechaDeNacimiento, long matricula, String especialidad) {
		super(nombre, apellido, fechaDeNacimiento);
		this.matricula = matricula;
		this.especialidad = especialidad;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Paciente [nombre="+nombre+", apellido=" + apellido +", fechaDeNacimiento=" + fechaDeNacimiento+", matricula=" + matricula + ", especialidad="+ especialidad +"]";
	}

	@Override
	public String tipoDeIdentificacion() {
		return "Su tipo de Identificacion es a traves de su Matricula.";
	}
}
