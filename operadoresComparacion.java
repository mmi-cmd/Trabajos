
import java.util.Scanner;

public class operadoresComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 1 numero");
        double number1 = scanner.nextDouble();
        
        System.out.println("Ingresa otro numero");
        double number2 = scanner.nextDouble();
        
        System.out.println("¿El numero 1 es igual al numero 2? " + (number1==number2));
        System.out.println("¿El numero 1 es diferente al numero 2? " + (number1!=number2));
        System.out.println("¿El numero 1 es menor al numero 2? " + (number1<number2));
        System.out.println("¿El numero 1 es mayor al numero 2? " + (number1>number2));
        System.out.println("¿El numero 1 es menor o igual al numero 2? " + (number1<=number2));
        System.out.println("¿El numero 1 es mayor o igual al numero 2? " + (number1>=number2));
    
        
     
    }
}
