
public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try{
        	metodo2();
        }catch(NullPointerException | ArithmeticException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Problema " + msg);
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            double a = 1/0;
            Conta cc = null;
            cc.getSaldo();
        }
        System.out.println("Fim do metodo2");
    }

}
