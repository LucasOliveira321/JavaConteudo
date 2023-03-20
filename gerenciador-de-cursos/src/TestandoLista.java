import java.util.ArrayList;

public class TestandoLista {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Tranbalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		
		// "aula" é uma variavel utilizada para representar os valores que serão acessados
		// dentro do array "aulas".
		for(String aula: aulas) {
			
			System.out.println("Aula: "+ aula+ ".");
			
		}
		// para saber o tamanho de um array que é importado de uma coleção como o java.util
		// utilizamos o ".size" ao invés do ".length"
		System.out.println(aulas.size());
		
		// Lambda é expressa com os caracteries " -> ", normalmente utilizado
		// em funções curtas, o primeiro parâmetro "aula", é uma varievel
		// utilizada para percorrer o array, após a seta, é o que será executado
		aulas.forEach(aula -> {
			System.out.println("Aula:");
			System.out.println(aula);
		});
		
		

	}
}
