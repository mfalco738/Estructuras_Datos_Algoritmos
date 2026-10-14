public class ej7 {
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

        public void modificar(int posicion, int nuevoDato) {
            if (posicion < 0 || posicion >= size) {
                throw new IndexOutOfBoundsException("Posición fuera de rango.");
            }
            Nodo actual = head;
            for (int i = 0; i < posicion; i++) {
                actual = actual.siguiente;
            }
            actual.dato = nuevoDato; // Modifica el valor interno del nodo
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
        lista.insertar(10);
        lista.insertar(20);
        lista.modificar(1, 99);
        lista.imprimir();
    }
}
