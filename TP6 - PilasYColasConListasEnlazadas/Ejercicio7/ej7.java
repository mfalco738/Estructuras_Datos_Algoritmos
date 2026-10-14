public class ej7 {
    static class PilaCaracteres {
        static class Nodo {
            char car;
            Nodo siguiente;
            public Nodo(char car) { this.car = car; }
        }
        private Nodo tope;

        public void push(char c) {
            Nodo n = new Nodo(c);
            n.siguiente = tope;
            tope = n;
        }

        public char pop() {
            if (tope == null) return '\0';
            char c = tope.car;
            tope = tope.siguiente;
            return c;
        }

        public boolean isEmpty() { return tope == null; }
    }

    public static boolean estaBalanceado(String expr) {
        PilaCaracteres pila = new PilaCaracteres();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String caso1 = "(2 + 3) * (5 - 1)";
        String caso2 = "(2 + 3";
        System.out.println(caso1 + " -> " + estaBalanceado(caso1));
        System.out.println(caso2 + " -> " + estaBalanceado(caso2));
    }
}
