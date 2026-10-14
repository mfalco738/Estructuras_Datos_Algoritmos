public class ej8 {
    public static String invertirPalabra(String palabra) {
        class Nodo {
            char c;
            Nodo sig;
            public Nodo(char c) { this.c = c; }
        }
        Nodo tope = null;

        // Apilar caracteres
        for (int i = 0; i < palabra.length(); i++) {
            Nodo nuevo = new Nodo(palabra.charAt(i));
            nuevo.sig = tope;
            tope = nuevo;
        }

        // Desapilar para invertir
        StringBuilder invertida = new StringBuilder();
        while (tope != null) {
            invertida.append(tope.c);
            tope = tope.sig;
        }
        return invertida.toString();
    }

    public static void main(String[] args) {
        String original = "algoritmo";
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertirPalabra(original));
    }
}
