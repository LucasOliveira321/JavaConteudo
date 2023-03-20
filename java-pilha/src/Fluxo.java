
public class Fluxo {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try{
        	metodo2();
        }catch(NullPointerException | ArithmeticException | MinhaException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Problema " + msg);
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaException("deu muito errado!");      
        
//        System.out.println("Fim do metodo2");
    }

}
