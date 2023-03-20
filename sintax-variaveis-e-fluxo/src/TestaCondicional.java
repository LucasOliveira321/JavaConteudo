
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 16;
		int acompanhante = 1;
		if(idade >= 18) {
			System.out.println("Seja bem vindo!");
		} else {
			if(idade < 18 && acompanhante >= 2) {
				System.out.println("Você pode entrar");
			}else {
				System.out.println("Nao pode entrar!");
			}
		}
		
		
	}

}
