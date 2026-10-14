package PilasYColasConListasEnlazadas.Practico.Ejercicio5;

public class ej5 {
    static class HistorialNavegacion {
        static class Nodo {
            String url;
            Nodo siguiente;
            public Nodo(String url) { this.url = url; }
        }

        private Nodo tope;

        public void visitar(String url) {
            Nodo nuevo = new Nodo(url);
            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println("Visitando: " + url);
        }

        public void volverAtras() {
            if (tope == null || tope.siguiente == null) {
                System.out.println("No hay páginas anteriores.");
                return;
            }
            tope = tope.siguiente; // Remueve la actual y vuelve a la anterior
            System.out.println("Regresó a: " + tope.url);
        }

        public void consultarActual() {
            if (tope != null) {
                System.out.println("Página actual: " + tope.url);
            } else {
                System.out.println("Historial vacío.");
            }
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion nav = new HistorialNavegacion();
        nav.visitar("google.com");
        nav.visitar("github.com");
        nav.consultarActual();
        nav.volverAtras();
        nav.consultarActual();
    }
}
