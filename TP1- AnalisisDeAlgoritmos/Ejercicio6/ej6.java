import java.util.Arrays;

public class ej6 {

    public static void main(String[] args) {
        int[] vectorA = {8, 2, 5, 9, 1};
        int[] vectorB = {8, 2, 5, 9, 1};
        int[] vectorC = {8, 2, 5, 4, 1};
        int[] vectorD = {8, 2, 5, 9, 1, 7};

        System.out.println("=== Comparar dos vectores ===");
        mostrarComparacion(vectorA, vectorB);
        mostrarComparacion(vectorA, vectorC);
        mostrarComparacion(vectorA, vectorD);

        System.out.println("\n=== Analisis de complejidad ===");
        System.out.println("Mejor caso: O(1), si la longitud es distinta o el primer elemento difiere.");
        System.out.println("Peor caso: O(n), si todos los elementos son iguales o la primera diferencia esta al final.");
        System.out.println("Caso promedio: O(n), si la diferencia aparece en una posicion cualquiera del vector.");
        System.out.println("Complejidad espacial adicional: O(1), porque solo se utilizan variables auxiliares.");

        System.out.println("\nConclusion: detener la comparacion al encontrar una diferencia evita revisar elementos innecesarios.");
    }

    private static void mostrarComparacion(int[] primerVector, int[] segundoVector) {
        System.out.println("\nPrimer vector: " + Arrays.toString(primerVector));
        System.out.println("Segundo vector: " + Arrays.toString(segundoVector));
        System.out.println("Resultado: " + (vectoresIguales(primerVector, segundoVector) ? "son iguales" : "son distintos"));
    }

    /**
     * Compara los elementos en orden y termina al encontrar la primera diferencia.
     * Complejidad temporal: O(n). Complejidad espacial: O(1).
     */
    public static boolean vectoresIguales(int[] primerVector, int[] segundoVector) {
        if (primerVector.length != segundoVector.length) {
            return false;
        }

        for (int indice = 0; indice < primerVector.length; indice++) {
            if (primerVector[indice] != segundoVector[indice]) {
                return false;
            }
        }

        return true;
    }
}
