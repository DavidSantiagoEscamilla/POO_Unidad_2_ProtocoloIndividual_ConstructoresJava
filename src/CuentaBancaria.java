public class CuentaBancaria {
    // Propiedades
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Cuenta de ahorros";
    }

    // Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial por defecto
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    //Metodos para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
    //ToString para mostrar los datos Bancarios
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "número de cuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipo de cuenta='" + tipoCuenta + '\'' +
                '}';
    }
}
