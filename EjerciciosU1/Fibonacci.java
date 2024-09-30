public class Fibonacci{
    public static void main(String[] args) {
        long inicialNumber = 0;
        long secondNumber = 1;
        final int MAX_NUMBER = 50;
        
        /*Con for */
        System.out.print(inicialNumber + "," + secondNumber + ",");
        for (int i = 2; i < MAX_NUMBER; i++) {
        long thirdNumber = inicialNumber + secondNumber;
        inicialNumber = secondNumber;
        secondNumber = thirdNumber;
            System.out.print( thirdNumber + ","); 
        } 
        
        /*Con while */
        System.out.print(inicialNumber + "," + secondNumber);

        int i=2;
        while (i<MAX_NUMBER) {
            long thirdNumber = inicialNumber + secondNumber;
            inicialNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.print("," + thirdNumber);
            i++;
        }
    } 
}