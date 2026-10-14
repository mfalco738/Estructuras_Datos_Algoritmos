public class ej9 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; }
    }

    static class ListaEnlazada {
        Nodo head;

        public void insertar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (head == null) { head = nuevo; }
            else {
                Nodo actual = head;
                while (actual.siguiente != null) { actual = actual.siguiente; }
                actual.siguiente = nuevo;
            }
        }

        public void invertir() {
            Nodo anterior = null;
            Nodo actual = head;
            Nodo siguiente;

            while (actual != null) {
                siguiente = actual.siguiente; // Guarda el siguiente nodo
                actual.siguiente = anterior; // Invierte el enlace
                anterior = actual;           // Avanza anterior
                actual = siguiente;          // Avanza actual
            }
            head = anterior; // Nuevo inicio de la lista invertida
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
        lista.insertar(30);
        lista.invertir();
        lista.imprimir();
    }
}
