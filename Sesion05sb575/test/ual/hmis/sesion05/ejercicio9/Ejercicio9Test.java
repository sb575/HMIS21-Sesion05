package ual.hmis.sesion05.ejercicio9;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio9Test {
	
	@ParameterizedTest
	@MethodSource("cadenaProvider")
	void Ejercicio9Test(ArrayList<String> cadenaOrdenada1, ArrayList<String> cadenaOrdenada2, ArrayList<String> cadenaOrdenadaResultado) {
		Ejercicio9 e = new Ejercicio9();
		ArrayList<String> resultado = e.listaCadenasOrdenadas(cadenaOrdenada1, cadenaOrdenada2);
		
		assertAll(
				()-> assertEquals(resultado, cadenaOrdenadaResultado)
				
				);
		
	}
	
	static Stream<Arguments> cadenaProvider(){
		ArrayList<String> c1 = new ArrayList<String>(Arrays.asList("a", "b", "c", "e"));
		ArrayList<String> c2 = new ArrayList<String>(Arrays.asList("b", "e", "f"));
		
		ArrayList<String> c3 = new ArrayList<String>(Arrays.asList("b", "e"));
		
		
		return Stream.of(
				Arguments.of(c1, c2, c3)
				
				);

		
		

		
	}

}
