package br.com.unitri.orientacaoobjetos.aula2.procedural;

import java.util.ArrayList;
import java.util.List;

public class Procedural {

	public static void main(String[] args) {
		
		RepositorioCliente repositorio = new RepositorioCliente();
		
		Cliente cliente = new Cliente("Cliente 1", 50l);
		
		if(cliente.getNome().isEmpty())
			throw new RegraException("Nome inválido");
		
		else if(cliente.getIdade() < 18)
			throw new RuntimeException("Idade inválida");
		
		else
			repositorio.add(cliente);
		
		
	}
	
}

class RepositorioCliente {
	
	private static List<Cliente> clientes = new ArrayList<>();
	
	public static void add(Cliente cliente) {
		clientes.add(cliente);
	}
	
}

class Cliente {
	
	private String nome;
	
	private Long idade;
	
	public Cliente(String nome, Long idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}
	
}

class RegraException extends RuntimeException {
	
	public RegraException(String msg) {
		super(msg);
	}
	
}