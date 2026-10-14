import java.util.Arrays;

public class ej8 {
    public static void mergeSort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            System.out.println("Dividiendo: " + Arrays.toString(Arrays.copyOfRange(array, izquierda, derecha + 1)));

            // Ordena la mitad izquierda
            mergeSort(array, izquierda, medio);
            // Ordena la mitad derecha
            mergeSort(array, medio + 1, derecha);

            // Fusiona ambas mitades ordenadas
            merge(array, izquierda, medio, derecha);
        }
    }

    private static void merge(int[] array, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] izqArr = new int[n1];
        int[] derArr = new int[n2];

        for (int i = 0; i < n1; i++) izqArr[i] = array[izquierda + i];
        for (int j = 0; j < n2; j++) derArr[j] = array[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (izqArr[i] <= derArr[j]) {
                array[k++] = izqArr[i++];
            } else {
                array[k++] = derArr[j++];
            }
        }

        while (i < n1) array[k++] = izqArr[i++];
        while (j < n2) array[k++] = derArr[j++];

        System.out.println("-> Fusionado: " + Arrays.toString(Arrays.copyOfRange(array, izquierda, derecha + 1)));
    }

    public static void main(String[] args) {
        int[] numeros = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        mergeSort(numeros, 0, numeros.length - 1);
        System.out.println("Arreglo ordenado final: " + Arrays.toString(numeros));
    }
}
