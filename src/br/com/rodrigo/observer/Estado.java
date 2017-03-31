package br.com.rodrigo.observer;

import java.util.ArrayList;
import java.util.List;

public class Estado {

	private String estadoAtual;
	private List<EstadoObserver> observers;
	
	public Estado() {
		this.observers = new ArrayList<>();
	}
	
	public Estado addObserver(EstadoObserver observer){
		this.observers.add(observer);
		return this;
	}
	
	public Estado removeObserver(EstadoObserver observer){
		this.observers.remove(observer);
		return this;
	}
	
	public Estado alteraEstado(String estado){
		this.estadoAtual = estado;
		notificaObervers();
		return this;
	}
	
	private void notificaObervers(){
		observers.forEach(obs->{
			obs.update(estadoAtual);
		});
	}
	
	
}
