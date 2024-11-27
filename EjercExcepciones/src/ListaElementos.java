public class ListaElementos {
    public static void main(String[] args) {
        String elementos[] = {"casa", "carro", "mesa", "silla", "puerta"};

        try {
            System.out.println("La posicion del elemento 5 es " + elementos[5]);
        } catch (Exception e) {
            System.out.println("No existe la posición");
        }
    }
}
