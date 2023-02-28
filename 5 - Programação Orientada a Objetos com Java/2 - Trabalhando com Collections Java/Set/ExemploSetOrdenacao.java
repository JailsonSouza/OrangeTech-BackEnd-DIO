import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
    Informados os dados sobre as series favoritas, crie um conjunto e exiba ordenado
    conforme a ordenação for solicitada, exibindo (nome - genero - tempoDeEpisodio)
    
    serie1 = nome: La casa de papel, genero: ação, tempoDeDuracao: 58
    serie2 = nome: Elite, genero: suspense, tempoDeDuracao: 38
    serie3 = nome: Grey's Anatomy, genero: drama, tempoDeDuracao: 104
    
 */

public class ExemploSetOrdenacao {
    public static void main(String[] args) {
        System.out.println("Exiba de forma aleatoria: "); // metodo HashSet
        Set<Series> minhasSeries1 = new HashSet<>();
        
        minhasSeries1.add(new Series("La casa de papel", "Ação", 58));
        minhasSeries1.add(new Series("Elite", "Suspense", 38));
        minhasSeries1.add(new Series("Grey's Anatomy", "Drama", 104));
        
        System.out.println(minhasSeries1);

        System.out.println("\nExiba na ordem de inserção: "); // metodo LinkedHashSet
        Set<Series> minhasSeries2 = new LinkedHashSet<>();
        
        minhasSeries2.add(new Series("La casa de papel", "Ação", 58));
        minhasSeries2.add(new Series("Elite", "Suspense", 38));
        minhasSeries2.add(new Series("Grey's Anatomy", "Drama", 104));
        
        System.out.println(minhasSeries2);

        System.out.println("\nExiba na ordem natural: "); // metodo TreeSet
        Set<Series> minhasSeries3 = new TreeSet<>();
        
        minhasSeries3.add(new Series("La casa de papel", "Ação", 38));
        minhasSeries3.add(new Series("Elite", "Suspense", 38));
        minhasSeries3.add(new Series("Grey's Anatomy", "Drama", 104));
        
        System.out.println(minhasSeries3);

        System.out.println("\nExiba na ordem Nome/Genero/TempoDeDuração: "); // metodo TreeSet
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoDeDuracao());
        
        minhasSeries4.addAll(minhasSeries3);

        System.out.println(minhasSeries4);
    }
}

class Series implements Comparable<Series>{
    
    
    private String nome;
    private String genero;
    private int tempoDeDuracao;
    
    // metodo construtor
    public Series(String nome, String genero, int tempoDeDuracao) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    // gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }
    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }
    
    // toString()
    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoDeDuracao=" + tempoDeDuracao + "]";
    }

    // substituir metodos de equals e hashcod  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + tempoDeDuracao;
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
        Series other = (Series) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoDeDuracao != other.tempoDeDuracao)
            return false;
        return true;
    }

    @Override
    public int compareTo(Series serie) {
        int tempoDeDuracao = Integer.compare(this.getTempoDeDuracao(), serie.tempoDeDuracao);
        if (tempoDeDuracao != 0) return tempoDeDuracao;

        return this.getGenero().compareTo(serie.getGenero());

        // se os tempos forem igual, o metodo não aceita valores iguais, logo não vai mostrar um dos valores
        // para resolver isso, vai ter um criterio de desempate por genero
    }
    
}

class ComparatoNomeGeneroTempoDeDuracao implements Comparator<Series> {
    @Override
    public int compare (Series serie1, Series serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(serie1.getTempoDeDuracao(), serie2.getTempoDeDuracao());
    }
}