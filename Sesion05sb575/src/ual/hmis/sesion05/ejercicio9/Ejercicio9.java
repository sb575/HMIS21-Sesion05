package ual.hmis.sesion05.ejercicio9;

import java.util.ArrayList;

public class Ejercicio9 {
	
	public ArrayList<String> listaCadenasOrdenadas(ArrayList<String> cadenaOrdenada1, ArrayList<String> cadenaOrdenada2) {
		ArrayList<String> cadenaOrdenadaResultado = new ArrayList<String>();;
		
		for(String s : cadenaOrdenada1) {
			if(cadenaOrdenada2.contains(s)) {
				cadenaOrdenadaResultado.add(s);
			}
		}
		return cadenaOrdenadaResultado;
	}

}
