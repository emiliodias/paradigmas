package br.com.unitri.orientacaoobjetos.poe3;

import java.util.Date;
import java.util.List;


public class Pedido {
	
	private Long id;
	
	private Date data;
	
	private List<Produto> produtos;
	
	private Long valorTotal;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Long getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Long valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}