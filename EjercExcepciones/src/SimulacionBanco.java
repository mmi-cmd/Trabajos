import java.util.Scanner;

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje); 
    }
}

class CuentaBancaria {
    private double saldo;  

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {

            throw new FondosInsuficientesException("Fondos insuficientes. No se puede retirar " + cantidad);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        }
    }


    public double getSaldo() {
        return saldo;
    }
}


public class SimulacionBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al banco.");
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        System.out.print("¿Cuánto dinero deseas retirar? ");
        double cantidad = scanner.nextDouble();

        try {
            cuenta.retirar(cantidad);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());

        scanner.close();
    }
}
