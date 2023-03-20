
public class TestaLaço {
	public static void main(String[] args) {
		
		for(int multiplicador = 1;multiplicador <= 10; multiplicador++) {
			
			System.out.println("Tabuada do " + multiplicador);
			
			for(int multiplicado = 1; multiplicado <= 10; multiplicado++) {
				
				int resultado = multiplicador * multiplicado;
				System.out.println(multiplicador + " X " + multiplicado + " = " + resultado);	
			}
			
		}
	}
}
