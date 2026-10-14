public class ej2 {
    public static int sumarHastaUno(int n) {
        // Caso base: si n es 0, la suma acumulada es 0
        if (n == 0) {
            return 0;
        }
        
        // Caso recursivo: suma el número actual y reduce n en 1
        return n + sumarHastaUno(n - 1);
    }

    public static void main(String[] args) {
        int[] pruebas = {0, 1, 5, 10};
        for (int n : pruebas) {
            System.out.println("Suma de " + n + " hasta 1 = " + sumarHastaUno(n));
        }
    }
}
