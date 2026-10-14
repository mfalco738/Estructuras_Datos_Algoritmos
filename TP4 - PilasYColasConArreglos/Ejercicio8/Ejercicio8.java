public class Ejercicio8 {
    static class Documento {
        String nombre;
        int paginas;
        public Documento(String n, int p) { nombre = n; paginas = p; }
        @Override public String toString() { return nombre + " (" + paginas + " págs)"; }
    }

    static class ColaImpresion {
        private Documento[] docs;
        private int front, rear, size;

        public ColaImpresion(int cap) {
            docs = new Documento[cap];
            front = 0; rear = -1; size = 0;
        }

        public void agregarDocumento(Documento d) {
            if (size == docs.length) { System.out.println("Cola de impresión llena."); return; }
            rear = (rear + 1) % docs.length;
            docs[rear] = d;
            size++;
        }

        public void imprimirSiguiente() {
            if (size == 0) { System.out.println("No hay documentos."); return; }
            System.out.println("Imprimiendo: " + docs[front]);
            front = (front + 1) % docs.length;
            size--;
        }
    }

    public static void main(String[] args) {
        ColaImpresion cola = new ColaImpresion(3);
        cola.agregarDocumento(new Documento("PDF_Matematica.pdf", 5));
        cola.agregarDocumento(new Documento("Guia_Java.docx", 2));
        cola.imprimirSiguiente();
    }
}
