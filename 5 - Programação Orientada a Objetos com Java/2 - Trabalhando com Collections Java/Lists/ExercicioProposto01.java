import java.util.List;
import java.util.ArrayList;
/*
    Faça um programa que receba a temperatura média dos 6 primeiros
    meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das alturas e mostre todas
    as temperaturas acima desta média, e em que mês ela ocorreram 
    ( mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */
public class ExercicioProposto01 {
    List<Dados> vetorTemperaturas = new ArrayList<>();

    

}

class Dados {
    private Integer temperatura;
    private String mes;

    public Dados(Integer temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
