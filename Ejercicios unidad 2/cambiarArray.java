
import java.util.Arrays;
public class cambiarArray {
    public static void modificarArray (int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i]+=3;
        }
        System.out.println("Dentro del metodo el array es: " + Arrays.toString(array)); //Imprime array modificado
    }
    public static void main(String[] args) {
        int [] array = {2, 4, 5, 6};
        System.out.println("Antes de llamar al metodo el array es " + Arrays.toString(array)); //Imprime array original
        modificarArray(array);
        System.out.println("Despues de llamar al metodo el array es " + Arrays.toString(array)); //Imprime array modificado debido al paso por referencia
}
}
