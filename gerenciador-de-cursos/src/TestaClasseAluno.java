
public class TestaClasseAluno {

	public static void main(String[] args) {
		Aulas aula1 = new Aulas("Teste1", 20);
		Aulas aula2 = new Aulas("Teste2", 15);
		Aulas aula3 = new Aulas("Teste3", 19);
		
		Curso colecoes = new Curso("Lucas", "Coleciona");
		
		colecoes.adicionaAula(aula1);
		colecoes.adicionaAula(aula2);
		colecoes.adicionaAula(aula3);

		Aluno a1 = new Aluno("joao", 123456);
		Aluno a2 = new Aluno("batista", 321654);
		Aluno a3 = new Aluno("Silvino", 654321);
		
		colecoes.matriculaAluno(a1);
		colecoes.matriculaAluno(a2);
		colecoes.matriculaAluno(a3);
		
		System.out.println(colecoes.getAlunos());
		
		String veri = "joao";
		
		System.out.println(colecoes.getAlunos().equals(veri));
		
		
		
		
		
		
		
		
	}

}
