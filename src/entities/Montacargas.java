package entities;

import java.util.*;

public class Montacargas {
	private Double pesoMaximo;
	private Double pesoTotal;
	private List<Carga> cargas;
	
	public Montacargas(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
		this.pesoTotal = 0.0;
		this.cargas = new ArrayList<Carga>();
	}
	
	
	public void agregarCarga(Carga nueva) {
		if(pesoTotal + nueva.getPeso() <= pesoMaximo) {
			pesoTotal += nueva.getPeso();
			cargas.add(nueva);
		}
	}
	
	
	//GETTERS Y SETTERS
	
	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}
	
	public Double getPesoTotal() {
		return pesoTotal;
	}
	
	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
