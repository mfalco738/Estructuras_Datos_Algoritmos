import java.util.Arrays;

public class ej9 {
    public static void compararBubble(int[] array) {
        int comp = 0, swaps = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comp++;
                if (array[j] > array[j + 1]) {
                    int t = array[j]; array[j] = array[j + 1]; array[j + 1] = t;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble Sort    -> Resultado: " + Arrays.toString(array) + " | Comp: " + comp + " | Swaps: " + swaps);
    }

    public static void compararSelection(int[] array) {
        int comp = 0, swaps = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                comp++;
                if (array[j] < array[min]) min = j;
            }
            if (min != i) {
                int t = array[i]; array[i] = array[min]; array[min] = t;
                swaps++;
            }
        }
        System.out.println("Selection Sort -> Resultado: " + Arrays.toString(array) + " | Comp: " + comp + " | Swaps: " + swaps);
    }

    public static void compararInsertion(int[] array) {
        int comp = 0, desplazamientos = 0;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0) {
                comp++;
                if (array[j] > key) {
                    array[j + 1] = array[j];
                    desplazamientos++;
                    j--;
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
        System.out.println("Insertion Sort -> Resultado: " + Arrays.toString(array) + " | Comp: " + comp + " | Desplazamientos: " + desplazamientos);
    }

    public static void main(String[] args) {
        int[] base = {12, 5, 33, 17, 8, 20};
        System.out.println("Arreglo base: " + Arrays.toString(base) + "\n");
        
        compararBubble(Arrays.copyOf(base, base.length));
        compararSelection(Arrays.copyOf(base, base.length));
        compararInsertion(Arrays.copyOf(base, base.length));
    }
}
