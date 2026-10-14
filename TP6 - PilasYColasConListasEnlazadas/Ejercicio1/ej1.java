public class ej1 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    static class PilaEnlazada {
        private Nodo head;
        @SuppressWarnings("unused")
        private int size;

        public boolean estaVacia() {
            return head == null;
        }

        public void apilar(int dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = head; // El nuevo apunta al antiguo tope
            head = nuevo;          // head pasa a ser el nuevo tope (O(1))
            size++;
        }

        public int desapilar() {
            if (estaVacia()) {
                System.out.println("Pila vacía.");
                return -1;
            }
            int dato = head.dato;
            head = head.siguiente; // O(1)
            size--;
            return dato;
        }

        public int consultarTope() {
            if (estaVacia()) return -1;
            return head.dato;
        }

        public boolean buscar(int dato) {
            Nodo actual = head;
            while (actual != null) {
                if (actual.dato == dato) return true;
                actual = actual.siguiente;
            }
            return false;
        }

        public void imprimir() {
            Nodo actual = head;
            System.out.print("Tope -> ");
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        PilaEnlazada pila = new PilaEnlazada();
        pila.apilar(10);
        pila.apilar(20);
        pila.imprimir();
        System.out.println("Desapilado: " + pila.desapilar());
        pila.imprimir();
    }
}
