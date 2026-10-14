import java.util.Arrays;

public class ej7 {
    static int contadorLlamadas = 0;

    public static void quickSortPeorCaso(int[] array, int bajo, int alto) {
        contadorLlamadas++;
        if (bajo < alto) {
            int pi = particion(array, bajo, alto);
            quickSortPeorCaso(array, bajo, pi - 1);
            quickSortPeorCaso(array, pi + 1, alto);
        }
    }

    private static int particion(int[] array, int bajo, int alto) {
        int pivote = array[bajo];
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
        return i - 1;
    }

    public static void main(String[] args) {
        int[] numerosOrdenados = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Arreglo ordenado inicial: " + Arrays.toString(numerosOrdenados));
        
        contadorLlamadas = 0;
        quickSortPeorCaso(numerosOrdenados, 0, numerosOrdenados.length - 1);
        
        System.out.println("Arreglo final: " + Arrays.toString(numerosOrdenados));
        System.out.println("Cantidad total de llamadas recursivas (Peor Caso): " + contadorLlamadas);
    }
}
