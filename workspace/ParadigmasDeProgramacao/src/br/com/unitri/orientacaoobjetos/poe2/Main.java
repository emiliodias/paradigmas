package br.com.unitri.orientacaoobjetos.poe2;

public class Main {
	
	static {
		
		EventLoopEventEngine.start();
		
		EventLoopEventEngine.subscribe("CADASTRO_PRODUTO", new CadastraProdutoListener());
		EventLoopEventEngine.subscribe("PROCESSA_PEDIDO", new ProcessaPedidoListener());

	}
	
	public static void main(String[] args) {
		
		
		for(int i=0; i< 1000; i++) {
		
			Produto produto = new Produto();
			produto.setId(1);
			
			Evento e = new Evento("CADASTRO_PRODUTO", produto, null, null);
			
			EventLoopEventEngine.publish(e);
			
			Pedido pedido = new Pedido();
			pedido.setId((long)i);
			
			e = new Evento("PROCESSA_PEDIDO", pedido, new Callback() {
				
				@Override
				public void callback(Object payload) {
					
					String valor = (String) payload;
					
					System.out.println("Valor retornado pelo listener:" + valor);
					
				}
			}, new Callback() {
				
				@Override
				public void callback(Object payload) {
					
					RuntimeException ex = (RuntimeException) payload;
					
					System.out.println("Erro retornado: " + ex.getMessage());
					
				}
			});
			
			EventLoopEventEngine.publish(e);
		
		}
		
		System.out.println("Thread principal finalizando...");
		
	}

}
