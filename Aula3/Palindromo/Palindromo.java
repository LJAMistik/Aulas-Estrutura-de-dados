import java.util.Stack;

public class Palindromo {
    // Método que verifica se uma String é um palíndromo
    public static boolean ePalindromo(String entrada) {
        // Remove espaços em branco e converte a String para minúsculas para evitar problemas de capitalização
        entrada = entrada.replaceAll("\\s", "").toLowerCase();

        // Cria uma pilha para inverter a String
        Stack<Character> pilha = new Stack<>();

        // Empilhe os caracteres da String
        for (int i = 0; i < entrada.length(); i++) {
            pilha.push(entrada.charAt(i));
        }

        // Desempilhe os caracteres e construa a String invertida
        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        // Compare a String original com a String invertida
        return entrada.equals(invertida.toString());
    }
}