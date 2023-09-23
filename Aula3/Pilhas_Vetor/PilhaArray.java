public class PilhaArray {
    private Object[] array;
    private int tamanhoMaximo;
    private int topo;

    public PilhaArray(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.array = new Object[tamanhoMaximo];
        this.topo = -1; // Inicializa o topo como -1
    }

    public void empilhar(Object elemento) {
        if (!estahCheia()) {
            topo++;
            array[topo] = elemento;
        } else {
            System.out.println("A pilha está cheia. Não é possível empilhar.");
        }
    }

    public Object desempilhar() {
        if (!estahVazia()) {
            Object elementoDesempilhado = array[topo];
            topo--;
            return elementoDesempilhado;
        } else {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return null;
        }
    }

    public boolean estahVazia() {
        return topo == -1;
    }

    public boolean estahCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public int tamanho() {
        return topo + 1;
    }
}
