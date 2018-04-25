package br.com.unitri.orientacaoobjetos.poe3;

public class Evento {
	
	private String type;
	
	private Object payload;
	
	private Callback callback;
	
	public Evento(String type, Object payload, Callback callback) {
		
		this.type = type;
		this.payload = payload;
		this.callback = callback;
		
	}
	
	public Evento(String type, Object payload) {
		
		this.type = type;
		this.payload = payload;
		
	}

	public String getType() {
		return type;
	}

	public Object getPayload() {
		return payload;
	}

	public Callback getCallback() {
		return callback;
	}

}