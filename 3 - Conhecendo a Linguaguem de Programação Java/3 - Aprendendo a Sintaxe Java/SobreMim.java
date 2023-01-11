import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // lendo dados do usuario
        System.out.println("Informe seu nome? ");
        String nome = scanner.next();
        System.out.println("Informe seu sobrenome? ");
        String sobrenome = scanner.next();
        System.out.println("Informe sua idade? ");
        int idade = scanner.nextInt();
        System.out.println("Informe sua altura? ");
        double altura = scanner.nextDouble();
        


        // imprimindo a mensagem
        System.out.println("Olá, me chamo ".concat(nome).concat(" ").concat(sobrenome));
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + "cm.");
    }
}
