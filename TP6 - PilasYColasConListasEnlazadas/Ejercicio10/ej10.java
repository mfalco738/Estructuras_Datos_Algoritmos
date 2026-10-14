public class ej10 {
    static class NodoDoble<T> {
        T dato;
        NodoDoble<T> anterior, siguiente;
        public NodoDoble(T dato) { this.dato = dato; }
    }

    static class ListaDoble<T> {
        private NodoDoble<T> head, tail;

        public void insertarAlFinal(T dato) {
            NodoDoble<T> nuevo = new NodoDoble<>(dato);
            if (head == null) {
                head = tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                nuevo.anterior = tail;
                tail = nuevo;
            }
        }

        public void imprimirAdelante() {
            NodoDoble<T> actual = head;
            System.out.print("Adelante: ");
            while (actual != null) {
                System.out.print(actual.dato + " <-> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }

        public void imprimirAtras() {
            NodoDoble<T> actual = tail;
            System.out.print("Atrás: ");
            while (actual != null) {
                System.out.print(actual.dato + " <-> ");
                actual = actual.anterior;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListaDoble<String> lista = new ListaDoble<>();
        lista.insertarAlFinal("Java");
        lista.insertarAlFinal("Estructuras");
        lista.insertarAlFinal("Algoritmos");

        lista.imprimirAdelante();
        lista.imprimirAtras();
    }
}
