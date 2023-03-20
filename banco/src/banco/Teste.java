package banco;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner nome = new Scanner(System.in);
		System.out.print("Nome: ");
		String nomeUser = nome.nextLine();
		
		Scanner num = new Scanner(System.in);
		System.out.print("Numero da conta: ");
		int numero = num.nextInt();
		
		Scanner age = new Scanner(System.in);
		System.out.print("Agencia: ");
		String agencia = age.nextLine();	
		
		Scanner sal = new Scanner(System.in);
		System.out.print("Saldo: ");
		int saldo = sal.nextInt();
		
		Conta s = new Conta(nomeUser,numero,agencia,saldo);
		
		System.out.println(s);
		
		System.out.print("Sacar: ");
		Scanner sac = new Scanner(System.in);
		int sacar = sac.nextInt();
		
		s.saca(sacar);
		
		System.out.println("Seu saldo agora e R$ " + s.getSaldo());
		
		System.out.print("Deposite um valor: ");
		Scanner dep = new Scanner(System.in);
		int deposita = dep.nextInt();
		
		s.deposita(deposita, numero, agencia);
		
		System.out.println("Seu saldo atual e: " + s.getSaldo());
		System.out.println("Seu rendimento do que tem de saldo na conta e: " + s.rendimento());
		
	}

}
