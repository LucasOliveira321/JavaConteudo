
public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Precisa informar o nome.");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}
	
	@Override
	public String toString() {
		
		return "Nome : " + this.nome + ", Registro: " + this.numeroMatricula + ".";
		
	}

}
