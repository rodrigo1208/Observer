package br.com.rodrigo.observer;

import br.com.rodrigo.observer.model.Cliente;
import br.com.rodrigo.observer.model.Empresa;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Empresa empresa = new Empresa();
		
		Estado estado = new Estado();
		
		estado.addObserver(cliente)
			  .addObserver(empresa)
			  .alteraEstado("Esperando pagamento");
		
		System.out.println(cliente.toString());
		System.out.println(empresa.toString());
		
		estado.alteraEstado("Realizando pagamento");
		
		System.out.println(cliente.toString());
		System.out.println(empresa.toString());
		
		estado.alteraEstado("Pago");
		
		System.out.println(cliente.toString());
		System.out.println(empresa.toString());
		
		
	}
	
}
