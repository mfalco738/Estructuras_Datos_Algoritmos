public class Ejercicio2 {
    static class TorrePlatos {
        private String[] platos;
        private int top;

        public TorrePlatos(int capacidad) {
            platos = new String[capacidad];
            top = -1;
        }

        public void agregarPlato(String plato) {
            if (top == platos.length - 1) {
                System.out.println("La torre está llena, se caerán los platos.");
                return;
            }
            platos[++top] = plato;
            System.out.println("Agregado: " + plato);
        }

        public String retirarPlato() {
            if (top == -1) {
                System.out.println("La torre está vacía.");
                return null;
            }
            String retirado = platos[top--];
            System.out.println("Retirado: " + retirado);
            return retirado;
        }

        public String consultarSuperior() {
            if (top == -1) return "Torre vacía";
            return platos[top];
        }
    }

    public static void main(String[] args) {
        TorrePlatos torre = new TorrePlatos(3);
        torre.agregarPlato("Plato Hondo");
        torre.agregarPlato("Plato Llano");
        System.out.println("Plato arriba de todo: " + torre.consultarSuperior());
        torre.retirarPlato();
        System.out.println("Plato arriba tras retirar: " + torre.consultarSuperior());
    }
}
