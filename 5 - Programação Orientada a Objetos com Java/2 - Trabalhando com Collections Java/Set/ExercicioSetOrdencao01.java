import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie um conjunto contendo as cores do arco-íris e:
    A. Exiba todas as cores uma abaixo da outra
    B. A quantidade de cores do o arco-íris tem
    C. Exiba as cores em ordem Alfabetica
    D. Exiba as cores na ordem inversa da que foi informada
    E. Exiba todas as cores que começa com a letra "v"
    F. Remova todas as cores que não começa com a letra "v"
    G. Limpe o conjunto
    H. Confira se o conjunto está vazio
 */
public class ExercicioSetOrdencao01 {

    public static void main(String[] args) {
        Set<String> coresArcoIris = new LinkedHashSet<>(){{
            add(new String("Vermelho"));
            add(new String("Laranja"));
            add(new String("Amarelo"));
            add(new String("Verde"));
            add(new String("Azul"));
            add(new String("Anil"));
            add(new String("Violeta"));
        }};
        System.out.println("A - Exiba todas as cores uma abaixo da outra: ");
        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }
        System.out.println("B - A quantida de cores que o arco-íris tem: " + coresArcoIris.size());
        
        System.out.println("C - Exiba as cores em ordem Alfabetica");
        Set<String> coresOrdenadas = new TreeSet<>(coresArcoIris);
        System.out.println(coresOrdenadas);

        System.out.println("D. Exiba as cores na ordem inversa da que foi informada");
        System.out.println(coresArcoIris);

        System.out.println("E. Exiba todas as cores que começa com a letra 'v'");
        for (String cor : coresArcoIris) {
            Character primeiraLetra = cor.charAt(0);
            if (primeiraLetra.equals('V')) System.out.println(cor);
        }
        
        System.out.println(coresArcoIris);
        System.out.println("F. Remova todas as cores que não começa com a letra 'v'");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            Character primeiraLetra = next.charAt(0);
            if (!primeiraLetra.equals('V')) iterator.remove();
        }
        System.out.println(coresArcoIris);
        
        System.out.println("G. Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("H. Confira se o conjunto está vazio");
        System.out.println("Esta vazio? " + coresArcoIris.isEmpty());
    }
}
