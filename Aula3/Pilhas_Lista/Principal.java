public class Principal {
    public static void main(String[] args) {
        Pilha<Integer>pilha = new Pilha<>();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);

        for (int i = 0; !pilha.estaVazia(); i++) {
            System.out.println("Desempilhando (" + i + "): " + pilha.desempilhar());
        }

        if (pilha.estaVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha não está vazia.");
        }

    }
}
