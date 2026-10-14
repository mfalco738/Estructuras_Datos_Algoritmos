import java.util.Arrays;

public class ej5 {
    public static void shellSort(int[] array) {
        System.out.println("Arreglo original: " + Arrays.toString(array));
        int n = array.length;

        // Comienza con un gap grande y lo va reduciendo a la mitad
        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println("\n--- Gap actual: " + gap + " ---");

            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                // Realiza un ordenamiento por inserción adaptado al gap actual
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            System.out.println("Estado del arreglo tras pasada con gap " + gap + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numeros = {35, 12, 43, 8, 51, 19, 23, 5};
        shellSort(numeros);
    }
}
