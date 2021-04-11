package ual.hmis.sesion05.ejercicio8;

import org.junit.*;
import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio8Test {
	
	@ParameterizedTest
	@MethodSource("ferryProvider")
	void ejercicio8Test(Ferry ferry, int totalVehiculos, boolean vacio, boolean superadoMaximoVehiculos, boolean superadoMaximoPeso, boolean superadoMaximoPasajeros) {
		
		
		assertNotNull(ferry);
		
		int numTotalVehiculos = ferry.totalVehiculos();
		boolean ferryVacio = ferry.vacio();
		boolean superaMaxVehiculos = ferry.superadoMaximoVehiculos();
		boolean superaMaxPeso = ferry.superadoMaximoPeso();
		boolean superaMaxPasajeros = ferry.superadoMaximoPasajeros();
		
		assertAll(
				
				()-> assertEquals(totalVehiculos, numTotalVehiculos),
				()-> assertSame(vacio, ferryVacio),
				()-> assertSame(superadoMaximoVehiculos, superaMaxVehiculos),
				()-> assertSame(superadoMaximoPeso, superaMaxPeso),
				()-> assertSame(superadoMaximoPasajeros, superaMaxPasajeros)
				);	

	}
	
	static Stream<Arguments> ferryProvider(){
		ArrayList<Vehiculo> listaVehiculos1 = new ArrayList<Vehiculo> ();
		ArrayList<Vehiculo> listaVehiculos2 = new ArrayList<Vehiculo> ();

		Vehiculo v1 = new Vehiculo();
		v1.setNumPasajeros(4);
		v1.setNumRuedas(4);
		v1.setPesoSinCarga(400);
		
		Vehiculo v2 = new Vehiculo(3, 4, 600);
		Vehiculo v3 = new Vehiculo(1, 2, 200);
		
		
		Ferry ferry1 = new Ferry();
		ferry1.setListaVehiculos(listaVehiculos1);
		ferry1.setMaxNumPasajeros(1200);
		ferry1.setMaxPesoVehiculos(300000);
		ferry1.setMaxTotalVehiculos(300);
		
		for(int i = 0; i < 100; i++) {
			ferry1.embarcarVehiculo(v1);
			ferry1.embarcarVehiculo(v2);
			ferry1.embarcarVehiculo(v3);
		}
		
		Ferry ferry2 = new Ferry(700, 110000, 250, listaVehiculos1);
		Ferry ferry3 = new Ferry(1200, 300000, 300, listaVehiculos2);
		
		return Stream.of(
				Arguments.of(ferry1, 300, false, false, false, false),
				Arguments.of(ferry2, 300, false, true, true, true),
				Arguments.of(ferry3, 0, true, false, false, false)
				);
		
	}
}
