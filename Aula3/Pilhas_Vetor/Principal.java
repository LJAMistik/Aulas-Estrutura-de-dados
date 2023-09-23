public class Principal {
    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(5);

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);

        for (int i = 0; !pilha.estahVazia(); i++) {
            System.out.println("Desempilhando (" + i + "): " + pilha.desempilhar());
        }

        if (pilha.estahVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha não está vazia.");
        }

    }
}
