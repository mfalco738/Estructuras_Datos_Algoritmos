public class Ejercicio7 {
    static class SistemaTurnos {
        private String[] cola;
        private int front, rear, size;

        public SistemaTurnos(int capacidad) {
            cola = new String[capacidad];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void llegarPersona(String nombre) {
            if (size == cola.length) {
                System.out.println("Sala de espera llena.");
                return;
            }
            rear = (rear + 1) % cola.length;
            cola[rear] = nombre;
            size++;
            System.out.println(nombre + " obtuvo turno.");
        }

        public void atenderSiguiente() {
            if (size == 0) {
                System.out.println("No hay personas esperando.");
                return;
            }
            System.out.println("Atendiendo a: " + cola[front]);
            front = (front + 1) % cola.length;
            size--;
        }
    }

    public static void main(String[] args) {
        SistemaTurnos sistema = new SistemaTurnos(3);
        sistema.llegarPersona("Juan");
        sistema.llegarPersona("María");
        sistema.atenderSiguiente();
        sistema.llegarPersona("Carlos");
    }
}
