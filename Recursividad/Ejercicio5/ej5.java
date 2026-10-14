public class ej5 {
    public static void conteoRegresivo(int n) {
        // Caso base: si n es menor a 0, se detiene la recursión
        if (n < 0) {
            return;
        }
        
        System.out.print(n + " ");
        
        // Caso recursivo: decrementa n en 1 para acercarse al caso base
        conteoRegresivo(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Conteo regresivo: ");
        conteoRegresivo(5);
        System.out.println();
    }
}
