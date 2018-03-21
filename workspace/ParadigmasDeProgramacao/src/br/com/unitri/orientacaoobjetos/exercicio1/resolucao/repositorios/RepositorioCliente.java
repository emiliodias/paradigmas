package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.repositorios;

import java.util.HashMap;
import java.util.Map;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio.Cliente;

public class RepositorioCliente {

	private Map<Long, Cliente> clientes = new HashMap<Long, Cliente>();
	
	private static long id;
	
	public Cliente buscar(long id) {
		
		return clientes.get(id);
		
	}
	
	public Cliente salvar(Cliente cliente) {
		
		long id = nextId();
		
		cliente.setId(nextId());
		
		this.clientes.put(id, cliente);
		
		return cliente;
		
	}
	
	public void remover(int id) {
		
		this.clientes.remove(id);
		
	}
	
	public void atualizar(Cliente cliente) {
		
		this.clientes.put(cliente.getId(), cliente);
		
	}
	
	private long nextId() {
		
		return id++;
		
	}
}