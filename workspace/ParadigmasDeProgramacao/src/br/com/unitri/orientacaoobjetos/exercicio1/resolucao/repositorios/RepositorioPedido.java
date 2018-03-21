package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.repositorios;

import java.util.HashMap;
import java.util.Map;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio.Pedido;

public class RepositorioPedido {

	private Map<Long, Pedido> pedidos = new HashMap<Long, Pedido>();
	
	private static long id;
	
	public Pedido buscar(long id) {
		
		return pedidos.get(id);
		
	}
	
	public Pedido salvar(Pedido pedido) {
		
		long id = nextId();
		
		pedido.setId(nextId());
		
		this.pedidos.put(id, pedido);
		
		return pedido;
		
	}
	
	public void remover(int id) {
		
		this.pedidos.remove(id);
		
	}
	
	public void atualizar(Pedido pedido) {
		
		this.pedidos.put(pedido.getId(), pedido);
		
	}
	
	private long nextId() {
		
		return id++;
		
	}
}