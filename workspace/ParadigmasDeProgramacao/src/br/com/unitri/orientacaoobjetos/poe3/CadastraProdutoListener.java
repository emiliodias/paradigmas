package br.com.unitri.orientacaoobjetos.poe3;

public class CadastraProdutoListener implements EventListener {

	@Override
	public void onRecieve(Evento evento) {
		
		System.out.println("Cadastrando o produto..");
		
		Produto p = (Produto) evento.getPayload();
		
		p.setId(1l);
		
		evento = new Evento("CADASTRO_PRODUTO_CALLBACK", p);
		
		EventLoopEventEngine.publish(evento);
		
	}

}