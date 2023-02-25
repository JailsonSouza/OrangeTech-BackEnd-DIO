import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class ExemploList {
    // aprendendo a usar Collections (Coleções)
    public static void main(String[] args) {
        // formas de declarar uma List
        //List notas = new ArrayList(); // forma arcaica de declarar um list, antes do java 5
        //List<Double> notas = new ArrayList<>(); // usado em versões acima do java 5, no jdk 7 o uso de diamond operator
        //ArrayList<Double> notas = new ArrayList<>(); // forma voltada para a implementação, sendo que a prog atual é voltada para interface
        //List<Double> notas = new ArrayList<>(Arrays.asList(5.4d, 3.45d, 2d, 545.3d, 42d));
        /* List<Double> notas = Arrays.asList(5.4, 3.45d, 2d, 545.3, 42d); // dessa forma não pode adicionar ou remover elementos
        notas.add(3.43);
        System.out.println(notas); */
        /* List<Double> notas = List.of(43d, 4.2, 41.4, 4d, 2.3); // está coleção é imutavel, não pode adicionar ou remover elementos
        notas.add(1d);
        notas.remove(4.2);
        System.out.println(notas); */
        System.out.println("Crie uma lista e adicione 7 valores");
        List<Double> notas = new ArrayList<>();
        notas.add(3.2);
        notas.add(4d);
        notas.add(2.6);
        notas.add(7.9);
        notas.add(9d);
        notas.add(6d);
        notas.add(0d);
        //System.out.println(notas);
        System.out.println(notas.toString());
        // exibir o valor de uma posição
        System.out.println("Exiba a posição da nota 2.6");
        // exibir a posição em que um valor se encontra
        System.out.println(notas.indexOf(2.6)); // use o método "indexOf()"
        // adicionar uma nota em uma posição especifica
        System.out.println("Adicione a nota 8.0 na posição 6");
        notas.add(6, 8d);
        System.out.println(notas);
        // substituir um valor por outro
        System.out.println("Substitua o valor 3.2 por 7");
        notas.set(notas.indexOf(3.2), 7d);
        System.out.println(notas.toString());
        // conferir se determinado valor faz parte da lista
        System.out.println("Confira se a nota 2.6 está na lista de notas");
        System.out.println("O valor 2.6 está na lista? " + notas.contains(2.6)); // para achar um valor use o método contains
        // exibir valores na ordem em que foram informados
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        // Exiba a terceira nota adicionada 
        System.out.println("Terceira nota adicionada: " + notas.get(2)); // método get
        System.out.println(notas);
        // informar a maior e menor nota da list de notas
        System.out.println("Maior: " + Collections.max(notas)); // o list não tem um metodo proprio para fazer essa comparação, por isso o método da Collections
        System.out.println("Menor: " + Collections.min(notas));
        System.out.println(notas);
        // contar os valores da list de notas com o método interator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores da list notas: " + soma);
        // para fazer a média basta dividir a soma das notas pela quantidade de notas

        Double media = soma / notas.size(); // método size informa a quantidade de valores dentro da list
        System.out.println("Quantidade de notas informadas: " + notas.size());
        System.out.println("Média dos valores da list notas: " + media);
        // para remover um valor da list, use o método "remove"
        // para remover a NOTA 0
        System.out.println("Remova a nota 0");
        notas.remove(0d); // informe o tipo ou a parte flutuante
        System.out.println(notas);
        // caso queira remover o valor da posição 0, não informe o tipo ou a parte flutuante
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        // para remover uma lista de elementos em um determinado intervalo
        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> interatorDois = notas.iterator();
        while (interatorDois.hasNext()) {
            Double next = interatorDois.next();
            if (next < 7) interatorDois.remove();
        }
        System.out.println(notas);
        // para apagar toda a lista, use o método Clear()
        notas.clear();
        System.out.println(notas);
        // para verificar se uma lista está vázia
        System.out.println("A lista está vázia? " + notas.isEmpty());

    }
}
