public class ConcatenatingNames {
    public static void main(String [] args) {
        String firstName = "Jailson";
        String lastName = "Souza";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String lastName) {
        return "Resultado: " + firstName.concat(" ").concat(lastName);
    }
}
