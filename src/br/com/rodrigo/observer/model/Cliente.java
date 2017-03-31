package br.com.rodrigo.observer.model;

import br.com.rodrigo.observer.EstadoObserver;

public class Cliente implements EstadoObserver{

	private String estado;
	
	@Override
	public void update(String estado) {
		this.estado = estado;
	}
	
	public String getEstado(){
		return this.estado;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.estado;
	}
	
}
