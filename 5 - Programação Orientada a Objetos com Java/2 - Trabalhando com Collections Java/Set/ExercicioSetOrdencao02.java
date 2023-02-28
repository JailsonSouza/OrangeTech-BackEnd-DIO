import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Crie uma classe LinguagemFavorita que possua os atributos: nome,
    anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens
    e faça um programa que ordene esse conjunto por:
    A. Ordem de Inserção
    B. Ordem Natural (nome)
    C. IDE
    D. Ano de criação e IDE
    E. nome, ano de criação e IDE
    Ao final, exiba as linguaguagens no console, um abaixo da outra
 */
public class ExercicioSetOrdencao02 {

    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "VsCode"));
            add(new LinguagemFavorita("Java", 1991, "NetBeans"));
        }};

        System.out.println("\nA - Ordem de Inserção");
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas) {
            System.out.println("-----------");
            System.out.println(linguagem.getNome());
            System.out.println(linguagem.getAnoDeCriacao());
            System.out.println(linguagem.getIDE());
            System.out.println("-----------");
        }
        
        System.out.println("\nB - Ordem Natural (Nome)");
        Set<LinguagemFavorita> linguaguensOrdenadasPorNome = new TreeSet<>(minhasLinguagensFavoritas);
        
        for (LinguagemFavorita linguagem : linguaguensOrdenadasPorNome) {
            System.out.println("-----------");
            System.out.println(linguagem.getNome());
            System.out.println(linguagem.getAnoDeCriacao());
            System.out.println(linguagem.getIDE());
            System.out.println("-----------");
        }
        
        System.out.println("\nC - Ordem por IDE");
        Set<LinguagemFavorita> linguaguensOrdenadasPorIDE = new TreeSet<>(new ComparatorIDE());
        linguaguensOrdenadasPorIDE.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguaguensOrdenadasPorIDE) {
            System.out.println(linguagem.getNome());
            System.out.println(linguagem.getAnoDeCriacao());
            System.out.println(linguagem.getIDE());
            System.out.println("-----------");
        }

        System.out.println("\nC - Ordem por Ano de Criação / nome");
        Set<LinguagemFavorita> linguaguensOrdSetenadasPorAnoDeCriacaoNome = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguaguensOrdSetenadasPorAnoDeCriacaoNome.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguaguensOrdSetenadasPorAnoDeCriacaoNome) {
            System.out.println(linguagem.getNome());
            System.out.println(linguagem.getAnoDeCriacao());
            System.out.println(linguagem.getIDE());
            System.out.println("-----------");
        }

        System.out.println("\nC - Ordem por Nome / Ano De Criação / IDE");
        Set<LinguagemFavorita> linguaguensOrdSetenadasPorNomeAnoDeCriacaoIDE = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        linguaguensOrdSetenadasPorNomeAnoDeCriacaoIDE.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguaguensOrdSetenadasPorNomeAnoDeCriacaoIDE) {
            System.out.println(linguagem.getNome());
            System.out.println(linguagem.getAnoDeCriacao());
            System.out.println(linguagem.getIDE());
            System.out.println("-----------");
        }     



        System.out.println("\n--- Exibindo as Linguagens ---");
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas) {
            System.out.println(linguagem.getNome());
        }
        System.out.println("------------------------------");
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCriacao;
    private String IDE;
    
    public LinguagemFavorita(String nome, int anoDeCriacao, String iDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = iDE;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }
    public String getIDE() {
        return IDE;
    }
    public void setIDE(String iDE) {
        this.IDE = iDE;
    }
    
    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", IDE=" + IDE + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeCriacao;
        result = prime * result + ((IDE == null) ? 0 : IDE.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao != other.anoDeCriacao)
            return false;
        if (IDE == null) {
            if (other.IDE != null)
                return false;
        } else if (!IDE.equals(other.IDE))
            return false;
        return true;
    }
    
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }

}

class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita ide1, LinguagemFavorita ide2) {
        return ide1.getIDE().compareTo(ide2.getIDE());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare (LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIDE().compareTo(l2.getIDE());
    }
}
