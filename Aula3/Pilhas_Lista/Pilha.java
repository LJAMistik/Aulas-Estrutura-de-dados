
import java.util.ArrayList;
import java.util.List;

    // Definindo a InterfacePilha (Interface)
    interface InterfacePilha<T> {
        void empilhar(T elemento);
        T desempilhar();
        boolean estaVazia();
    }

    // Classe Pilha que implementa a InterfacePilha
    class Pilha<T> implements InterfacePilha<T> {
        private List<T> elementos;

        public Pilha() {
            elementos = new ArrayList<>();
        }

        @Override
        public void empilhar(T elemento) {
            elementos.add(elemento);
        }

        @Override
        public T desempilhar() {
            if (!estaVazia()) {
                int tamanho = elementos.size();
                T elementoDesempilhado = elementos.get(tamanho - 1);
                elementos.remove(tamanho - 1);
                return elementoDesempilhado;
            } else {
                return null; // Retorna null para indicar que a pilha está vazia
            }
        }

        @Override
        public boolean estaVazia() {
            return elementos.isEmpty();
        }
    }

