import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Isogramas {

    public static boolean isIsogram (String palabra){

         // Verificar si el string está vacío
        if (palabra.isEmpty()) {
            return true; 
        }

          // Verificar si la palabra tiene más de dos palabras
        if (palabra.contains(" ")) {
            return false;
        }
        
        palabra=normalizarSinAcentos(palabra).toLowerCase();

        char[] caracteresPalabra = palabra.toCharArray();

        for (int i = 0; i < caracteresPalabra.length; i++) {
            for (int j = i+1; j < caracteresPalabra.length; j++) {
                if (caracteresPalabra[i]==caracteresPalabra[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static String normalizarSinAcentos(String palabra) {
        // Normaliza la palabra a la forma NFD (Descomposición) para separar las letras y los acentos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina los caracteres no ASCII (acentos y marcas diacríticas)
        return palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("")); // true
        System.out.println(isIsogram("reto")); // true
        System.out.println(isIsogram("múrcielago")); // true
        System.out.println(isIsogram("PeRrO")); // false
        System.out.println(isIsogram("GaTo")); // true
        System.out.println(isIsogram("dos palabras")); // false
    }
}