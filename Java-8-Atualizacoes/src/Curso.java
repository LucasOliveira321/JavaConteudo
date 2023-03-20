public class Curso{
    
    private String nome;
    private int tempo;

    public Curso(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getTempo(){
        return this.tempo;
    }

    @Override
    public String toString() {
        
        return "Curso: " + this.nome;
    }
}