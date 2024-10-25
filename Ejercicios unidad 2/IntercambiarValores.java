public class IntercambiarValores{
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println("Antes de llamar al método a = " + a + " y b = " + b); //por fuera imprime a=3 y b=4
        
        intercambiar(a,b);

        System.out.println("Después de llamar al método a = " + a + " y b = " + b); //luego de llamar al método imprime a=3 y b=4
    }
    
    //paso por valor al método
    public static void intercambiar (int a, int b){
        int temporalA = a;
        a = b;
        b = temporalA;

        System.out.println("Despues de cambiar los valores dentro del metodo a = " + a + " y b = " + b); //dentro imprime a=4 y b=3
    }
}