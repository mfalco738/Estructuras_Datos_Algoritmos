public class Ejercicio10 {
    static class ColaCircular {
        private int[] arreglo;
        private int front, rear, size, capacidad;

        public ColaCircular(int capacidad) {
            this.capacidad = capacidad;
            arreglo = new int[capacidad];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isFull() { return size == capacidad; }
        public boolean isEmpty() { return size == 0; }

        public void enqueue(int val) {
            if (isFull()) {
                System.out.println("Cola circular llena.");
                return;
            }
            rear = (rear + 1) % capacidad; // Movimiento circular
            arreglo[rear] = val;
            size++;
            System.out.println("Encolado: " + val);
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Cola circular vacía.");
                return -1;
            }
            int val = arreglo[front];
            front = (front + 1) % capacidad; // Movimiento circular
            size--;
            System.out.println("Desencolado: " + val);
            return val;
        }
    }

    public static void main(String[] args) {
        ColaCircular cc = new ColaCircular(3);
        cc.enqueue(1);
        cc.enqueue(2);
        cc.dequeue(); // Libera una posición al inicio
        cc.enqueue(3); // Vuelve a ocupar de forma circular
        cc.enqueue(4); // Completa el ciclo
    }
}
