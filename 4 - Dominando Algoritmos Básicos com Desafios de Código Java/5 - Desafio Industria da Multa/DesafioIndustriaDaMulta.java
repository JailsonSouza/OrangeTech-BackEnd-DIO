import java.util.Scanner; 
    
public class DesafioIndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        String analisadorDeVelocidade = (velocidadeAtual > 60) ? "Foi multado": "Nao foi multado"; 
        System.out.println(analisadorDeVelocidade);
    }
}