import java.util.Arrays;

public class ej2 {
    public static void bubbleSort(int[] array) {
        int comparaciones = 0;
        int intercambios = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambios++;
                }
            }
        }
        System.out.println("Bubble Sort -> Arreglo: " + Arrays.toString(array) + 
                           " | Comparaciones: " + comparaciones + " | Intercambios: " + intercambios);
    }

    public static void selectionSort(int[] array) {
        int comparaciones = 0;
        int intercambios = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                intercambios++;
            }
        }
        System.out.println("Selection Sort -> Arreglo: " + Arrays.toString(array) + 
                           " | Comparaciones: " + comparaciones + " | Intercambios: " + intercambios);
    }

    public static void main(String[] args) {
        int[] original = {29, 10, 14, 37, 13};
        
        System.out.println("Arreglo inicial: " + Arrays.toString(original));
        bubbleSort(Arrays.copyOf(original, original.length));
        selectionSort(Arrays.copyOf(original, original.length));
    }
}
