import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    // aprendendo a ordenar minhas Lists
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Morcegao", 18, "preto"));
            add(new Gato("Simba", 3, "tigrado"));
            add(new Gato("Nani", 12, "branco"));
        }};
        
        meusGatos.add(new Gato("Anastacio", 5, "listrado"));
        meusGatos.add(new Gato("Nani", 7, "amarelo"));
        
        // para imprimir na ordem de inserção
        System.out.println("----- Ordem de Inserção: -----");
        System.out.println(meusGatos);
        
        // para imprimir em uma ordem aleatoria (bagunçada), use o metodo shuffle
        System.out.println("\n ----- Ordem Aleatória: -----");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // para imprimir pela ordem natural, use o método comparable com Collections ou caso use um comparator o método sort
        // comparando pelo nome
        System.out.println("\n ----- Ordem Natural (Nome): -----");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        // usando a interface do comparator, para ordenar por idade
        System.out.println("\n ----- Ordem por Idade: -----");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        
        // usando a interface do comparator, para ordenar por Cor
        System.out.println("\n ----- Ordem por Cor: -----");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        // usando a interface do comparator, para ordenar por Nome, Cor e Idade
        // caso o nome seja igual o criterio de desempate é a cor, caso seja igual é a idade
        System.out.println("\n ----- Ordem por Nome / Cor / Idade: -----");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
  
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

// implementar a interface Comparator

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }       
}
