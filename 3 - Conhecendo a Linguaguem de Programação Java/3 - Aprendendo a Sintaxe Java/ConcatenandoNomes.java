public class ConcatenandoNomes {
    public static void main(String [] args) {
        String primeiroNome = "Ana";
        final String ULTIMO_NOME = "Souza";

        primeiroNome = "Jailson";
        
        String nomeCompleto = nomeCompleto(primeiroNome, ULTIMO_NOME);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String ultimoNome) {
        return "Resultado: " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
