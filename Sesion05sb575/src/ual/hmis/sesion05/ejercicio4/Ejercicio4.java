package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	
	public String intersectCadenas(String P1, String P2) {
		String resultado = "";
		for(String caracter : P1.split("")) {
			if(P2.contains(caracter)) {
				resultado += caracter;
			};
		}
		return resultado;
	}

}
