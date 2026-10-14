public class ej5 {
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

        public boolean eliminar(int dato) {
            if (head == null) return false;

            if (head.dato == dato) {
                head = head.siguiente; // El GC se encarga del nodo anterior
                size--;
                return true;
            }

            Nodo actual = head;
            while (actual.siguiente != null && actual.siguiente.dato != dato) {
                actual = actual.siguiente;
            }

            if (actual.siguiente != null) {
                actual.siguiente = actual.siguiente.siguiente;
                size--;
                return true;
            }
            return false;
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
        lista.eliminar(20);
        lista.imprimir();
    }
}
