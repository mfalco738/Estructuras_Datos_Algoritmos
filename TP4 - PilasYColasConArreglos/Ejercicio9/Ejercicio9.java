import java.util.Arrays;

public class Ejercicio9 {
    static class ColaSimpleDesperdicio {
        private int[] arreglo;
        private int front, rear;

        public ColaSimpleDesperdicio(int capacidad) {
            arreglo = new int[capacidad];
            front = 0;
            rear = -1;
        }

        public void enqueue(int val) {
            if (rear == arreglo.length - 1) {
                System.out.println("No se puede encolar " + val + " (Arreglo al límite derecho).");
                return;
            }
            arreglo[++rear] = val;
        }

        public int dequeue() {
            if (front > rear) {
                System.out.println("Cola vacía.");
                return -1;
            }
            int val = arreglo[front];
            arreglo[front] = 0; // Marca el espacio liberado
            front++;
            return val;
        }

        public void mostrarEstado() {
            System.out.println("Arreglo: " + Arrays.toString(arreglo) + " | front: " + front + ", rear: " + rear);
        }
    }

    public static void main(String[] args) {
        ColaSimpleDesperdicio cola = new ColaSimpleDesperdicio(4);
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.mostrarEstado();

        cola.dequeue();
        cola.dequeue();
        cola.mostrarEstado(); // Demuestra el espacio libre desperdiciado a la izquierda
    }    
}
