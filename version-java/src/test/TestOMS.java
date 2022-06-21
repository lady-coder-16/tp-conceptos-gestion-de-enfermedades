package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Enfermedad;
import modelo.Medico;
import modelo.OMS;
import modelo.Paciente;
import modelo.Sintoma;

public class TestOMS {

	public static void main(String[] args) {
		OMS oms = new OMS();

		// Carga de Sintomas
		oms.agregar(new Sintoma("ictericia"));
		oms.agregar(new Sintoma("fatiga"));
		oms.agregar(new Sintoma("fiebre"));
		oms.agregar(new Sintoma("dolor de garganta"));
		oms.agregar(new Sintoma("perdida de apetito"));
		oms.agregar(new Sintoma("dolor de articulaciones"));
		oms.agregar(new Sintoma("tos"));
		oms.agregar(new Sintoma("perdida del gusto"));
		oms.agregar(new Sintoma("bultos"));
		oms.agregar(new Sintoma("molestia"));
		oms.agregar(new Sintoma("enrojecimiento"));
		oms.agregar(new Sintoma("sed"));
		oms.agregar(new Sintoma("miccion excesiva"));
		oms.agregar(new Sintoma("vision borrosa"));
		oms.agregar(new Sintoma("dificultad para respirar"));
		oms.agregar(new Sintoma("frecuencia cardiaca rapida"));
		oms.agregar(new Sintoma("respiracion corta"));
		oms.agregar(new Sintoma("opresion en el pecho"));

		// Carga de Enfemedades con sus respectivos sintomas
		oms.agregar(new Enfermedad("hepatitis", true));
		oms.agregar(new Enfermedad("sida", true));
		oms.agregar(new Enfermedad("dengue", true));
		oms.agregar(new Enfermedad("covid", true));
		oms.agregar(new Enfermedad("cancer de mama", false));
		oms.agregar(new Enfermedad("diabetes", false));
		oms.agregar(new Enfermedad("asma", false));
		oms.agregar(new Enfermedad("epoc", false));

		// Vinculacion enfermedades con sus sintomas
		oms.buscarEnfermedad("hepatitis").agregarSintoma(oms.buscarSintoma("ictericia"));
		oms.buscarEnfermedad("hepatitis").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("hepatitis").agregarSintoma(oms.buscarSintoma("fiebre"));

		oms.buscarEnfermedad("sida").agregarSintoma(oms.buscarSintoma("fiebre"));
		oms.buscarEnfermedad("sida").agregarSintoma(oms.buscarSintoma("dolor de garganta"));
		oms.buscarEnfermedad("sida").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("sida").agregarSintoma(oms.buscarSintoma("perdida de apetito"));

		oms.buscarEnfermedad("dengue").agregarSintoma(oms.buscarSintoma("dolor de articulaciones"));
		oms.buscarEnfermedad("dengue").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("dengue").agregarSintoma(oms.buscarSintoma("fiebre"));
		oms.buscarEnfermedad("dengue").agregarSintoma(oms.buscarSintoma("perdida de apetito"));

		oms.buscarEnfermedad("covid").agregarSintoma(oms.buscarSintoma("fiebre"));
		oms.buscarEnfermedad("covid").agregarSintoma(oms.buscarSintoma("tos"));
		oms.buscarEnfermedad("covid").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("covid").agregarSintoma(oms.buscarSintoma("perdida del gusto"));

		oms.buscarEnfermedad("cancer de mama").agregarSintoma(oms.buscarSintoma("bultos"));
		oms.buscarEnfermedad("cancer de mama").agregarSintoma(oms.buscarSintoma("molestia"));
		oms.buscarEnfermedad("cancer de mama").agregarSintoma(oms.buscarSintoma("enrojecimiento"));

		oms.buscarEnfermedad("diabetes").agregarSintoma(oms.buscarSintoma("sed"));
		oms.buscarEnfermedad("diabetes").agregarSintoma(oms.buscarSintoma("miccion excesiva"));
		oms.buscarEnfermedad("diabetes").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("diabetes").agregarSintoma(oms.buscarSintoma("vision borrosa"));

		oms.buscarEnfermedad("asma").agregarSintoma(oms.buscarSintoma("tos"));
		oms.buscarEnfermedad("asma").agregarSintoma(oms.buscarSintoma("dificultad para respirar"));
		oms.buscarEnfermedad("asma").agregarSintoma(oms.buscarSintoma("frecuencia cardiaca rapida"));
		oms.buscarEnfermedad("asma").agregarSintoma(oms.buscarSintoma("respiracion corta"));

		oms.buscarEnfermedad("epoc").agregarSintoma(oms.buscarSintoma("tos"));
		oms.buscarEnfermedad("epoc").agregarSintoma(oms.buscarSintoma("dificultad para respirar"));
		oms.buscarEnfermedad("epoc").agregarSintoma(oms.buscarSintoma("fatiga"));
		oms.buscarEnfermedad("epoc").agregarSintoma(oms.buscarSintoma("opresion en el pecho"));
		// ///////////////////////////////////////////////////////////////
		// Imprimir por consola
		System.out.println("\n----------- Lista de Enfermedades Cargadas-----------------");
		System.out.println(oms.getLstEnfermedades());
		System.out.println("\n----------- Lista de Sintomas Cargados-----------------");
		System.out.println(oms.getLstSintomas());

		System.out.println("\n-----------Buscar enfermedad por nombre-----------------");
		System.out.println(oms.buscarEnfermedad("diabetes"));
		System.out.println("\n-------------Buscar sintoma por nombre---------------");
		System.out.println(oms.buscarSintoma("tos"));

		System.out.println("\n-----------Traer enfermedades que contengan 'fiebre'-----------------");
		System.out.println(oms.traerEnfermedadesFiltradasPorSintoma("fiebre"));

		System.out.println("\n-----------Traer enfermedades contagiosas-----------------");
		System.out.println(oms.lstContagio(true));

		System.out.println("\n-----------Traer enfermedades NO contagiosas-----------------");
		System.out.println(oms.lstContagio(false));

		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////

		// Carga de Pacientes

		Paciente paciente1 = new Paciente("Ana", "Perez", LocalDate.of(2000, 02, 12), 12345678, null);
		Paciente paciente2 = new Paciente("Jose", "Perez", LocalDate.of(1980, 05, 10), 11112222, "Pami");
		Paciente paciente3 = new Paciente("Pamela", "Juarez", LocalDate.of(1999, 07, 03), 22221111, "Osde");

		// CargarEnfermedades a pacientes
		paciente1.agregarEnfermedad(oms.buscarEnfermedad("covid"));
		paciente1.agregarEnfermedad(oms.buscarEnfermedad("asma"));
		paciente2.agregarEnfermedad(oms.buscarEnfermedad("diabetes"));

		// Carga de Medicos
		Medico medico1 = new Medico("Jorge", "Hernandez", LocalDate.of(1969, 04, 06), 1111, "Cardiologo");
		Medico medico2 = new Medico("Maria", "Oliveira", LocalDate.of(1978, 07, 11), 1122, "Traumatologa");
		Medico medico3 = new Medico("Luisa", "Dominguez", LocalDate.of(1980, 02, 21), 1133, "Neurologa");

		///////////////////// Imprimir por consola///////////////////////
		System.out.println("\n-----------Info paciente 1-----------------");
		System.out.println(paciente1);

		System.out.println("\n-----------Tipo de identificacion de paciente 1-----------------");
		System.out.println(paciente1.tipoDeIdentificacion());

		System.out.println("\n-----------Calcular edad de paciente 1-----------------");
		System.out.println(paciente1.calcularEdad());

		System.out.println("\n-----------Info Medico 3-----------------");
		System.out.println(medico3);

		System.out.println("\n-----------Tipo de identificacion de Medico 3-----------------");
		System.out.println(medico3.tipoDeIdentificacion());

		System.out.println("\n-----------Calcular edad de Medico 3-----------------");
		System.out.println(medico3.calcularEdad());

		//Generamos lista de sintomas que tiene el paciente 3
		List<Sintoma> sintomasParaDiagnostico = new ArrayList<Sintoma>();
		sintomasParaDiagnostico.add(new Sintoma("tos"));

		paciente3.setSintomas(sintomasParaDiagnostico);

		System.out.println("\n-----------Diagnostico del Paciente 3-----------------");
		System.out.println(oms.posibleDiagnostico(paciente3));
	}

}
