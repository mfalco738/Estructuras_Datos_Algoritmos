import java.util.Arrays;

public class ej3 {
    public static void insertionSort(int[] array) {
        System.out.println("Arreglo inicial casi ordenado: " + Arrays.toString(array));
        int desplazamientos = 0;
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Desplaza los elementos mayores hacia la derecha para hacer lugar a la key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                desplazamientos++; // Contamos cada desplazamiento de elementos
            }
            array[j + 1] = key;
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
        System.out.println("Total de desplazamientos realizados: " + desplazamientos);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 4, 6, 7};
        insertionSort(numeros);
    }
}
