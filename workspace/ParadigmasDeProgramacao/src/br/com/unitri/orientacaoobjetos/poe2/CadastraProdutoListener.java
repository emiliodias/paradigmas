package br.com.unitri.orientacaoobjetos.poe2;

public class CadastraProdutoListener implements EventListener {

	@Override
	public void onRecieve(Evento evento) {
		
		Produto p = (Produto) evento.getPayload();
		
		System.out.println("Iniciando cadastro do produto: " + p.getId());
		
	}

}
