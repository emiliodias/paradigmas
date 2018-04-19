package br.com.unitri.orientacaoobjetos.poe2;

public class ProcessaPedidoListener implements EventListener {

	@Override
	public void onRecieve(Evento evento) {
		
		Pedido p = (Pedido) evento.getPayload();
		
		System.out.println("Iniciando processamento do pedido: " + p.getId());
		
		
		if(p.getId() % 2 == 0) {
		
			Callback callback = evento.getOnSuccess();
		
			callback.callback("Pedido processado com sucesso");
			
		} else {
			
			Callback error = evento.getOnError();
			
			RuntimeException ex = new RuntimeException("O id é inválido!!!");
			
			error.callback(ex);
			
		}
		
	}

}
