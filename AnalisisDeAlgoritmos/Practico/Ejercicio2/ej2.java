import java.util.Arrays;

public class ej2 {

    public static void buscarElemento(int[] vector, int objetivo) {
        System.out.println("Vector analizado: " + Arrays.toString(vector));
        System.out.println("Buscando el valor: " + objetivo);

        int posicionesRecorridas = 0;
        int indiceEncontrado = -1;

        // Estrategia: Búsqueda lineal (recorrido secuencial)
        for (int i = 0; i < vector.length; i++) {
            posicionesRecorridas++;
            if (vector[i] == objetivo) {
                indiceEncontrado = i;
                break; // Se detiene al encontrar la primera coincidencia
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("¡Encontrado! Posición: " + indiceEncontrado);
        } else {
            System.out.println("El elemento no existe en el vector.");
        }
        System.out.println("Posiciones recorridas: " + posicionesRecorridas + "\n");
    }

    public static void main(String[] args) {
        int[] vectorA = {15, 8, 23, 4, 42, 16};
        int[] vectorB = {10, 5, 20, 15};
        int[] vectorC = {7, 3, 9, 1};

        buscarElemento(vectorA, 23);
        buscarElemento(vectorB, 99);
        buscarElemento(vectorC, 7);

        System.out.println("Analisis de complejidad (Búsqueda Lineal):");
        System.out.println("- Mejor caso: O(1), el elemento está en la primera posición.");
        System.out.println("- Peor caso: O(n), el elemento está al final o no existe (recorre todo).");
        System.out.println("- Caso promedio: O(n), se examinan en promedio la mitad de los elementos.");
        System.out.println("- Justificacion: Al estar desordenado, la búsqueda lineal es la única estrategia viable pero ineficiente para grandes volúmenes de datos.");
    }
}