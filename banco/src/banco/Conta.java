package banco;

import java.time.LocalDate;
import java.util.Scanner;

public class Conta {
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura = LocalDate.now().toString();
	private double rendimento = 0.1;
	
	public Conta(String nome, int numero, String agencia, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void deposita(int valor, int numero,String agencia ) {
		if(this.numero == numero && this.agencia == agencia) {
			this.saldo += valor;
		}
	}
	
	public void saca(int valor) {
		if(getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo -= valor;
		}
	}
	
	public double rendimento() {
		return this.rendimento = this.saldo * this.rendimento;
	}
	
	@Override
	public String toString() {
		return  "\n Nome: " + this.nome + 
				"\n Numero: " + this.numero +
				"\n Agencia: " + this.agencia +
				"\n Saldo: " + this.saldo + 
				"\n Data de abertura: " + this.dataDeAbertura;
	}

}

