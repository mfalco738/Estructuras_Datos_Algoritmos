public class ej1 {
    static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class ListaEnlazadaSimple {
        private Nodo head;
        private int size;

        public ListaEnlazadaSimple() {
            this.head = null;
            this.size = 0;
        }

        public boolean estaVacia() {
            return head == null;
        }

        public int getSize() {
            return size;
        }

        public void insertarAlInicio(int dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = head;
            head = nuevo;
            size++;
        }

        public void insertarAlFinal(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (estaVacia()) {
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
            size++;
        }

        public void imprimir() {
            Nodo actual = head;
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlInicio(5);
        lista.imprimir();
        System.out.println("Tamaño: " + lista.getSize());
    }
}
