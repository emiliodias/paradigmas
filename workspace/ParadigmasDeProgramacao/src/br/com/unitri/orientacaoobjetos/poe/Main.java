package br.com.unitri.orientacaoobjetos.poe;

public class Main {

	static {

		EventLoopEventEngine.start();

		EventLoopEventEngine.subscribe("CADASTRO_PRODUTO", new CadastraProdutoListener());
		EventLoopEventEngine.subscribe("PROCESSA_PEDIDO", new ProcessaPedidoListener());

	}

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.setId(1);

		Evento e = new Evento("CADASTRO_PRODUTO", produto);

		EventLoopEventEngine.publish(e);

		Pedido pedido = new Pedido();
		pedido.setId(1l);

		e = new Evento("PROCESSA_PEDIDO", pedido);

		EventLoopEventEngine.publish(e);

		System.out.println("Thread principal finalizando...");

	}

}
