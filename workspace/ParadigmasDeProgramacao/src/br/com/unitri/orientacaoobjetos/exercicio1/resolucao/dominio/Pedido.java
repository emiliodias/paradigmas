package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	 private long id;
	 
	 private Cliente cliente;
	 
	 private List<Produto> produtos = new ArrayList<Produto>();
	 
	 private int valorTotal;
	 
	 private String data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}