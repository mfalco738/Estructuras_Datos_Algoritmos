public class ej10 {
    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class ListaEnlazadaGenerica<T> {
        private Nodo<T> head;
        private int size;

        public void insertarAlFinal(T dato) {
            Nodo<T> nuevo = new Nodo<>(dato);
            if (head == null) {
                head = nuevo;
            } else {
                Nodo<T> actual = head;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
            size++;
        }

        public void imprimir() {
            Nodo<T> actual = head;
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        // Prueba con Strings
        ListaEnlazadaGenerica<String> listaNombres = new ListaEnlazadaGenerica<>();
        listaNombres.insertarAlFinal("Ana");
        listaNombres.insertarAlFinal("Carlos");
        listaNombres.imprimir();

        // Prueba con Integers
        ListaEnlazadaGenerica<Integer> listaNums = new ListaEnlazadaGenerica<>();
        listaNums.insertarAlFinal(100);
        listaNums.insertarAlFinal(200);
        listaNums.imprimir();
    }
}
