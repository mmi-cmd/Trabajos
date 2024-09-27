
import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        double number1 = scanner.nextDouble();
        
        System.out.println("Ingresa otro numero");
        double number2 = scanner.nextDouble();
        
        System.out.println("Ingresa otro numero");
        double number3 = scanner.nextDouble();
        
        
        
        System.out.println("number1>number2 && number1<number3: " + (number1>number2 && number1<number3));
    }
}
