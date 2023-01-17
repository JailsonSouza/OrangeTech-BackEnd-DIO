import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        // lendo dados do usuario
        System.out.println("Informe seu nome? ");
        String nome = scan.next();
        System.out.println("Informe seu sobrenome? ");
        String sobrenome = scan.next();
        System.out.println("Informe sua idade? ");
        int idade = scan.nextInt();
        System.out.println("Informe sua altura? ");
        double altura = scan.nextDouble();

        // imprimindo a mensagem
        System.out.println("Olá, me chamo ".concat(nome).concat(" ").concat(sobrenome));
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + "cm.");
    }
}
