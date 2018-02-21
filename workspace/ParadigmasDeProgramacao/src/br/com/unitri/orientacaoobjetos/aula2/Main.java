package br.com.unitri.orientacaoobjetos.aula2;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Jose", 18l);
	
		RegraNomeInvalido r1 = new RegraNomeInvalido();
		RegraIdadeInvalida r2 = new RegraIdadeInvalida();
		
		c.addRegra(r1);
		c.addRegra(r2);
		
		c.salvar();
	}
	
}

class RepositorioCliente {
	
	private static List<Cliente> clientes = new ArrayList<>();
	
	public static void add(Cliente cliente) {
		clientes.add(cliente);
	}
	
}

interface Regra {
	
	public void validar(Cliente cliente) throws RegraException;
	
}

class RegraNomeInvalido implements Regra {

	@Override
	public void validar(Cliente cliente) throws RegraException {
	
		if(cliente.getNome().isEmpty())
			throw new RegraException("Nome inválido");
	}
}

class RegraIdadeInvalida implements Regra {

	@Override
	public void validar(Cliente cliente) throws RegraException {
	
		if(cliente.getIdade() < 18)
			throw new RuntimeException("Idade inválida");
	}
}

class RegraException extends RuntimeException {
	
	public RegraException(String msg) {
		super(msg);
	}
	
}

class Cliente {
	
	private String nome;
	
	private Long idade;
	
	private List<Regra> regras = new ArrayList<>();
	
	public Cliente(String nome, Long idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void addRegra(Regra regra) {
		this.regras.add(regra);
	}
	
	public void salvar() {
		
		for(Regra r : regras) {
			
			r.validar(this);
			
		}
		
		RepositorioCliente.add(this);
		
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