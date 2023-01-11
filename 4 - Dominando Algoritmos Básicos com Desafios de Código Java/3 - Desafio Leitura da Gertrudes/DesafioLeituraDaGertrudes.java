import java.util.Scanner; 
    
public class DesafioLeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        int tempoDeLeitura = (paginas / paginasLidas);
        
        System.out.println(tempoDeLeitura + " dias");
    }
}