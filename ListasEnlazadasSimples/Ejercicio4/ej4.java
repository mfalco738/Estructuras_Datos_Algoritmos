public class ej4 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; }
    }

    static class ListaEnlazada {
        Nodo head;
        int size;

        public void insertarEnPosicion(int dato, int posicion) {
            if (posicion < 0 || posicion > size) {
                throw new IndexOutOfBoundsException("Posición fuera de rango.");
            }
            Nodo nuevo = new Nodo(dato);
            if (posicion == 0) {
                nuevo.siguiente = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                for (int i = 0; i < posicion - 1; i++) {
                    actual = actual.siguiente;
                }
                nuevo.siguiente = actual.siguiente;
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
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarEnPosicion(10, 0);
        lista.insertarEnPosicion(30, 1);
        lista.insertarEnPosicion(20, 1); // Inserta en el medio
        lista.imprimir();
    }
}
