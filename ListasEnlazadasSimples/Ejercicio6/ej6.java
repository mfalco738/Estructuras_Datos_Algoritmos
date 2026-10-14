public class ej6 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; }
    }

    static class ListaEnlazada {
        Nodo head;
        int size;

        public void insertar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (head == null) { head = nuevo; }
            else {
                Nodo actual = head;
                while (actual.siguiente != null) { actual = actual.siguiente; }
                actual.siguiente = nuevo;
            }
            size++;
        }

        public void eliminarEnPosicion(int posicion) {
            if (posicion < 0 || posicion >= size) {
                throw new IndexOutOfBoundsException("Posición inválida.");
            }
            if (posicion == 0) {
                head = head.siguiente;
            } else {
                Nodo actual = head;
                for (int i = 0; i < posicion - 1; i++) {
                    actual = actual.siguiente;
                }
                actual.siguiente = actual.siguiente.siguiente;
            }
            size--;
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
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(5);
        lista.insertar(15);
        lista.insertar(25);
        lista.eliminarEnPosicion(1);
        lista.imprimir();
    }
}
