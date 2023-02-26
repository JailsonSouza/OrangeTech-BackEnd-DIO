// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        //String dados[] = frase.split("/");
        array = frase.split("/");
        //for (int i = 0; i < dados.length; i++) array[i] = dados[i];;

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);

    }
}