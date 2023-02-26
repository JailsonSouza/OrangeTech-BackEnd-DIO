import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
    sobre um crime. As perguntas são:
    1. "Telefonou para a vítima?"
    2. "Esteve no local do crime?"
    3. "Mora perto da vítima?"
    4. "Devia para a vítima?"
    5. "Já trabalhou com a vítima?"
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada
    como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assasina". Caso, con-
    trário, ela será classificado como "Inocente".
 */
public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdDeSim = 0;
        List<String> perguntas = new ArrayList<>(){{
            add(new String("Telefontou para vitima?"));
            add(new String("Esteve no local do crime?"));
            add(new String("Mora perto da vitima?"));
            add(new String("Devia para a vitima?"));
            add(new String("Já trabalhou com a vitima?"));
        }};
        List<String> respostasDasPerguntas = new ArrayList<>();

        String resposta;
        
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            resposta = leitor.next();
            respostasDasPerguntas.add(resposta);
        }

        for (int i = 0; i < respostasDasPerguntas.size(); i++) {
            if (respostasDasPerguntas.get(i).equals("S")) qtdDeSim++;
        }
        
        if (qtdDeSim == 2) {
            System.out.println("Suspeita");
        } else if ((qtdDeSim == 3) || (qtdDeSim == 4)) {
            System.out.println("Cúmplice");
        } else if (qtdDeSim == 5) {
            System.out.println("Assasina");
        } else {
            System.out.println("Inocente");
        }
    }
}
