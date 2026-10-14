public class ej10 {

    public static void mostrarVector(int[] vector) {
        if (vector == null) {
            System.out.println("El vector es nulo.");
            return;
        }
        if (vector.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void ordenarBurbuja(int[] vector) {
        if (vector == null || vector.length == 0) {
            System.out.println("Comparaciones realizadas: 0");
            System.out.println("Intercambios (swaps) realizados: 0");
            return;
        }

        int comparaciones = 0;
        int intercambios = 0;
        int n = vector.length;

        // Doble ciclo para recorrer y comparar elementos
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++; 

                // Intercambio si el actual es mayor al siguiente
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j]; // Variable temporal para no perder el dato
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    intercambios++; 
                }
            }
        }

        System.out.println("Comparaciones realizadas: " + comparaciones);
        System.out.println("Intercambios (swaps) realizados: " + intercambios);
    }

    public static void main(String[] args) {
        // Casos de prueba
        int[] vectorA = {64, 34, 25, 12, 22, 11, 90}; // Desordenado
        int[] vectorB = {1, 2, 3, 4, 5};             // Ya ordenado
        int[] vectorC = {9, 7, 5, 3, 1};             // Orden inverso
        int[] vectorD = {4, 2, 4, 1, 2};             // Con duplicados
        int[] vectorE = new int[0];                  // Caso borde: vacio

        int[][] pruebas = { vectorA, vectorB, vectorC, vectorD, vectorE };

        for (int i = 0; i < pruebas.length; i++) {
            int[] vectorActual = pruebas[i];
            System.out.println("\nCaso " + (i + 1));
            
            System.out.print("Antes   -> ");
            mostrarVector(vectorActual);
            
            ordenarBurbuja(vectorActual);
            
            System.out.print("Despues -> ");
            mostrarVector(vectorActual);
        }

        System.out.println("\nAnalisis de complejidad y justificacion:");
        System.out.println("- Tiempo: O(n^2), requiere bucles anidados para comparar elementos.");
        System.out.println("- Espacio: O(1), se realiza 'in-place' sin usar memoria adicional significativa.");
        System.out.println("- Justificacion: Es unicamente para fines didacticos por su alta ineficiencia y crecimiento cuadratico frente a muchos datos.");
        System.out.println("- Conclusion: En las pruebas se nota que la cantidad de comparaciones es alta incluso para vectores ya ordenados, confirmando su ineficiencia.");
    }
}