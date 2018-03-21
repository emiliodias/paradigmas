package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.repositorios;

import java.util.HashMap;
import java.util.Map;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio.Produto;

public class RepositorioProduto {

	private Map<Long, Produto> produtos = new HashMap<Long, Produto>();
	
	private static long id;
	
	public Produto buscar(long id) {
		
		return produtos.get(id);
		
	}
	
	public Produto salvar(Produto produto) {
		
		long id = nextId();
		
		produto.setId(nextId());
		
		this.produtos.put(id, produto);
		
		return produto;
		
	}
	
	public void remover(int id) {
		
		this.produtos.remove(id);
		
	}
	
	public void atualizar(Produto produto) {
		
		this.produtos.put(produto.getId(), produto);
		
	}
	
	private long nextId() {
		
		return id++;
		
	}
}