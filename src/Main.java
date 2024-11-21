import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto de la clase Libro
        System.out.println("Ingrese los detalles del libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Crear objeto de la clase CuentaBancaria
        System.out.println("\nIngrese los detalles de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Crear objeto de la clase Estudiante
        System.out.println("\nIngrese los detalles del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar los detalles de los objetos
        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro.toString());
        System.out.println(cuentaBancaria.toString());
        System.out.println(estudiante.toString());

        scanner.close();
    }
}
