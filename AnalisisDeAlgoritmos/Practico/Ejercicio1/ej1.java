public class ej1 {

    /**
     * Encuentra y devuelve el valor mínimo del vector.
     * 
     * @param vector array de enteros (debe tener al menos un elemento)
     * @return el valor mínimo encontrado
     * @throws IllegalArgumentException si el vector es null o está vacío
     */
    public static int encontrarMinimo(int[] vector) {
        // Validación: el vector no puede ser null ni estar vacío
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede ser null ni estar vacío");
        }

        // Inicializamos el mínimo con el primer elemento del vector
        int minimo = vector[0];

        // Recorremos el vector desde el segundo elemento (índice 1)
        // Comparando cada elemento con el mínimo actual
        for (int i = 1; i < vector.length; i++) {
            // Si el elemento actual es menor que el mínimo, actualizamos
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }

        // Devolvemos el mínimo encontrado
        return minimo;
    }

    /**
     * Método principal para probar el algoritmo.
     */
    public static void main(String[] args) {
        // Casos de prueba
        int[] vector1 = {5, 2, 9, 1, 7, 3};
        int[] vector2 = {42};
        int[] vector3 = {-10, -5, -20, -3, -15};
        int[] vector4 = {100, 50, 75, 25, 10, 90, 67, 80};

        System.out.println("Vector 1: " + java.util.Arrays.toString(vector1));
        System.out.println("Mínimo: " + encontrarMinimo(vector1)); // Esperado: 1

        System.out.println("\nVector 2: " + java.util.Arrays.toString(vector2));
        System.out.println("Mínimo: " + encontrarMinimo(vector2)); // Esperado: 42

        System.out.println("\nVector 3: " + java.util.Arrays.toString(vector3));
        System.out.println("Mínimo: " + encontrarMinimo(vector3)); // Esperado: -20

        System.out.println("\nVector 4: " + java.util.Arrays.toString(vector4));
        System.out.println("Mínimo: " + encontrarMinimo(vector4)); // Esperado: 10

        // Prueba de vector vacío (lanza excepción)
        try {
            int[] vectorVacio = {};
            encontrarMinimo(vectorVacio);
            System.out.println("Mínimo: " + encontrarMinimo(vectorVacio)); // No debería ejecutarse
        } catch (IllegalArgumentException e) {
            System.out.println("\nExcepción capturada correctamente: " + e.getMessage());
        }
    }
}
