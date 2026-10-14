public class ej8 {
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

        public int contarOcurrencias(int dato) {
            int contador = 0;
            Nodo actual = head;
            while (actual != null) {
                if (actual.dato == dato) {
                    contador++;
                }
                actual = actual.siguiente;
            }
            return contador;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(10);
        lista.insertar(30);
        lista.insertar(10);
        System.out.println("Ocurrencias de 10: " + lista.contarOcurrencias(10));
    }
}
