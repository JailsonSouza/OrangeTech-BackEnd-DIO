import java.util.Scanner; 
    
public class DesafioLojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        int quantidadeDeDoces = dinheiro * 2;
        
        System.out.printf("O cliente obteve %d doces", quantidadeDeDoces);
    }
}