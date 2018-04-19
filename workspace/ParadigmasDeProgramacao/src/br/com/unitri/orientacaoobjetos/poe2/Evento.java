package br.com.unitri.orientacaoobjetos.poe2;

public class Evento {
	
	private String type;
	
	private Object payload;
	
	private Callback onSuccess;
	
	private Callback onError;
	
	public Evento(String type, Object payload, Callback onSuccess, Callback onError) {
		
		this.type = type;
		this.payload = payload;
		this.onSuccess = onSuccess;
		this.onError = onError;
		
	}

	public String getType() {
		return type;
	}

	public Object getPayload() {
		return payload;
	}

	public Callback getOnSuccess() {
		return onSuccess;
	}

	public Callback getOnError() {
		return onError;
	}

}