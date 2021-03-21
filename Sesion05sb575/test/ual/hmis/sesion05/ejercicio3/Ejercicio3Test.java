package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;


public class Ejercicio3Test {

	@ParameterizedTest (name = "{num} => Con numero ({1}) sale {*****}")
	@CsvSource ({"1, *****"})
	void testAsteriscos_parametrized(int num, String expected) {
		Ejercicio3 ejercicio3 = new Ejercicio3();
		assertEquals(expected, ejercicio3.devolverAsteriscos(num));
	}
}
