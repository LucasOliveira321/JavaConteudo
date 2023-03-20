
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 11750.50;
		
		int valor = (int)salario;
		System.out.println(valor);
		 
		long numeroGrande = 13513513213l;
		short numeroPequeno = 2131;
		byte b = 127;
		
		System.out.println(numeroGrande);
		System.out.println(numeroPequeno);
		System.out.println(b);
	}
}
