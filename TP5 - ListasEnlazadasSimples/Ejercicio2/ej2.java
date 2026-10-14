public class ej2 {
    static class Nodo {
        int dato;
        Nodo siguiente;
        public Nodo(int dato) { this.dato = dato; this.siguiente = null; }
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

        public boolean buscar(int dato) {
            Nodo actual = head;
            while (actual != null) {
                if (actual.dato == dato) {
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        System.out.println("¿Está el 20? " + lista.buscar(20));
        System.out.println("¿Está el 50? " + lista.buscar(50));
    }
}
