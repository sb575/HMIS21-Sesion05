package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30)
			return false;
		// llamar al m�todo de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD
	(String username, String password){
		// m�todo mock (simulado)
		if (username.equals("user") && password.equals("pass"))
			return true;
		else
			return false;
	}
}