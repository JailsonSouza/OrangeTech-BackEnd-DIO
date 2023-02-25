public class OperadoresRelacionais {
    public static void main(String [] args){
        // declaracação das variaveis
        //tipo inteiro
        int i1 = 76;
        int i2 = 3;
        // tipo ponto flutuante
        float f1 = 11.5f;
        float f2 = 98.5f;
        double d1 = 33.6d;
        // tipo caractere
        char c1 = 'x';
        char c2 = 'x';
        // tipo cadeia de caractere - string
        String myName = "Jailson";
        String hisName = "Edevai";
        // tipo booleano
        boolean b1 = false;
        boolean b2 = true;
        // tipo numerico de tamanho especifico
        long l1 = 548584584854900L;
        long l2 = 12434350L;
        byte y1 = 6;
        short h1 = 23;

        // Comparação usando os Operadores Relacionais
        // do tipo inteiro
        System.out.println("i1 == i2? " + (i1 == i2));
        System.out.println("i1 != i2? " + (i1 != i2));
        System.out.println("i1 > i2? " + (i1 > i2));
        System.out.println("i1 < i2? " + (i1 < i2));
        System.out.println("i1 >= i2? " + (i1 >= i2));
        System.out.println("i1 <= i2? " + (i1 <= i2));
        // do tipo ponto flutuante
        System.out.println("\nf1 == f2? " + (f1 == f2));
        System.out.println("f1 != f2? " + (f1 != f2));
        System.out.println("f1 > f2? " + (f1 > f2));
        System.out.println("f1 < f2? " + (f1 < f2));
        System.out.println("f1 >= f2? " + (f1 >= f2));
        System.out.println("f1 <= f2? " + (f1 <= f2));
        // do tipo ponto flutuante
        System.out.println("\nc1 == f2? " + (c1 == c2));
        System.out.println("c1 != c2? " + (c1 != c2));
        System.out.println("c1 > c2? " + (c1 > c2));
        System.out.println("c1 < c2? " + (c1 < c2));
        System.out.println("c1 >= c2? " + (c1 >= c2));
        System.out.println("c1 <= c2? " + (c1 <= c2));
    }
}