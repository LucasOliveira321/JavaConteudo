public class Conta {
	protected double saldo;
	private int agencia;
	private int conta;
	private static int total = 0;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	
}
