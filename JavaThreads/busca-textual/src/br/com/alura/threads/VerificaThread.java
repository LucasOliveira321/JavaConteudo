package br.com.alura.threads;

public class VerificaThread {
	
	public static void main(String[] args) {
		
	Thread thr1 = new Thread(new ImprimirNumero("Thread 1"));
	Thread thr2 = new Thread(new ImprimirNumero("Thread 2"));
	
	thr1.start();
	thr2.start();
	
	}

}
