// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        pessoasNoCamarote = tamanhoDaFila / 2;
        if (tamanhoDaFila % 2 != 0) pessoasNoCamarote++;

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}