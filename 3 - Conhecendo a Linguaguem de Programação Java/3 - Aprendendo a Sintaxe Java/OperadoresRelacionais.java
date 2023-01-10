public class OperadoresRelacionais {
    public static void main(String [] args){
        // comparando número, usa-se operadores relacionais

        int numeroUm = 1; 
        int numeroDois = 10; 

        // uso do operador ternário

        String resultado = (numeroUm == numeroDois)? "Sim" : "Não";
        
        System.out.println("Os números são iguais? " + resultado);
        
        // comparar string, com a função equals
        
        String primeiroNome = "Jailson";
        
        String segundoNome = new String("Jailson");
        
        String ehIgual = (primeiroNome == segundoNome)? "Sim" : "Não";

        System.out.println("Os nomes informados são iguais? " + ehIgual);
        /*
            na comparação acima, ele válida o tipo e modelo aclopado de váriavel,
            e não se atenta ao contéudo que é igual, no caso de validação de string,
            no java, use o método equals
         */
        
        String osNomesSãoIguais = primeiroNome.equals(segundoNome)? "Sim" : "Não";
        System.out.println("Os nomes informados são iguais? " + osNomesSãoIguais);


        /* 
            Operadores Lógicos

            and = &&
            or = ||
            not = !

         */

    }


}
