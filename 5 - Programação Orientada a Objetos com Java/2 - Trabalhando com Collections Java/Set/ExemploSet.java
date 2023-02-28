import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        // formas de inicializar uma Set
        //Set notas = new HashSet<>(); // usava-se essa formas antes do java 5
        //HashSet<Double> notas = new HashSet<>();
        //Set<Double> notas = new HashSet<>(Arrays.asList(7d, 2.5, 63.2, 8d, 42.0));
        //Set<Double> notas = new HashSet<>(); // Generics (jdk5) - Diamont Operator (jdk7)
        //Set<Double> notas = Set.of(4d, 2.9, 6.4, 9d, 6.22, 9.0);
        
        Set<Double> notas1 = new HashSet<>(Arrays.asList(6.2, 2.5, 7.2, 5.0, 4.0));
        // Usando o HashSet não fica ordenado(Ordem Aleatoria) e os valores duplicados só exibe uma vez

        System.out.println(notas1);

        // System.out.println("Exiba a posição da nota 5.0: "); 
        // não é possivel fazer com o HashSet pois ele guarda os valores aleatorios, até tem, pórem não com um método

        // System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // não é possivel fazer isso com o hash set, pois ele não tem buscador de posição

        // System.out.println("Substitua a nota 5.0 pela nota 6.0");
        // também não é possivel com o HashSet

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas1.contains(5.0));
        // isso é possivel, usando o método "Contains"

        // System.out.println("Exiba a terceira nota adicionada: ");
        // também não é possivel, pois o HashSet não tem a funcionalidade Get

        System.out.println("Exiba a maior nota: " + Collections.max(notas1));
        System.out.println("Exiba a menor nota: " + Collections.min(notas1));
        // é possivel usando o Collections, visto que o Set é uma Collection

        // Calcular a soma das notas, é possivel usando o Iterator, da mesma forma que no List
        Iterator<Double> iterator = notas1.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);
        
        // para calcular a media divida a soma pela quantidade de elemento do array, com o metodo size()

        Double media = (soma / notas1.size());
        System.out.println("Media: " + media);

        System.out.println("Remova a nota 2.5: ");
        // é possivel usando o metodo remove()
        notas1.remove(2.5);
        System.out.println(notas1);

        System.out.println("Remova a nota da posição 0: ");
        // não é possivel fazer, pois o hashset não trabalha com posição

        System.out.println("Remova as notas menores que 7.0: ");
        Iterator<Double> iterator2 = notas1.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas1);

        System.out.println("Exiba todas as notas na ordem que foi informado: ");
        // é possivel usando o LinkedHashSet que exibe os valores na ordem que foram lidos
        Set<Double> notas2 = new LinkedHashSet<>();
        // não aceita adicionar valores iguais dentro do LinkedHashSet

        notas2.add(7.2);
        notas2.add(2.7);
        notas2.add(9.4);
        notas2.add(4.1);
        notas2.add(4.1);
        System.out.println(notas2);

        System.out.println("Exiba os valores na ordem crescente: ");
        // é possivel usando o TreeSet, pois ele organiza de acordo com a ordem natural dos elementos

        Set<Double> notas3 = new TreeSet<>(notas2);
        // só é possivel passar os valores de notas2, pois são do mesmo tipo e tem o método Comparable
        System.out.println(notas3);

        System.out.println("Apague todas as notas do Set notas1: ");
        // é possivel usando o método Clear()
        notas1.clear();
        notas3.clear();

        System.out.println("Confira se o vetor de notas1 está vazio: " + notas1.isEmpty());
        System.out.println("Confira se o vetor de notas2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o vetor de notas3 está vazio: " + notas3.isEmpty());
        // é possivel, usando o métod isEmpty()
    }
}
