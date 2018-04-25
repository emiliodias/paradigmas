package br.com.unitri.orientacaoobjetos.poe3;

public class CadastraProdutoCallbackListener implements EventListener {

	@Override
	public void onRecieve(Evento evento) {
		
		Produto p = (Produto) evento.getPayload();
		
		System.out.println("Id do produto cadastrados: " + p.getId());
		
	}

}
