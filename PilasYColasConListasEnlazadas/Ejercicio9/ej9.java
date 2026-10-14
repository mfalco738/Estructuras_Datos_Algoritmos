public class ej9 {
    static class TrabajoImpresion {
        String archivo;
        int paginas;
        String usuario;
        public TrabajoImpresion(String a, int p, String u) {
            archivo = a; paginas = p; usuario = u;
        }
        @Override public String toString() {
            return archivo + " (" + paginas + " págs) enviado por " + usuario;
        }
    }

    static class Nodo {
        TrabajoImpresion trabajo;
        Nodo siguiente;
        public Nodo(TrabajoImpresion t) { trabajo = t; }
    }

    static class ColaImpresionEnlazada {
        private Nodo head, tail;

        public void agregarTrabajo(TrabajoImpresion t) {
            Nodo nuevo = new Nodo(t);
            if (head == null) {
                head = tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                tail = nuevo;
            }
            System.out.println("Registrado: " + t);
        }

        public void imprimirProximo() {
            if (head == null) {
                System.out.println("No hay trabajos pendientes.");
                return;
            }
            System.out.println("Imprimiendo -> " + head.trabajo);
            head = head.siguiente;
            if (head == null) tail = null;
        }
    }

    public static void main(String[] args) {
        ColaImpresionEnlazada cola = new ColaImpresionEnlazada();
        cola.agregarTrabajo(new TrabajoImpresion("Reporte.pdf", 10, "Carlos"));
        cola.agregarTrabajo(new TrabajoImpresion("Apunte.docx", 4, "Ana"));
        cola.imprimirProximo();
    }
}
