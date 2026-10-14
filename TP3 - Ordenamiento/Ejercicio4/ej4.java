import java.util.Arrays;

public class ej4 {
    public static void selectionSortNombres(String[] array) {
        System.out.println("Nombres originales: " + Arrays.toString(array));
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // compareTo retorna < 0 si array[j] alfabéticamente va antes que array[minIndex]
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Intercambio de nombres
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Nombres ordenados alfabéticamente: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] nombres = {"Lucia", "Ana", "Pedro", "Juan"};
        selectionSortNombres(nombres);
    }
}
