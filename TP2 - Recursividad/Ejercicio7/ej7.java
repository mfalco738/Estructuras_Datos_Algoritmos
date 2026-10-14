public class ej7 {
    public static int sumarDigitos(int n) {
        // Caso base: si el número es menor a 10, el dígito es él mismo
        if (n < 10) {
            return n;
        }
        
        // Caso recursivo: extrae el último dígito (n % 10) y suma el resultado de procesar el resto (n / 10)
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        int[] pruebas = {5, 48, 321, 9052};
        for (int n : pruebas) {
            System.out.println("Suma de dígitos de " + n + " = " + sumarDigitos(n));
        }
    }
}
