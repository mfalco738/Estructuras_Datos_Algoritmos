public class Ejercicio6 {
    static class ColaEnteros {
        private int[] arreglo;
        private int front, rear, size, capacidad;

        public ColaEnteros(int capacidad) {
            this.capacidad = capacidad;
            arreglo = new int[capacidad];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() { return size == 0; }
        public boolean isFull() { return size == capacidad; }

        public void enqueue(int val) {
            if (isFull()) {
                System.out.println("Cola llena.");
                return;
            }
            rear = (rear + 1) % capacidad; // En cola simple lineal avanza
            arreglo[rear] = val;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Cola vacía.");
                return -1;
            }
            int val = arreglo[front];
            front = (front + 1) % capacidad;
            size--;
            return val;
        }

        public int front() {
            if (isEmpty()) return -1;
            return arreglo[front];
        }
    }

    public static void main(String[] args) {
        ColaEnteros cola = new ColaEnteros(3);
        cola.enqueue(5);
        cola.enqueue(10);
        System.out.println("Frente de la cola: " + cola.front());
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Nuevo frente: " + cola.front());
    }
}
