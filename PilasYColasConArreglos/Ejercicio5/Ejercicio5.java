public class Ejercicio5 {
    static class PilaGenerica<T> {
        private Object[] arreglo;
        private int top;

        public PilaGenerica(int capacidad) {
            arreglo = new Object[capacidad];
            top = -1;
        }

        public void push(T elemento) {
            arreglo[++top] = elemento;
        }

        @SuppressWarnings("unchecked")
        public T pop() {
            if (top == -1) return null;
            return (T) arreglo[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        PilaGenerica<String> pilaNombres = new PilaGenerica<>(2);
        pilaNombres.push("Carlos");
        pilaNombres.push("Ana");
        System.out.println("Elemento pop String: " + pilaNombres.pop());

        PilaGenerica<Integer> pilaNums = new PilaGenerica<>(2);
        pilaNums.push(99);
        System.out.println("Elemento pop Integer: " + pilaNums.pop());
    }
}
