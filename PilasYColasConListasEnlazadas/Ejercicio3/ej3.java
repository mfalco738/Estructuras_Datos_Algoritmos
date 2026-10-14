public class ej3 {
    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        public Nodo(T dato) { this.dato = dato; this.siguiente = null; }
    }

    static class PilaEnlazadaGenerica<T> {
        private Nodo<T> head;

        public boolean estaVacia() {
            return head == null;
        }

        public void apilar(T dato) {
            Nodo<T> nuevo = new Nodo<>(dato);
            nuevo.siguiente = head;
            head = nuevo;
        }

        public T desapilar() {
            if (estaVacia()) return null;
            T dato = head.dato;
            head = head.siguiente;
            return dato;
        }

        public T consultarTope() {
            if (estaVacia()) return null;
            return head.dato;
        }
    }

    public static void main(String[] args) {
        PilaEnlazadaGenerica<String> pilaNombres = new PilaEnlazadaGenerica<>();
        pilaNombres.apilar("Ana");
        pilaNombres.apilar("Carlos");
        System.out.println("Tope String: " + pilaNombres.consultarTope());

        PilaEnlazadaGenerica<Integer> pilaNums = new PilaEnlazadaGenerica<>();
        pilaNums.apilar(100);
        System.out.println("Tope Integer: " + pilaNums.consultarTope());
    }
}
