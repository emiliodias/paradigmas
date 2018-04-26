package br.com.unitri.orientacaoobjetos.poe3;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class EventLoopEventEngine {
	
	private static Queue<Evento> eventos = new LinkedBlockingQueue<Evento>();
	
	private static Map<String, EventListener> listeners = new HashMap<>();

	public static void publish(Evento evento) {
		
		eventos.add(evento);
		
	}
	
	public static void subscribe(String type, EventListener eventListener) {
		
		listeners.put(type, eventListener);
		
	}
	
	public static void start() {
		
		new Thread() {
			
			public void run() {
				
				while(true) {
					
					Evento evento = eventos.poll();
					
					if(evento != null) {
						
						EventListener listener = listeners.get(evento.getType());
						
						if(listener != null) {
							
							new Thread() {
								
								public void run() {
							
									listener.onRecieve(evento);
									
								}
								
							}.start();
							
						}
						
					}
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
			
		}.start();
		
	}
	
}