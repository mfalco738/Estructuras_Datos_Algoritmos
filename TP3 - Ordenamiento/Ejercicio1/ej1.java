import java.util.Arrays;

public class ej1 {
    public static void bubbleSortPasoAPaso(int[] array) {
        System.out.println("Arreglo original: " + Arrays.toString(array));
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // En cada pasada, el elemento mayor se desplaza hacia la derecha (final)
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambio (swap) si el actual es mayor al siguiente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // Muestra el estado del arreglo después de cada pasada
            System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22};
        bubbleSortPasoAPaso(numeros);
    }
}
