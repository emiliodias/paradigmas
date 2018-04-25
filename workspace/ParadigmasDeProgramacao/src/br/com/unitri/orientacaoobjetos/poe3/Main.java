package br.com.unitri.orientacaoobjetos.poe3;

public class Main {

	static {

		EventLoopEventEngine.start();

		EventLoopEventEngine.subscribe("CADASTRO_PRODUTO", new CadastraProdutoListener());
		EventLoopEventEngine.subscribe("PROCESSA_PEDIDO", new ProcessaPedidoListener());
		EventLoopEventEngine.subscribe("CADASTRO_PRODUTO_CALLBACK", new CadastraProdutoCallbackListener());

	}

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.setNome("TV");
		produto.setQuantidadeEstoque(10);

		Evento e = new Evento("CADASTRO_PRODUTO", produto, new Callback("CADASTRO_PRODUTO_CALLBACK"));

		EventLoopEventEngine.publish(e);

		Pedido pedido = new Pedido();
		pedido.setId(1l);

		e = new Evento("PROCESSA_PEDIDO", pedido);

		EventLoopEventEngine.publish(e);

		System.out.println("Thread principal finalizando...");

	}

}
