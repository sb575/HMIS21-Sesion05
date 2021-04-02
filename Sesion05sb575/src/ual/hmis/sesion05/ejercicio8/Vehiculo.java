package ual.hmis.sesion05.ejercicio8;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private int pesoSinCarga;
	
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int numPasajeros, int numRuedas, int pesoSinCarga) {
		super();
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.pesoSinCarga = pesoSinCarga;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public int getPesoSinCarga() {
		return pesoSinCarga;
	}
	public void setPesoSinCarga(int pesoSinCarga) {
		this.pesoSinCarga = pesoSinCarga;
	}
	
	
}
