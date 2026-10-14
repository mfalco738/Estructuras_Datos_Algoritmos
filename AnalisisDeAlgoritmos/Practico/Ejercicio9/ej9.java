public class ej9 {

    public static void mostrarMatriz(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o es nula.");
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

    public static int encontrarMayorMatriz(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        int maximo = matriz[0][0];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] > maximo) {
                    maximo = matriz[fila][columna];
                }
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        int[][] matrizA = {{1, 8, 3}, {4, 5, 6}};
        int[][] matrizB = {{-10, -3, -20}, {-5, -2, -7}};
        int[][] matrizC = {{7, 7}, {7, 7}};
        int[][] matrizVacia = new int[0][0];

        int[][][] pruebas = { matrizA, matrizB, matrizC, matrizVacia };

        for (int i = 0; i < pruebas.length; i++) {
            int[][] matrizActual = pruebas[i];
            System.out.println("\nCaso " + (i + 1));
            mostrarMatriz(matrizActual);
            
            try {
                int mayor = encontrarMayorMatriz(matrizActual);
                System.out.println("El mayor elemento es: " + mayor);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nAnalisis de complejidad y justificacion:");
        System.out.println("- Tiempo: O(m * n), porque se visita cada elemento una sola vez.");
        System.out.println("- Espacio: O(1), solo se usa una variable auxiliar para el valor maximo.");
        System.out.println("- Recorrido: Es estrictamente necesario recorrer toda la matriz porque al no estar ordenada, cualquier elemento ignorado podria ser el mayor.");
    }
}

