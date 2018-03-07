package br.com.unitri.orientacaoobjetos.aula6;

import java.util.HashMap;
import java.util.Map;

public class Excecoes {
	
	private static Map<Long, Cliente> clientes = new HashMap<Long, Cliente>();
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setId(1l);
		c.setIdade(17l);
		c.setNome("Jose");
		
		try {
			cadastrarCliente(c);
		} catch (IdadeInvalidaException e) {
			// ERRO PODE SER TRATADO
			e.printStackTrace();
		}
		
		c = buscaClientePorId(2l);
		
		//Lança nullpointerexception
		System.out.println(c.getNome());
		
		//Nao encontra e nao captura excecao...
		buscaClientePorIdComTratamentoDeErro(2l);
		
		try {
			buscaClientePorIdComTratamentoDeErro(2l);
		} catch (Exception e) {
			System.out.println("Cliente não encontrado, forneça um identificador válido.");
		}
		
	}
	
	public static void cadastrarCliente(Cliente cliente) throws IdadeInvalidaException {
		
		if(cliente.getId() == null)
			return;
		
		if(cliente.getIdade() < 18)
			throw new IdadeInvalidaException();
		
		clientes.put(cliente.getId(), cliente);
		
	}

	public static Cliente buscaClientePorId(long id) {
		
		return clientes.get(id);
		
	}
	
	public static Cliente buscaClientePorIdComTratamentoDeErro(long id) {
		
		Cliente cliente = clientes.get(id);
		
		if(cliente == null)
			throw new ClienteNaoEncontradoException();
		
		return clientes.get(id);
		
	}
	
}

class Cliente {
	
	private Long id;
	
	private String nome;
	
	private Long idade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

class ClienteNaoEncontradoException extends RuntimeException {
	
}

class IdadeInvalidaException extends Exception {
	
}