public class Ejercicio3 {
    public static boolean validarBalanceados(String expr) {
        char[] pila = new char[expr.length()];
        int top = -1;

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') {
                pila[++top] = c;
            } else if (c == ')') {
                if (top == -1) {
                    return false; // Hay un cierre sin apertura
                }
                top--; // Simula el pop
            }
        }
        return top == -1; // Si top == -1, está perfectamente balanceado
    }

    public static void main(String[] args) {
        String caso1 = "(5 + 3) * (2 + 1)";
        String caso2 = "(5 + 3)) * (2 + 1";
        
        System.out.println(caso1 + " -> " + (validarBalanceados(caso1) ? "Válido" : "Inválido"));
        System.out.println(caso2 + " -> " + (validarBalanceados(caso2) ? "Válido" : "Inválido"));
    }
}
