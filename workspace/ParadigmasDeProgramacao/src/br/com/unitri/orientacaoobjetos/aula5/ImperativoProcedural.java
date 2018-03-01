package br.com.unitri.orientacaoobjetos.aula5;

import java.util.Scanner;

public class ImperativoProcedural {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Produto[] produtos = new Produto[10];
		
		int count = 0;
		
		String nomeProduto = sc.nextLine();
		double valorProduto = Double.valueOf(sc.nextLine());
		int idProduto = Integer.valueOf(sc.nextInt());
		
		if( nomeProduto.length() == 0 ) {
			
			System.out.println("Você não informou o nome correto"
					+ "1");
			
		} else if (valorProduto <= 0) {
			
			System.out.println("Você não informou um valor válido!");
			
		} else {
			
			Produto produto = new Produto();
			produto.id = idProduto;
			produto.nome = nomeProduto;
			produto.valor = valorProduto;
			
			produtos[count] = produto;
			
			count = count + 1;
		}
		
		
		//Buscar produto com determinado id;
		for(int i = 0; i< count; i++) {
			if(produtos[i].nome.equals("TV")) {
				System.out.println("Produto encontrado!");
				System.out.println("Valor da TV: " + produtos[i].valor);
			}
			
		}
		
	}

	
	
}

class Produto {
	
	public int id;
	public String nome;
	public double valor;
	
}