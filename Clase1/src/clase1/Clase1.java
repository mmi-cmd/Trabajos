
package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite cantidad de empleados: ");
        int cantidadEmpleado = scanner.nextInt();
       
        String nombre;
        int dia;
        double pagoDiario;
        double pago;
        String tipo;
        
        for (int i=0 ; i<= cantidadEmpleado; i++){
            
           System.out.print("Ingrese nombre del empleado: ");
           scanner.next();
           nombre = scanner.nextLine();
           
           
           System.out.print("Ingrese los dias trabajados: ");
           dia = scanner.nextInt();
           
           System.out.print("Ingrese el pago diario: ");
           pagoDiario = scanner.nextDouble();
           
           pago = dia*pagoDiario;
           
           if (dia > 20) {
               pago += 20000;
           } else if (dia < 10){
               pago -= 10000;
           }
           
           if (pago > 100000) {
               tipo = " Sueldo alto";
           } else {
               tipo = " Sueldo bajo";
           }       
           
           //tipo = (pago > 100000) ? "alto" : "bajo";
           
           System.out.print("El pago diario de es: " + pago + " ." + tipo);
        }
        
        
        
        
        /*int i = 0;
        while (i<=cantidadEmpleado){
            System.out.print(i);
            i++;
        }
        
        do{
            System.out.print(i);
        }while(i<=cantidadEmpleado);*/
        
       
    }
    
}
