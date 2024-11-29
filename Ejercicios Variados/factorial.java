import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del que desea el factorial");
        int num = scanner.nextInt();

        int factorial=1;
        int i=1;

        while (i<=num) {
            factorial=factorial*i;
            i++;
        }
        
        System.out.println("El factorial es: " + factorial);
    }
}
