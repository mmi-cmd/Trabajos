public class MetodoMayorNumero {
    public static void main(String[] args) {
        int [] numbers = {3, 6, 9};
        int resultado = sumar(numbers);

        System.out.println("El numero mayor es: " + resultado);
    }
    
    public static int sumar(int numbers[]){
        int numMayor = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>numMayor) {
                numMayor=numbers[i];
            }
        }
        return numMayor;
    }
}