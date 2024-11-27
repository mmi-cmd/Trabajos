import java.util.Scanner;

public class DivisionPorCero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        double number1 = scanner.nextDouble();

        System.out.println("Ingrese el divisor");
        double number2 = scanner.nextDouble();

        try {
            if (number2 == 0) {
                throw new ArithmeticException("Una división por cero es indeterminada");
            }
            double cociente = number1 / number2;
            System.out.println("El resultado es " + cociente);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

