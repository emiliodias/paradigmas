package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.telas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.campos.CampoDeTextoDeNomeDoCliente;

public class Principal implements Tela {

	private static Map<String, Tela> telas = new HashMap<String, Tela>();
	
	public static void adicionarNovaOpcaoDeMenu(Tela tela, String nome) {
		
		telas.put(nome, tela);
		
	}
	
	@Override
	public void renderizar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo ao sistema de compras!!!");
		
		System.out.println("Digite 1 para gerenciar seus clientes.");
		System.out.println("Digite 2 para gerenciar seus produtos.");
		System.out.println("Digite 3 para gerenciar seus pedidos.");
		
		CampoDeTextoDeNomeDoCliente campo1 = new CampoDeTextoDeNomeDoCliente();
		campo1.renderizar();
		
		String entrada = sc.nextLine();
		
		Tela tela = telas.get(entrada);
		
		if(tela == null) {
			System.out.println("Opção inválida!");
		} else {
			tela.renderizar();
		}
		
	}

}

interface  Relogio {
	
	public abstract void marcaHora();
	
}

interface Radio {
	
	public abstract void toca();
	
}

class Relogio2 implements Relogio {

	@Override
	public void marcaHora() {
		// TODO Auto-generated method stub
		
	}
	
}

class RadioRelogio implements Radio, Relogio {

	@Override
	public void marcaHora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toca() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

