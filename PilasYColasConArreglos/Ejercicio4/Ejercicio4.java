public class Ejercicio4 {
    static class HistorialNavegacion {
        private String[] historial;
        private int top;

        public HistorialNavegacion(int capacidad) {
            historial = new String[capacidad];
            top = -1;
        }

        public void visitar(String url) {
            historial[++top] = url;
            System.out.println("Visitando: " + url);
        }

        public void retroceder() {
            if (top <= 0) {
                System.out.println("No hay páginas anteriores en el historial.");
                return;
            }
            top--; // Desapila la actual y vuelve a la anterior
            System.out.println("Retrocediendo a: " + historial[top]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion navegador = new HistorialNavegacion(5);
        navegador.visitar("google.com");
        navegador.visitar("github.com");
        navegador.visitar("stackoverflow.com");
        navegador.retroceder();
    }    
}
