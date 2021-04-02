package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	private int maxNumPasajeros;
	private int maxPesoVehiculos;
	private int maxTotalVehiculos;
	private int numTotalPasajeros;
	private int numTotalVehiculos;
	private int pesoTotalVehiculos;
	private ArrayList<Vehiculo> listaVehiculos;
	
	public Ferry() {
		
	}
	
	public Ferry(int maxNumPasajeros, int maxPesoVehiculos, int maxTotalVehiculos,
			ArrayList<Vehiculo> listaVehiculos) {
		super();
		this.maxNumPasajeros = maxNumPasajeros;
		this.maxPesoVehiculos = maxPesoVehiculos;
		this.maxTotalVehiculos = maxTotalVehiculos;
		this.listaVehiculos = listaVehiculos;
	}
	
	



	public int getMaxNumPasajeros() {
		return maxNumPasajeros;
	}
	public void setMaxNumPasajeros(int maxNumPasajeros) {
		this.maxNumPasajeros = maxNumPasajeros;
	}
	public int getMaxPesoVehiculos() {
		return maxPesoVehiculos;
	}
	public void setMaxPesoVehiculos(int maxPesoVehiculos) {
		this.maxPesoVehiculos = maxPesoVehiculos;
	}
	public int getMaxTotalVehiculos() {
		return maxTotalVehiculos;
	}
	public void setMaxTotalVehiculos(int maxTotalVehiculos) {
		this.maxTotalVehiculos = maxTotalVehiculos;
	}
	
	
	public int getNumTotalPasajeros() {
		numTotalPasajeros = 0;
		for(Vehiculo v : getListaVehiculos()) {
			numTotalPasajeros += v.getNumPasajeros();
		}
		return numTotalPasajeros;
	}
	
	public int getNumTotalVehiculos() {
		numTotalVehiculos = listaVehiculos.size();
		return numTotalVehiculos;
	}
	
	public int getPesoTotalVehiculos() {
		pesoTotalVehiculos = 0;
		for(Vehiculo v: listaVehiculos) {
			pesoTotalVehiculos += v.getPesoSinCarga();
		}
		return pesoTotalVehiculos;
	}
	
	
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	
	
	/**
	 * Embarca un vehículo añadiéndolo a la lista
	 * @param Vehiculo v
	 * @return
	 */
	public boolean embarcarVehiculo(Vehiculo v) {
		
		return listaVehiculos.add(v);
	}
	
	/**
	 * Devuelve el número total de vehículos embarcados 
	 * @return
	 */
	public int totalVehiculos() {
		return listaVehiculos.size();
	}
	
	/**
	 * Verdadero si no hay ningún vehículo
	 * @return
	 */
	public boolean vacio() {
		return listaVehiculos.isEmpty();
	}
	
	/**
	 * Verdadero si el número total de los vehículos supera el máximo
	 * @return
	 */
	public boolean superadoMaximoVehiculos() {
		
		return getNumTotalVehiculos() > getMaxTotalVehiculos();
	}
	
	/**
	 * Verdadero si el peso total de los vehículos supera el máximo
	 * @return
	 */
	public boolean superadoMaximoPeso() {
		
		return getPesoTotalVehiculos() > getMaxPesoVehiculos();
	}
	
	/**
	 * Verdadero si el numero total de pasajeros supera el máximo
	 * @return
	 */
	public boolean superadoMaximoPasajeros() {
		
		return getNumTotalPasajeros() > getMaxNumPasajeros();
	}
}

