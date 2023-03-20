import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoLista3 {

	public static void main(String[] args) {
		
		Aulas aula1 = new Aulas("Teste1", 20);
		Aulas aula2 = new Aulas("Teste2", 15);
		Aulas aula3 = new Aulas("Teste3", 19);
		
		Curso colecoes = new Curso("Lucas", "Coleciona");
		
		colecoes.adicionaAula(aula1);
		colecoes.adicionaAula(aula2);
		colecoes.adicionaAula(aula3);
		
		System.out.println(colecoes.getAulas());
		System.out.println(colecoes.getTempoTotal());
	}
}