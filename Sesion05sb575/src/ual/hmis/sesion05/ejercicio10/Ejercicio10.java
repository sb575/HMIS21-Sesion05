package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	
	public Short convertirCadenaEntero(String cadena) {
		Short entero;
		try {
			
			entero = Short.valueOf(cadena);
		} catch (Exception e) {
			entero = null;
		}
		
		return entero;
		
	}

}
