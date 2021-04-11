package ual.hmis.sesion05.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
		
	public  String devolverAsteriscos(int num) {
		String asteriscos = "";
		if (num < 0) {

			asteriscos = "número erróneo";

		} else if (num < 5) {

			asteriscos = "*****";

		} else if (num > 12) {

			asteriscos = "************";

		} else {

			for (int i = 0; i < num; i++) {
				asteriscos += "*";
			}

		}

		return asteriscos;
	}
}
