import java.util.Locale;
import java.util.Scanner;

/* 
Faça um programa que leia 5 números e informe o maior número
e a média entre eles
*/
public class Ex02_Notas {
    public static void main(String[] args) {
        double nota;
        double soma = 0;
        double maior = 0;
        double media = 0;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        for (int c = 0; c < 5; c++){
            System.out.printf("Informe a %d nota: ", c+1);
            nota = scan.nextDouble();
            soma += nota;
            if ((c == 0) || (nota > maior)) maior = nota;
        }
        media = (soma/5);
        
        System.out.printf("Maior: %.2f\n", maior);
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Media: %.2f", media);

    }
}
