package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.telas;

import java.util.Scanner;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio.Cliente;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.exceptions.IdadeInvalidaException;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.servicos.ClienteService;

public class TelaDeClientes implements Tela {
	
	private ClienteService servicos = new ClienteService();

	@Override
	public void renderizar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para cadastrar um novo cliente.");
		System.out.println("Digite 2 para remover um cliente.");
		System.out.println("Digite 3 para buscar um cliente.");
		System.out.println("Digite 4 para atualizar um cliente.");
		
		String entrada = sc.nextLine();
		
		if(entrada.equals("1")) {
			
			System.out.println("Digite o nome do cliente.");
			String nome = sc.nextLine();
			
			System.out.println("Digite a idade do cliente.");
			Integer idade = Integer.valueOf(sc.nextLine());
			
			System.out.println("Digite o telefone do cliente.");
			String telefone = sc.next();
			
			Cliente cliente = new Cliente();
			cliente.setIdade(idade);
			cliente.setNome(nome);
			cliente.setTelefone(telefone);
			
			try {
				cliente = servicos.salvar(cliente);
			} catch( IdadeInvalidaException e ) {
				
				//Corrigir problema
					
			}
			
			
			
			System.out.println(String.format("Cliente com o id %s, salvo com sucesso!", cliente.getId()));
			
		}
		
	}

}
