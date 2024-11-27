import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");

        double number1 = scanner.nextDouble();

        try {
            if (number1 < 0) {
                throw new IllegalArgumentException("Un numero negativo no tiene raiz cuadrada");
            }
            double raiz = Math.sqrt(number1);
            System.out.println("La raíz cuadrada de " + number1 + " es: " + raiz);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
