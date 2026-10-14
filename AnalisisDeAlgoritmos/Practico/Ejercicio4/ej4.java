import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ej4 {

    public static void main(String[] args) {
        int[] vector = {3, 5, 2, 8, 3, 7, 5, 9, 2, 1};

        System.out.println("=== Deteccion de elementos duplicados ===");
        System.out.println("Vector original: " + Arrays.toString(vector));

        ArrayList<Integer> duplicadosDosBucles = buscarDuplicadosConDosBucles(vector);
        ArrayList<Integer> duplicadosHashSet = buscarDuplicadosConHashSet(vector);

        System.out.println("\nSolucion 1 - Dos ciclos anidados: " + duplicadosDosBucles);
        System.out.println("Solucion 2 - HashSet: " + duplicadosHashSet);

        System.out.println("\n=== Comparacion de complejidad ===");
        System.out.println("1) Dos ciclos anidados:");
        System.out.println("   - Tiempo: O(n^2)");
        System.out.println("   - Espacio: O(1) adicional");
        System.out.println("2) HashSet:");
        System.out.println("   - Tiempo promedio: O(n)");
        System.out.println("   - Espacio: O(n) adicional");

        System.out.println("\n=== Conclusion ===");
        System.out.println("La solucion con dos ciclos anidados es simple de entender y no usa memoria extra, pero empeora rapidamente al crecer el vector.");
        System.out.println("La solucion con HashSet es mas eficiente para arreglos grandes, aunque usa mas memoria para guardar valores ya vistos.");
    }

    /**
     * Detecta elementos duplicados usando dos ciclos anidados.
     * Se compara cada elemento con todos los posteriores para ver si existe repetido.
     * 
     * Complejidad temporal: O(n^2)
     * Complejidad espacial: O(1) adicional
     */
    public static ArrayList<Integer> buscarDuplicadosConDosBucles(int[] vector) {
        ArrayList<Integer> duplicados = new ArrayList<>();

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    boolean yaAgregado = false;

                    for (int k = 0; k < duplicados.size(); k++) {
                        if (duplicados.get(k) == vector[i]) {
                            yaAgregado = true;
                            break;
                        }
                    }

                    if (!yaAgregado) {
                        duplicados.add(vector[i]);
                    }
                    break;
                }
            }
        }

        return duplicados;
    }

    /**
     * Detecta elementos duplicados usando un HashSet.
     * Cada elemento nuevo se agrega al conjunto; si ya existe, es un duplicado.
     * 
     * Complejidad temporal promedio: O(n)
     * Complejidad espacial: O(n)
     */
    public static ArrayList<Integer> buscarDuplicadosConHashSet(int[] vector) {
        HashSet<Integer> vistos = new HashSet<>();
        LinkedHashSet<Integer> duplicados = new LinkedHashSet<>();

        for (int valor : vector) {
            if (!vistos.add(valor)) {
                duplicados.add(valor);
            }
        }

        return new ArrayList<>(duplicados);
    }
}
