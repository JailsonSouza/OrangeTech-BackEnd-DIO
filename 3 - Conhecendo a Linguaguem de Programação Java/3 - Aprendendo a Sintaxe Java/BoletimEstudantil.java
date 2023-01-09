public class BoletimEstudantil {
    public static void main(String[] args) {
        float media = 6;

        if ((media >= 0) && (media < 6)) {
            System.out.println("REPROVADO");
        } else if (media == 6){
            System.out.println("PROVA MINERVA");
        } else if ((media > 6) && (media <= 10)) {
            System.out.println("APROVADO");
        } else {
            System.out.println("Nota informada inválida!!!");
        }
    }
}
