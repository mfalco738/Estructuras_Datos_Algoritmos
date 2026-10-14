public class ej6 {
    static class ClienteBanco {
        String nombre;
        int turno;
        String motivo;
        public ClienteBanco(String n, int t, String m) {
            nombre = n; turno = t; motivo = m;
        }
        @Override public String toString() {
            return "Turno #" + turno + " - " + nombre + " (" + motivo + ")";
        }
    }

    static class Nodo {
        ClienteBanco cliente;
        Nodo siguiente;
        public Nodo(ClienteBanco c) { cliente = c; }
    }

    static class ColaBanco {
        private Nodo head, tail;

        public void agregarCliente(ClienteBanco c) {
            Nodo nuevo = new Nodo(c);
            if (head == null) {
                head = tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                tail = nuevo;
            }
            System.out.println("Agregado a la fila: " + c.nombre);
        }

        public void atenderSiguiente() {
            if (head == null) {
                System.out.println("No hay clientes en espera.");
                return;
            }
            System.out.println("Atendiendo a -> " + head.cliente);
            head = head.siguiente;
            if (head == null) tail = null;
        }
    }

    public static void main(String[] args) {
        ColaBanco banco = new ColaBanco();
        banco.agregarCliente(new ClienteBanco("Juan Pérez", 1, "Cajas"));
        banco.agregarCliente(new ClienteBanco("María Gómez", 2, "Préstamos"));
        banco.atenderSiguiente();
    }
}
