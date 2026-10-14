public class ej3 {
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

        public int obtener(int posicion) {
            if (posicion < 0 || posicion >= size) {
                throw new IndexOutOfBoundsException("Posición inválida.");
            }
            Nodo actual = head;
            for (int i = 0; i < posicion; i++) {
                actual = actual.siguiente;
            }
            return actual.dato;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(100);
        lista.insertar(200);
        lista.insertar(300);
        System.out.println("Elemento en posición 1: " + lista.obtener(1));
    }
}
