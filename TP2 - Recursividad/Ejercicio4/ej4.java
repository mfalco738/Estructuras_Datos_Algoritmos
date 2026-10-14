public class ej4 {
    public static int potencia(int base, int exponente) {
        // Caso base: todo número elevado a la potencia 0 es 1
        if (exponente == 0) {
            return 1;
        }
        
        // Caso recursivo: multiplica la base por la potencia con exponente disminuido en 1
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int[][] pruebas = {{2, 3}, {5, 0}, {3, 4}, {0, 5}};
        for (int[] p : pruebas) {
            System.out.println(p[0] + " ^ " + p[1] + " = " + potencia(p[0], p[1]));
        }
    }
}
