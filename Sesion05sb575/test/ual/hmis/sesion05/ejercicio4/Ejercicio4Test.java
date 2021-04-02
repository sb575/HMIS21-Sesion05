package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

public class Ejercicio4Test {
	
	@ParameterizedTest(name = "{index} => la interseccion de ({0}) con ({1}) sale {2}")
	@CsvSource ({"abc, adfc, ac"})
	void testInterseccion_parametrized(String P1, String P2, String expected) {
		Ejercicio4 ejercicio4 = new Ejercicio4();
		assertEquals(expected, ejercicio4.intersectCadenas(P1, P2));
	}

}
