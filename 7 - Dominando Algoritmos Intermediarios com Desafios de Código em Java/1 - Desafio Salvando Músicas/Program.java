// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .contains() verificar se em uma determinada String tem um determinado caractere ou um conjunto deles

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String formatoDoArquivo = arquivoDoPc.substring(arquivoDoPc.length() - 3);
        System.out.println((formatoDoArquivo.equals("mp3")) ? "Salvar" : "Deletar");
    }
}