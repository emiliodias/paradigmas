package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.telas;

import java.util.Scanner;

public class Principal implements Tela {

	@Override
	public void renderizar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo ao sistema de compras!!!");
		
		System.out.println("Digite 1 para gerenciar seus clientes.");
		System.out.println("Digite 2 para gerenciar seus produtos.");
		System.out.println("Digite 3 para gerenciar seus pedidos.");
		
		String entrada = sc.nextLine();
		
		if(entrada.equals("1")) {
			
			new TelaDeClientes().renderizar();
			
		}
		
	}

}
