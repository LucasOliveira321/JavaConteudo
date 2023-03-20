package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {
	
	private String nomeDoArquivo;
	private String nome;
	
	public TarefaBuscaNome(String nomeDoArquivo, String nome) {
		this.nomeDoArquivo = nomeDoArquivo;
		this.nome = nome;
	}
	
	@Override
	public void run() {
		try {
		Scanner sc = new Scanner(new File(nomeDoArquivo));
		
		int numeroLinha = 1;
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			if(linha.contains(this.nome)) {
				System.out.println(this.nomeDoArquivo + " - " + numeroLinha + " - " + linha + ".");
			}
			numeroLinha++;
		}
		
		}catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	

}
