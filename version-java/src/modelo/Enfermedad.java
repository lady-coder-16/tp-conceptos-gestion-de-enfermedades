package modelo;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad {

	private String nombre;
	private boolean contagioso;
	private List<Sintoma> sintomas = new ArrayList<Sintoma>();

	public Enfermedad() {
	}

	public Enfermedad(String nombre, boolean contagioso) {
		super();
		this.nombre = nombre;
		this.contagioso = contagioso;
	}

	public Enfermedad(String nombre, boolean contagioso, List<Sintoma> sintomas) {
		super();
		this.nombre = nombre;
		this.contagioso = contagioso;
		this.sintomas = sintomas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isContagioso() {
		return contagioso;
	}

	public void setContagioso(boolean contagioso) {
		this.contagioso = contagioso;
	}

	@Override
	public String toString() {
		return "\nEnfermedad [nombre= " + nombre + ", contagioso= " + contagioso + ", Sintomas" + getSintomas() + "]\n";
	}

	public void agregarSintoma(Sintoma sintoma) {
		if (!sintomas.contains(sintoma)) {
			sintomas.add(sintoma);
		} else {
			System.out.println("Sintoma existente");
		}
	}

	public void eliminarSintoma(Sintoma sintoma) {
		if (sintomas.contains(sintoma)) {
			sintomas.remove(sintoma);
		}
		if (sintomas == null) {
			System.out.println("Lista de sintomas Vacia.");
		} else {
			System.out.println("sintoma no existente");
		}
		
	}

}
