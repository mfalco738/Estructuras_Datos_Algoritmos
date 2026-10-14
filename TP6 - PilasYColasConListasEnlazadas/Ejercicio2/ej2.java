public class ej2 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    static class ColaEnlazada {
        private Nodo head; // Frente de la cola
        private Nodo tail; // Fin de la cola
        @SuppressWarnings("unused")
        private int size;

        public boolean estaVacia() {
            return head == null;
        }

        public void encolar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (estaVacia()) {
                head = nuevo;
                tail = nuevo;
            } else {
                tail.siguiente = nuevo; // Se añade al final en O(1) gracias a tail
                tail = nuevo;
            }
            size++;
        }

        public int desencolar() {
            if (estaVacia()) {
                System.out.println("Cola vacía.");
                return -1;
            }
            int dato = head.dato;
            head = head.siguiente;
            if (head == null) {
                tail = null; // Si queda vacía, tail también debe ser null
            }
            size--;
            return dato;
        }

        public int consultarFrente() {
            if (estaVacia()) return -1;
            return head.dato;
        }

        public void imprimir() {
            Nodo actual = head;
            System.out.print("Frente -> ");
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ColaEnlazada cola = new ColaEnlazada();
        cola.encolar(5);
        cola.encolar(15);
        cola.imprimir();
        System.out.println("Desencolado: " + cola.desencolar());
        cola.imprimir();
    }
}
