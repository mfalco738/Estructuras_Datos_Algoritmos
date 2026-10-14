import java.util.Arrays;

public class ej6 {
    public static void quickSort(int[] array, int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(array, bajo, alto);
            quickSort(array, bajo, pi - 1);
            quickSort(array, pi + 1, alto);
        }
    }

    private static int particion(int[] array, int bajo, int alto) {
        int pivote = array[bajo]; // El primer elemento como pivote
        System.out.println("Pivote elegido: " + pivote + " en rango [" + bajo + "..." + alto + "]");
        
        int i = bajo + 1;
        for (int j = bajo + 1; j <= alto; j++) {
            if (array[j] < pivote) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        int temp = array[bajo];
        array[bajo] = array[i - 1];
        array[i - 1] = temp;

        System.out.println("Subarreglo parcial tras partición: " + Arrays.toString(array));
        return i - 1;
    }

    public static void main(String[] args) {
        int[] numeros = {24, 9, 29, 14, 19, 27};
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        quickSort(numeros, 0, numeros.length - 1);
        System.out.println("Arreglo final ordenado: " + Arrays.toString(numeros));
    }
}
