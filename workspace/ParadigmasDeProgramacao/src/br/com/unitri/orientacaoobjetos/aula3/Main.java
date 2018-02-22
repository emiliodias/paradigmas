package br.com.unitri.orientacaoobjetos.aula3;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Gerente", 100.0);
		
		Supervisor supervisor = new Supervisor("Supervisor", 80.0);
		
		Analista analista = new Analista("Analista", 60.0);
		
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		
		folhaPagamento.calculaPagamentoFuncionario(gerente);
		folhaPagamento.calculaPagamentoFuncionario(supervisor);
		folhaPagamento.calculaPagamentoFuncionario(analista);

		AnalistaFormadoEmComputacao analistaComputacao =  new AnalistaFormadoEmComputacao("Analista Computação", 60.0);
		
		folhaPagamento.calculaPagamentoFuncionario(analistaComputacao);
		
	}
	
}

class FolhaPagamento {
	
	public void calculaPagamentoFuncionario(Funcionario funcionario) {
		
		Double beneficios = 100.0;
		
		Double salario = funcionario.calculaSalario() + beneficios;
		
		System.out.println("Salário do Funcionário: " + salario);
		
	}
	
}

/**
 *  @author emiliodias
 *
 * Classe Funcionário que modela de forma abstrata o 
 * que de fato é um funcionário. Perceba o "abstract" na 
 * declaração da classe.
 * 
 * Perceba que o método calculaSalario também é abstrato 
 * e não possui um corpo(implementação).
 * 
 * As classes Gerente, Supervisor e Analista são implementações
 * concretas e possuem cada uma a lógica adequada para o método 
 * calculaSalario();
 *
 */
abstract class Funcionario {
	
	protected String nome;;
	
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public abstract Double calculaSalario();
	
}

/**
 * @author emiliodias
 *
 * O gerente 
 *
 */

class Gerente extends Funcionario {

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double calculaSalario() {
		
		this.salario = this.salario * 1.4;
		
		return this.salario;
		
	}

}

class Supervisor extends Funcionario {

	public Supervisor(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double calculaSalario() {
		
		this.salario = this.salario * 1.2;
		
		return this.salario;
		
	}

}

class Analista extends Funcionario {

	public Analista(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double calculaSalario() {
		
		this.salario = this.salario * 1.1;
		
		return this.salario;
		
	}

}

/*
 * Complementando a funcionalidade do método Analista. Perceba que
 * o cálculo do salário do Analista pode ser alterado, sem
 * alterarmos de fato o cálculo original.
 */

class AnalistaFormadoEmComputacao extends Analista {

	public AnalistaFormadoEmComputacao(String nome, Double salario) {
		super(nome, salario);
	}
	
	@Override
	public Double calculaSalario() {
		
		Double salario = super.calculaSalario();
		
		salario = salario + ( salario * 0.8 );
		
		return salario;
		
	}
	
}