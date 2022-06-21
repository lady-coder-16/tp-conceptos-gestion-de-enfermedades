package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
	private long dni;
	private String obraSocial;
	private List<Enfermedad> enfermedad = new ArrayList<Enfermedad>();
	private List<Sintoma> sintomas = new ArrayList<Sintoma>();

	public Paciente(String nombre, String apellido, LocalDate fechaDeNacimiento, long dni, String obraSocial) {
		super(nombre, apellido, fechaDeNacimiento);
		this.dni = dni;
		this.obraSocial = obraSocial;
	}

	public Paciente(String nombre, String apellido, LocalDate fechaDeNacimiento,long dni, String obraSocial,
			List<Sintoma> sintomas) {
		super(nombre, apellido, fechaDeNacimiento);
		this.dni = dni;
		this.obraSocial = obraSocial;
		this.sintomas = sintomas;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public List<Enfermedad> getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(List<Enfermedad> enfermedad) {
		this.enfermedad = enfermedad;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", obraSocial=" + obraSocial + ", enfermedad=" + enfermedad + ", sintomas="
				+ sintomas + "]";
	}

	@Override
	public String tipoDeIdentificacion() {
		return "Su tipo de Identificacion es a traves de su DNI.";
	}

	public void agregarEnfermedad(Enfermedad enfermedad) {
		getEnfermedad().add(enfermedad);
	}

	public void eliminarEnfermedad(Enfermedad enfermedad) {
		getEnfermedad().remove(enfermedad);
	}
	
}
