package modelo;

import java.util.ArrayList;
import java.util.List;

public class OMS {
	private List<Sintoma> lstSintomas = new ArrayList<Sintoma>();
	private List<Enfermedad> lstEnfermedades = new ArrayList<Enfermedad>();

	public OMS() {
	}

	public List<Sintoma> getLstSintomas() {
		return lstSintomas;
	}

	public void setLstSintomas(List<Sintoma> lstSintomas) {
		this.lstSintomas = lstSintomas;
	}

	public List<Enfermedad> getLstEnfermedades() {
		return lstEnfermedades;
	}

	public void setLstEnfermedades(List<Enfermedad> lstEnfermedades) {
		this.lstEnfermedades = lstEnfermedades;
	}

	@Override
	public String toString() {
		return "OMS [lstSintomas=" + lstSintomas + ", lstEnfermedades=" + lstEnfermedades + "]";
	};

	public void agregar(Sintoma sintoma) {
		if (!lstSintomas.contains(sintoma)) {
			lstSintomas.add(sintoma);
		} else {
			System.out.println("Sintoma existente");
		}
	}

	public void agregar(Enfermedad enfermedad) {
		if (!lstEnfermedades.contains(enfermedad)) {
			lstEnfermedades.add(enfermedad);
		} else {
			System.out.println("Sintoma existente");
		}
	}

	public void eliminar(Sintoma sintoma) {
		if (lstSintomas.contains(sintoma)) {
			lstSintomas.remove(sintoma);
		}
		if (lstSintomas == null) {
			System.out.println("Lista de sintomas Vacia.");
		} else {
			System.out.println("sintoma no existente");
		}
	}

	public void eliminar(Enfermedad enfermedad) {
		if (lstEnfermedades.contains(enfermedad)) {
			lstEnfermedades.remove(enfermedad);
		}
		if (lstEnfermedades == null) {
			System.out.println("Lista de sintomas Vacia.");
		} else {
			System.out.println("sintoma no existente");
		}
	}

	public boolean sintomaPerteneceAEnfermedad(String nombreSintoma) {
		boolean encontrado = false;
		for (Enfermedad enfermedad : lstEnfermedades) {
			for (Sintoma s : enfermedad.getSintomas()) {
				if (s.getNombre().equals(nombreSintoma)) {
					encontrado = true;
				}
			}
		}
		return encontrado;
	}

	public List<Enfermedad> traerEnfermedadesFiltradasPorSintoma(String nombreSintoma) {

		List<Enfermedad> lstEnfermedadesCoincidentes = new ArrayList<Enfermedad>();
		List<Sintoma> listadoDeSusSintomas = new ArrayList<Sintoma>();
		for (Enfermedad enfermedad : lstEnfermedades) {
			listadoDeSusSintomas = enfermedad.getSintomas();
			for (Sintoma s : listadoDeSusSintomas) {
				if (s.getNombre()==nombreSintoma) {
					lstEnfermedadesCoincidentes.add(enfermedad);
				}
			}
		}
		return lstEnfermedadesCoincidentes;
	}

	public Enfermedad buscarEnfermedad(String nombre) {

		Enfermedad e = new Enfermedad();
		for (Enfermedad enfermedad : lstEnfermedades) {
			if (enfermedad.getNombre().equals(nombre)) {
				e = enfermedad;
			}
		}
		return e;
	}

	public Sintoma buscarSintoma(String nombre) {

		Sintoma s = new Sintoma();
		for (Sintoma sintoma : lstSintomas) {
			if (sintoma.getNombre().equals(nombre)) {
				s = sintoma;
			}
		}
		return s;
	}

	public List<Enfermedad> lstContagio(boolean isContagiosa) {
		List<Enfermedad> resultado = new ArrayList<Enfermedad>();
		for (Enfermedad enfermedad : lstEnfermedades) {
			if (enfermedad.isContagioso() == isContagiosa) {
				resultado.add(enfermedad);
			}
		}
		return resultado;
	}

	public List<Enfermedad> posibleDiagnostico(Paciente paciente){
		
		List<Enfermedad> posiblesEnfermedades = new ArrayList<Enfermedad>();
		for (Enfermedad e :  lstEnfermedades) {
				if(e.getSintomas().containsAll(paciente.getSintomas())) {
					posiblesEnfermedades.add(e);
				}
		}
		if (posiblesEnfermedades.size() == 1) {
			paciente.agregarEnfermedad(posiblesEnfermedades.get(0));
		}
		return posiblesEnfermedades;
	}
}

