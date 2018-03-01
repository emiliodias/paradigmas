package br.com.unitri.orientacaoobjetos.aula5.oo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrientadoObjetos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomeProduto = sc.nextLine();
		double valorProduto = Double.valueOf(sc.nextLine());
		int idProduto = Integer.valueOf(sc.nextInt());
		
		Produto produto = new Produto(idProduto, nomeProduto, valorProduto);
		
		RepositorioDeProdutos repositorio = new RepositorioDeProdutos();
		
		Regra[] regras = {
				
				new Regra() {

					@Override
					public boolean validar(Produto produto) {
						
						if(nomeProduto.length() == 0)
						
							return false;
						
						return true;
					}
					
				},
				
				new Regra() {

					@Override
					public boolean validar(Produto produto) {
						
						if(valorProduto <= 0)
						
							return false;
						
						return true;
					}
					
				}
				
		};
		
		repositorio.salvar(produto, regras);
		
		repositorio.buscar(1);
		
	}

}

class RepositorioDeProdutos {
	
	private static Map<Integer, Produto> produtos = new HashMap<Integer, Produto>();
	
	public void salvar(Produto produto, Regra... regra) {
		
		for(Regra r : regra) {
			
			boolean eValido = r.validar(produto);
			
			if(eValido == false)
				throw new RuntimeException("Erro ao validar cadastro do produto.");
			
		}
		
		produtos.put(produto.getId(), produto);
		
	}
	
	public void buscar(int id) {
		
		Produto p = produtos.get(id);
		
		if(p != null) {
			
			System.out.println("Produto encontrado!");
			System.out.println("Valor do produto: " + p.getValor());
			
		}
		
	}
	
}

class Produto {
	
	private int id;
	private String nome;
	private double valor;
	
	public Produto(int id, String nome, double valor) {
		
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}

interface Regra {
	
	public boolean validar(Produto produto);
	
}