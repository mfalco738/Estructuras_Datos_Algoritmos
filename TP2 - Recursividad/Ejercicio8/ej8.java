public class ej8 {
    public static String invertirPalabra(String str) {
        // Caso base: si la cadena es vacía o tiene 1 carácter, se retorna tal cual
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        // Caso recursivo: toma el primer carácter, invierte el resto y lo coloca al final
        return invertirPalabra(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String[] pruebas = {"hola", "reconocer", "java", ""};
        for (String s : pruebas) {
            System.out.println("Original: \"" + s + "\" -> Invertida: \"" + invertirPalabra(s) + "\"");
        }
    }
}
