
public class Aulas {

	private String titulo;
	private int tempo;
	
	public Aulas(String titulo, int tempo) {
		
		this.titulo = titulo;
		this.tempo = tempo;
		
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getTempo(){
		return this.tempo;
	}
	
	@Override
	public String toString() {
		return "(Aula: " + this.titulo + ", Tempo: " + this.tempo + " minutos.)";
	}
	
}
