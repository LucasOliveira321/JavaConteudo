import java.util.*;

public class Curso {
	
	private String instrutor;
	private String nomeDoCurso;
	private List<Aulas> aulas = new ArrayList<Aulas>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaDoAluno = new HashMap<>();
	
	public Curso(String instrutor, String nomeDoCurso) {
		this.instrutor = instrutor;
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}
	
	public Set getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	// o metodo "unmodifiableList", é utilizado para não deixar alterar
	// diretamente no atributo da classe, desta maneira não é possível
	// utilizar o .add ou .remove
	public List<Aulas> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	
	public void adicionaAula(Aulas aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for(Aulas i : aulas) {
			tempoTotal += i.getTempo();
		}
		return tempoTotal;	
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int matricula) {
		return this.matriculaDoAluno.get(matricula);
	}
	
	public void matriculaAluno(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaDoAluno.put(aluno.getNumeroMatricula(), aluno);
	}

}
