import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoLista2 {

	public static void main(String[] args) {
		
		Aulas aula1 = new Aulas("Teste1", 20);
		Aulas aula2 = new Aulas("Teste2", 15);
		Aulas aula3 = new Aulas("Teste3", 19);
		
		ArrayList<Aulas> curso1 = new ArrayList<>();
		
		curso1.add(aula1);
		curso1.add(aula2);
		curso1.add(aula3);
		
		System.out.println(curso1);
		
		Collections.sort(curso1, Comparator.comparing(Aulas::getTempo));
		
		System.out.println(curso1);
		
	}
}