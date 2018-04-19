package br.com.unitri.orientacaoobjetos.poe;

public class Evento {
	
	private String type;
	
	private Object payload;
	
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

}