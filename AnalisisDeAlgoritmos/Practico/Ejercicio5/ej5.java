import java.util.Arrays;

public class ej5 {

    public static void main(String[] args) {
        double[] vectorNumerico = {2.5, 4.0, 2.5, -1.0, 8.25, 4.0, 0.0, 3.75, 9.0, 2.5};
        String[] vectorTexto = {"sol", "luna", "sol", "mar", "cielo", "mar", "sol", "tierra", "nube", "luna"};
        
        double numeroBuscado = 2.5;
        String textoBuscado = "sol";

        System.out.println("=== Contar ocurrencias ===");
        System.out.println("Vector numerico: " + Arrays.toString(vectorNumerico));
        System.out.println("Valor buscado: " + numeroBuscado);
        System.out.println("Aparece " + contarOcurrencias(vectorNumerico, numeroBuscado) + " veces.");

        System.out.println("\nVector de texto: " + Arrays.toString(vectorTexto));
        System.out.println("Valor buscado: \"" + textoBuscado + "\"");
        System.out.println("Aparece " + contarOcurrencias(vectorTexto, textoBuscado) + " veces.");

        System.out.println("\n=== Analisis de complejidad ===");
        System.out.println("Complejidad temporal: O(n), porque se recorre todo el vector para contar las apariciones y comprobar si el valor no esta.");
        System.out.println("Complejidad espacial adicional: O(1), porque solo se utiliza un contador.");
    }

    /**
     * Cuenta las apariciones exactas del valor buscado en el vector.
     * Complejidad temporal: O(n). Complejidad espacial: O(1).
     */
    public static int contarOcurrencias(double[] vector, double valorBuscado) {
        int ocurrencias = 0;

        for (double valor : vector) {
            if (Double.compare(valor, valorBuscado) == 0) {
                ocurrencias++;
            }
        }

        return ocurrencias;
    }

    /**
     * Cuenta las apariciones del texto buscado en el vector.
     * Complejidad temporal: O(n). Complejidad espacial: O(1).
     */
    public static int contarOcurrencias(String[] vector, String valorBuscado) {
        int ocurrencias = 0;

        for (String valor : vector) {
            if (valorBuscado.equals(valor)) {
                ocurrencias++;
            }
        }

        return ocurrencias;
    }
}
