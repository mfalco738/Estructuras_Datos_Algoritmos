package Ordenamiento.Practico.Ejercicio10;

class Jugador {
    String nombre;
    int puntaje;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return nombre + " (" + puntaje + " pts)";
    }
}

public class ej10 {
    // Se elige Insertion Sort por su eficiencia adaptativa en arreglos pequeños o semi-ordenados
    public static void ordenarRanking(Jugador[] ranking) {
        int n = ranking.length;
        for (int i = 1; i < n; i++) {
            Jugador key = ranking[i];
            int j = i - 1;

            // Orden descendente (de mayor a menor puntaje)
            while (j >= 0 && ranking[j].puntaje < key.puntaje) {
                ranking[j + 1] = ranking[j];
                j--;
            }
            ranking[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Jugador[] ranking = {
            new Jugador("Ana", 1200),
            new Jugador("Pedro", 900),
            new Jugador("Lucia", 1500)
        };

        System.out.println("Ranking antes de ordenar:");
        for (Jugador j : ranking) {
            System.out.println("- " + j);
        }

        ordenarRanking(ranking);

        System.out.println("\nRanking final ordenado (Mayor a Menor):");
        for (int i = 0; i < ranking.length; i++) {
            System.out.println((i + 1) + ". " + ranking[i]);
        }
    }
}
