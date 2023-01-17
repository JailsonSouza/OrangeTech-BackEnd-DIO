import java.util.Scanner;

/* 
    Faça um programa que leia o nome e a idade de um aluno, até que o usuário
    digite o valor 0 (zero) no campo nome, para encerrar o programa
 */
public class Ex01_NomeIdade {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Informe o seu nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;
            
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();

        } while (true);        
    }
}
