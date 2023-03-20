import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) throws Exception {
        
        List<String> nomes = new ArrayList<>();

        nomes.add("lucas");
        nomes.add("joao");
        nomes.add("maria");
        nomes.add("josefina");

        // Para realizar a ordenação de uma lista é utilizado
        // o metodo sort, onde ele pede como argumento um Comparator
        // Já o Comparator possuí alguns metodos e um deles é o comparing
        // este metodo pede como um argumento uma função, no exemplo abaixo
        // foi utilizado um Lambda, com a variavel nome, onde que para cada
        // nome, compara o tamanho do nome e organiza o ArrayList

        nomes.sort(Comparator.comparing(nome -> nome.length()));
        System.out.println(nomes);


/////////////////////////////////////////////////////////////////////////

        // Podemos imprimir os valores do ArrayList dando um new em uma varivel de Consumer
        // como podemos ver abaixo
        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
            
        };
        nomes.forEach(consumidor);

        // Ou utilizar o Lambda e reduzir par apenas uma linha
        // onde que para cada s imprime no terminar o valor de s
        // no lambda ele identifica automaticamente o tipo da variavel
        // e como está sendo utilizado somente um argumento na função após a flecha
        // não precisa de chaves.
        nomes.forEach(s -> System.out.println(s));
    }
}