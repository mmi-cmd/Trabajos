public class contadorPares {
    public static void main(String[] args) {
        int contador = 0;
        for (int i=1; i<=100; i++){
            if (i%2 == 0){
                contador++;
            }
        }
        System.err.println("Entre 1 y 100, hay " + contador + " numeros pares");
    }
}
