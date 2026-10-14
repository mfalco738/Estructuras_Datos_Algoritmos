public class Ejercicio1 {
    static class PilaEnteros {
        private int[] arreglo;
        private int top;
        private int capacidad;

        public PilaEnteros(int capacidad) {
            this.capacidad = capacidad;
            this.arreglo = new int[capacidad];
            this.top = -1; // -1 indica que la pila está vacía
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacidad - 1;
        }

        public void push(int val) {
            if (isFull()) {
                System.out.println("Error: Pila llena (Overflow). No se puede insertar " + val);
                return;
            }
            arreglo[++top] = val; // Incrementa top y asigna el valor
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Error: Pila vacía (Underflow).");
                return -1;
            }
            return arreglo[top--]; // Retorna el elemento y decrementa top
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Error: Pila vacía.");
                return -1;
            }
            return arreglo[top];
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        PilaEnteros pila = new PilaEnteros(3);
        pila.push(10);
        pila.push(20);
        System.out.println("Elemento superior (peek): " + pila.peek());
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Pop extraído: " + pila.pop());
        System.out.println("¿Está vacía? " + pila.isEmpty());
    }
}
