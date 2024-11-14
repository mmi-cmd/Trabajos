public class contadorParentesis{

    public static boolean isOrderValid (String parenthesis){

        int contadorParenthesis = 0;

        for (char parent : parenthesis.toCharArray()) {
            if (parent == '(') {
                contadorParenthesis++;
            } else if (parent == ')') {
                contadorParenthesis--;
            }

            if (contadorParenthesis<0) {
                return false;
            }
        }

        return contadorParenthesis==0;
    }

    public static void main(String[] args) {

        System.out.println("Orden válido '()': " + isOrderValid("()"));  
        System.out.println("Orden válido ')(()))': " + isOrderValid(")(()))"));  
        System.out.println("Orden válido ')(': " + isOrderValid(")("));  
        System.out.println("Orden válido '(())((()())())': " + isOrderValid("(())((()())())"));   
    }   
}


