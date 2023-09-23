public class Principal {

    public static void main(String[] args) {
        String teste = "laura";

        // Crie uma instância da classe Palindromo
        Palindromo palindromo = new Palindromo();

        // Chame o método ePalindromo na instância
        boolean ePalindromo = palindromo.ePalindromo(teste);
        System.out.println("A string '" + teste + "' é um palíndromo? " + ePalindromo);
    }
}
