package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

public class Ejercicio10Test {

	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@MethodSource("cadenaProvider")

	
	void testTransformar(String input, Short expected) {
		Ejercicio10 c = new Ejercicio10();
		assertEquals(expected, c.convertirCadenaEntero((input)));
		//assertTrue(c.transformar(input)==expected);
	}
	
	
	static Stream<Arguments> cadenaProvider(){
		
		
		return Stream.of(
				Arguments.of("-5", (short)-5),
				Arguments.of("+300", (short)300),
				Arguments.of("500", (short)500),
				Arguments.of("-20", (short)-20),
				Arguments.of("-32767", (short)-32767),
				Arguments.of("2 3 5", null),
				Arguments.of("32768",  null),
				Arguments.of("B3",  null),
				Arguments.of("3.5",  null)
				);
	}
}
