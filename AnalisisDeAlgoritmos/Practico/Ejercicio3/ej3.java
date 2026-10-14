import java.util.Arrays;
import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        int[] numeros = {3, 7, 11, 18, 22, 23, 29, 32, 37, 42};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vector ordenado: " + Arrays.toString(numeros));
        System.out.print("Ingrese el valor que desea buscar: ");
        int buscado = scanner.nextInt();

        int indice = buscarBinario(numeros, buscado);

        if (indice == -1) {
            System.out.println("El valor " + buscado + " no se encuentra en el vector.");
        } else {
            System.out.println("El valor " + buscado + " se encuentra en el indice " + indice + ".");
        }

        System.out.println("Complejidad temporal: O(log n).");
        System.out.println("Complejidad espacial: O(1).");
        scanner.close();
    }

    private static int buscarBinario(int[] numeros, int buscado) {
        int inicio = 0;
        int fin = numeros.length - 1;
        int iteracion = 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            System.out.printf("Iteracion %d: inicio=%d, fin=%d, medio=%d, valor comparado=%d%n",
                    iteracion, inicio, fin, medio, numeros[medio]);

            if (numeros[medio] == buscado) {
                return medio;
            }

            if (numeros[medio] < buscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }

            iteracion++;
        }

        return -1;
    }
}
