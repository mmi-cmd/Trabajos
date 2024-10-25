public class CadenaPorValor {
    
public static void modificarCadena(String nombre){
    nombre = "Juan";

    System.out.println("La cadena dentro del método es: " + nombre);
}
public static void main(String[] args) {
        String nombre = "Maria";
        System.out.println("La cadena antes de llamar al método es: " + nombre);
        modificarCadena(nombre);
        System.out.println("La cadena después de llamar al método es: " + nombre); // No cambia

    }
}
