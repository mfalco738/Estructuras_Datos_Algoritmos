public class ej10 {
    // Método auxiliar para iniciar la búsqueda desde el índice 0
    public static boolean buscar(int[] arreglo, int valor) {
        return buscarRecursivo(arreglo, valor, 0);
    }

    private static boolean buscarRecursivo(int[] arreglo, int valor, int indice) {
        // Caso base 1: si el índice sale del arreglo, el elemento no fue encontrado
        if (indice >= arreglo.length) {
            return false;
        }
        
        // Caso base 2: si encontramos el valor en la posición actual
        if (arreglo[indice] == valor) {
            return true;
        }
        
        // Caso recursivo: avanza al siguiente índice sin usar ciclos
        return buscarRecursivo(arreglo, valor, indice + 1);
    }

    public static void main(String[] args) {
        int[] vector = {4, 12, 8, 25, 7, 3};
        
        int[] aBuscar = {8, 99, 4, 3};
        for (int val : aBuscar) {
            System.out.println("¿Está el número " + val + "? -> " + buscar(vector, val));
        }
    }
}
