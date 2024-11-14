import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;

public class LettersForNumbers {

    public static String normalizarSinAcentos(String palabra) {
        // Normaliza la palabra a la forma NFD (Descomposición) para separar las letras y los acentos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina los caracteres no ASCII (acentos y marcas diacríticas)
        palabraNormalizada = palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
        return palabraNormalizada;
    }
    
    public static String modificadorAlfabetico (String palabra){

        if (palabra == null || palabra.isEmpty()) {
            return "";
        }

        HashMap<Character,Integer> indiceAlfabetico = new HashMap<>();

        indiceAlfabetico.put('a', 1); indiceAlfabetico.put('b', 2); indiceAlfabetico.put('c', 3); indiceAlfabetico.put('d', 4); indiceAlfabetico.put('e', 5);
        indiceAlfabetico.put('f', 6); indiceAlfabetico.put('g', 7); indiceAlfabetico.put('h', 8); indiceAlfabetico.put('i', 9); indiceAlfabetico.put('j', 10);
        indiceAlfabetico.put('k', 11); indiceAlfabetico.put('l', 12); indiceAlfabetico.put('m', 13); indiceAlfabetico.put('n', 14); indiceAlfabetico.put('o', 15);
        indiceAlfabetico.put('p', 16); indiceAlfabetico.put('q', 17); indiceAlfabetico.put('r', 18); indiceAlfabetico.put('s', 19); indiceAlfabetico.put('t', 20);
        indiceAlfabetico.put('u', 21); indiceAlfabetico.put('v', 22); indiceAlfabetico.put('w', 23); indiceAlfabetico.put('x', 24);
        indiceAlfabetico.put('y', 25); indiceAlfabetico.put('z', 26);

        palabra = normalizarSinAcentos(palabra).toLowerCase().replaceAll("\\s+", "");

        char [] caracteresPalabra = palabra.toCharArray();

        StringBuilder resultado = new StringBuilder();

        for (char c : caracteresPalabra) {
            resultado.append(indiceAlfabetico.get(c) + " ");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(modificadorAlfabetico("abc def"));
        System.out.println(modificadorAlfabetico("áéíóú")); // "1 5 9 15 21"
        System.out.println(modificadorAlfabetico("hello world")); // "8 5 12 12 15 23 15 18 12 4"
        System.out.println(modificadorAlfabetico(""));
    }
}
