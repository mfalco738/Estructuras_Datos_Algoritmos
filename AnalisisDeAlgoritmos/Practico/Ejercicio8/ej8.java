public class ej8 {

    public static void mostrarMatriz(int[][] matriz) {
        if (matriz == null) {
            System.out.println("La matriz es nula.");
            return;
        }

        System.out.println("Matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("[");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
                if (columna < matriz[fila].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int sumarMatriz(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz no puede ser nula.");
        }

        int total = 0;
        int operaciones = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            operaciones++; // Se recorre cada fila.

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                operaciones++; // Se recorre cada columna.

                int valor = matriz[fila][columna];
                operaciones++; // Se accede al elemento actual.

                total += valor;
                operaciones++; // Se realiza la suma al acumulador.
            }
        }

        System.out.println("Operaciones realizadas: " + operaciones);
        return total;
    }

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizB = {
            {10, -3, 0},
            {5, 2, 7},
            {1, 8, -1}
        };

        int[][] matrizC = {
            {0, 0},
            {0, 0}
        };

        int[][] matrizVacia = new int[0][0];

        int[][][] pruebas = { matrizA, matrizB, matrizC, matrizVacia };

        for (int i = 0; i < pruebas.length; i++) {
            int[][] matrizActual = pruebas[i];
            System.out.println("\nCaso " + (i + 1));
            mostrarMatriz(matrizActual);
            int suma = sumarMatriz(matrizActual);
            System.out.println("La suma total de la matriz es: " + suma);
        }

        System.out.println("\nAnalisis de complejidad:");
        System.out.println("- Tiempo: O(m * n), porque se visita cada elemento de la matriz exactamente una vez.");
        System.out.println("- Espacio adicional: O(1), porque solo se usan variables auxiliares para recorrer la matriz y acumular la suma.");
    }
}
