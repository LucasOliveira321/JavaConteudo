package br.com.alura.threads;

public class ImprimirNumero implements Runnable{

	private String thr;
	
	public ImprimirNumero(String thread) {
		this.thr = thread;
	}
	
	@Override
	public void run() {
		int i = 1;
		
		while( i < 100) {
			System.out.println(this.thr + ": " + i);
			i++;
		}
		
	}

}
