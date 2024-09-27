import java.util.Scanner;
public class EjercicioArrays {
    public static void main(String[] args) {

        int suma=0;
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero en la posicion " + i + ":");

            numeros[i] = scanner.nextInt();

            suma+=numeros[i];
        }
        double promedio = suma/(double)numeros.length;

        System.out.println("El promedio es " + promedio);
        
        scanner.close();
    }
}
