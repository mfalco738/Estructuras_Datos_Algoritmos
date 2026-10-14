public class ej9 {
    public static boolean esPalindromo(String str) {
        // Normalización básica por si acaso
        if (str == null) return false;
        
        // Caso base: si la cadena tiene 0 o 1 carácter, es un palíndromo
        if (str.length() <= 1) {
            return true;
        }
        
        // Si el primer y último carácter no coinciden, no es palíndromo
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        // Caso recursivo: recorta los extremos y evalúa la subcadena interna
        return esPalindromo(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String[] pruebas = {"neuquen", "reconocer", "programacion", "a"};
        for (String s : pruebas) {
            System.out.println("\"" + s + "\" es palíndromo? -> " + esPalindromo(s));
        }
    }
}
