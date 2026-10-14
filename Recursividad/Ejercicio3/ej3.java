public class ej3 {

    public static int multiplicar(int a, int b) {
        // Caso base: cualquier número multiplicado por 0 es 0
        if (b == 0) {
            return 0;
        }
        
        // Caso recursivo: suma 'a' y reduce 'b' en 1 en cada paso
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int[][] pruebas = {{5, 3}, {4, 0}, {0, 6}, {7, 1}};
        for (int[] p : pruebas) {
            System.out.println(p[0] + " * " + p[1] + " = " + multiplicar(p[0], p[1]));
        }
    }
}
