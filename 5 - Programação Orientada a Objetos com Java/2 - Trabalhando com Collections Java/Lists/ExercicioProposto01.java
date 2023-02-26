import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/*
    Faça um programa que receba a temperatura média dos 6 primeiros
    meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das alturas e mostre todas
    as temperaturas acima desta média, e em que mês ela ocorreram 
    ( mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double temperatura;
        Double somaTemperaturas = 0d;
        Double mediaTemperaturas = 0.0;
        List<Double> vetorTemperaturas = new ArrayList<>();
        String[] vetorMesses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        for (int i = 0; i < 6; i++) {
            temperatura = leitor.nextDouble();
            somaTemperaturas += temperatura;
            vetorTemperaturas.add(temperatura);
        }

        System.out.println(vetorTemperaturas);
        mediaTemperaturas = (somaTemperaturas / vetorTemperaturas.size());
        System.out.println("Media Semestral: " + Math.round(mediaTemperaturas * 100) / 100.0);
        System.out.println("------- TEMPERATURAS ACIMA DA MEDIA E MES -------");
        for (int i=0; i < vetorTemperaturas.size(); i++) {
            if (vetorTemperaturas.get(i) > mediaTemperaturas) System.out.println("Temperatura: " + vetorTemperaturas.get(i) + " Mes: " + vetorMesses[i]);
        }
        System.out.println("-------------------------------------------------");
    }
    

}