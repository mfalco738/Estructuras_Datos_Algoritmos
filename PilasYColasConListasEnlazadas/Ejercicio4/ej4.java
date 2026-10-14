public class ej4 {
    static class Cliente {
        String nombre;
        public Cliente(String nombre) { this.nombre = nombre; }
        @Override public String toString() { return "Cliente: " + nombre; }
    }

    static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        public Nodo(T dato) { this.dato = dato; }
    }

    static class ColaEnlazadaGenerica<T> {
        private Nodo<T> head, tail;

        public void encolar(T dato) {
            Nodo<T> nuevo = new Nodo<>(dato);
            if (head == null) {
                head = tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                tail = nuevo;
            }
        }

        public T desencolar() {
            if (head == null) return null;
            T dato = head.dato;
            head = head.siguiente;
            if (head == null) tail = null;
            return dato;
        }
    }

    public static void main(String[] args) {
        ColaEnlazadaGenerica<Cliente> colaClientes = new ColaEnlazadaGenerica<>();
        colaClientes.encolar(new Cliente("Lucía"));
        colaClientes.encolar(new Cliente("Pedro"));

        System.out.println(colaClientes.desencolar());
    }
}
