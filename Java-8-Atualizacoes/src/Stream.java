import java.util.*;
import java.util.stream.Collectors;


public class Stream {
    public static void main(String[] args){
        
        List<Curso> cursos = new ArrayList<>();

        Curso java = new Curso("Java", 150);
        Curso python = new Curso("Python", 75);
        Curso rush = new Curso("Rush", 160);
        Curso javaScript = new Curso("JavaScript", 90);

        cursos.add(java);
        cursos.add(javaScript);
        cursos.add(rush);
        cursos.add(python);

        // Desta maneira é possível ordenar o Array de acordo com o critério necessário
        cursos.sort(Comparator.comparing(t -> t.getTempo()));
        System.out.println(cursos);

        // O stream é um metodo que possuí diversas ferramentas
        // como o filter, onde conseguimos filtrar uma list, e o forEach
        // Obs: o stream não modifica a list original
        cursos.stream()
            .filter(c -> c.getTempo() > 100)
            .forEach(c -> System.out.println(c.getNome()));


        // O metodo map pede uma função onde o resultado é um Integer (int)    
        cursos.stream()
            .filter(c -> c.getTempo() > 100)
            .map(c -> c.getTempo())
            .forEach(tempo -> System.out.println(tempo));
        
        // O metodo mapToInt possuí a função de somar um int    
        int somarTempoDeAula = cursos.stream()
            .filter(c -> c.getTempo() > 100)
            .mapToInt(c -> c.getTempo())
            .sum();
        System.out.println(somarTempoDeAula);

        // Como o stream não modifica a lista, caso queira organizar e modificar
        // a lista atual, é preciso utilizar o .collect(Collectors.toList())
        // toList é para transformar em uma lista, mais possuí outros formatos
        // que podem ser convertido a informação.
        cursos = cursos.stream()
            .filter(c -> c.getTempo() >= 100)
            .collect(Collectors.toList());
        System.out.println(cursos);

        /////////////////////////////////////////////////////////

        boolean a = cursos.stream()
        .anyMatch(c -> c.getTempo() > 1000);
        System.out.println(a);

        long b = cursos.stream().count();
        System.out.println(b);        
        
    }
}