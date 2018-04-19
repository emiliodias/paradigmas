package br.com.unitri.orientacaoobjetos.exercicio1.resolucao;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.servicos.TelaNova;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.telas.Principal;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.telas.TelaDeClientes;

public class Main {

	public static void main(String[] args) {
		
		
		Principal.adicionarNovaOpcaoDeMenu(new TelaDeClientes(), "1");
		Principal.adicionarNovaOpcaoDeMenu(new Principal(), "abra por favor");
		Principal.adicionarNovaOpcaoDeMenu(new TelaNova(), "abra a nova tela por favor");
		
		new Principal().renderizar();
		
	}
	
}