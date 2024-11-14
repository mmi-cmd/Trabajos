import java.util.HashMap;

public class Palindromos{

    public static boolean isPalindrome (int numero){

        String numeroString = String.valueOf(numero); //convertimos el numero a cadena

        HashMap<Character, Integer> contarDigitos = new HashMap<>();

        for (char digito : numeroString.toCharArray()) { // Contamos la frecuencia de cada dígito
            contarDigitos.put(digito, contarDigitos.getOrDefault(digito, 0)+1);
        }
        
        //Se verifica si es palindromo directamente
        //se usa stringBuilder que permite mutar cadenas y que tiene un metodo reverse
        String numeroIvertido = new StringBuilder(numeroString).reverse().toString(); // se invierte la cadena y se pasa nuevamente a String
        if(numeroString.equals(numeroIvertido)){
            return true; // Si es palíndromo, retornamos true
        }

        // Si no es un palíndromo, verificamos si puede ser reordenado para formar uno
        int impares = 0;
        for (int frecuencia : contarDigitos.values()) { //values devulve una coleccion de los valores del hashmap
            if (frecuencia % 2 != 0) { // Si el número tiene longitud par, impares debe ser 0
                impares++;             // Si el número tiene longitud impar, impares debe ser 1
            }
        }
        return impares<=1;
    }
    
    public static void main(String[] args) {

        System.out.println("¿El numero 5 es palíndromo? " + isPalindrome(5) );
        System.out.println("¿El numero 2121 es palíndromo? " + isPalindrome(2121));
        System.out.println("¿El numero 1331  es palíndromo? " + isPalindrome(1331)); 
        System.out.println("¿El numero 3357665 es palíndromo? " + isPalindrome(3357665));
        System.out.println("¿El numero 1294   es palíndromo? " + isPalindrome(1294 ));
    }
}