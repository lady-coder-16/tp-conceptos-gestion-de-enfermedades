package modelo;

import java.util.List;

public class Sintoma {

	private String nombre;
	private List<Enfermedad> enfermedades;

	public Sintoma() {
	}

	public Sintoma(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}

	@Override
	public String toString() {
		return "\n\tSintoma [nombre= " + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Sintoma)obj).getNombre()==this.nombre;
	}

	public void agregarEnfermedad(Enfermedad enfermedad) {
		if (!enfermedades.contains(enfermedad)) {
			enfermedades.add(enfermedad);
		} else {
			System.out.println("Sintoma existente");
		}
	}

	public void eliminarEnfermedad(Enfermedad enfermedad) {
		if (enfermedades.contains(enfermedad)) {
			enfermedades.remove(enfermedad);
		}
		if (enfermedades == null) {
			System.out.println("Lista de sintomas Vacia.");
		} else {
			System.out.println("sintoma no existente");
		}	
	}
}
