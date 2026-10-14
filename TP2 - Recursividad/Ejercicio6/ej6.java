public class ej6 {
    public static int contarDigitos(int n) {
        // Caso base: si el número es menor a 10, tiene exactamente 1 dígito
        if (n < 10) {
            return 1;
        }
        
        // Caso recursivo: cuenta 1 dígito actual y reduce el número eliminando el último con / 10
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        int[] pruebas = {7, 45, 382, 9004};
        for (int n : pruebas) {
            System.out.println("Cantidad de dígitos de " + n + " = " + contarDigitos(n));
        }
    }
}
