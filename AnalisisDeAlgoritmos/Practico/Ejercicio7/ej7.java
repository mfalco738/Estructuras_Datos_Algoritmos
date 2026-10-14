import java.util.Arrays;

public class ej7 {

    public static void main(String[] args) {
        int[] vectorA = {1, 2, 3, 4, 5};
        int[] vectorB = {10, -3, 0, 7, 2, 9};
        int[] vectorC = {};

        System.out.println("=== Invertir un vector ===");

        mostrarInversion("Vector A", vectorA);
        mostrarInversion("Vector B", vectorB);
        mostrarInversion("Vector C", vectorC);

        System.out.println("\n=== Analisis de complejidad ===");
        System.out.println("Versión con vector auxiliar: O(n) de tiempo porque recorre todo el vector para copiarlo en orden inverso y O(n) de espacio adicional porque crea un arreglo nuevo.");
        System.out.println("\nVersión in-place: O(n) de tiempo porque recorre aproximadamente la mitad del vector e intercambia posiciones, y O(1) de espacio adicional porque no crea un arreglo nuevo.");
        System.out.println("\nConclusión: la solución in-place es más eficiente en memoria, mientras que la versión con vector auxiliar puede ser más simple de entender e implementar.");
    }

    private static void mostrarInversion(String nombre, int[] vectorOriginal) {
        int[] copiaAuxiliar = Arrays.copyOf(vectorOriginal, vectorOriginal.length);
        int[] copiaInPlace = Arrays.copyOf(vectorOriginal, vectorOriginal.length);

        System.out.println("\n--- " + nombre + " ---");
        System.out.println("Original: " + Arrays.toString(vectorOriginal));

        System.out.println("\n1) Con vector auxiliar:");
        int[] invertidoAux = invertirConVectorAuxiliar(copiaAuxiliar);
        System.out.println("Resultado: " + Arrays.toString(invertidoAux));

        System.out.println("\n2) In-place:");
        int[] invertidoInPlace = invertirInPlace(copiaInPlace);
        System.out.println("Resultado: " + Arrays.toString(invertidoInPlace));
    }

    /**
     * Invierte el vector creando un arreglo auxiliar.
     * Complejidad temporal: O(n)
     * Complejidad espacial: O(n)
     */
    public static int[] invertirConVectorAuxiliar(int[] vector) {
        int[] auxiliar = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            auxiliar[i] = vector[vector.length - 1 - i];
        }

        return auxiliar;
    }

    /**
     * Invierte el vector sin crear un arreglo adicional.
     * Complejidad temporal: O(n)
     * Complejidad espacial: O(1)
     */
    public static int[] invertirInPlace(int[] vector) {
        int inicio = 0;
        int fin = vector.length - 1;

        while (inicio < fin) {
            int temporal = vector[inicio];
            vector[inicio] = vector[fin];
            vector[fin] = temporal;

            inicio++;
            fin--;
        }

        return vector;
    }
}
