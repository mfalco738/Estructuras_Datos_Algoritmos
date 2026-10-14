public class ej1 {

    public static int factorial(int n) {
        // Caso base: si n es 0 o 1, retorna 1 y detiene la pila de llamadas
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Caso recursivo: multiplica n por el factorial del número anterior (reduce el problema)
        // La pila de llamadas acumulará las operaciones hasta resolver el caso base.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int[] pruebas = {0, 1, 5, 6};
        for (int n : pruebas) {
            System.out.println("Factorial de " + n + " = " + factorial(n));
        }
    }
}