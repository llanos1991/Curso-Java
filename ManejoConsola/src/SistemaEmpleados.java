import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");

        var consola = new Scanner(System.in);

        //nombre del empleado
        System.out.println("Nombre del empleado : ");
        var nombreEmpelado = consola.nextLine();

        //edad del empleado
        System.out.println("Edad del empleado :");
        var edad = Integer.parseInt(consola.nextLine());

        //salario del empleado
        System.out.println("Salario del empleado");
        var salario = Double.parseDouble(consola.nextLine());

        // es jefe de departamento
        System.out.println(" Es jefe de Departamento (true / false)");
        var isjefe = Boolean.parseBoolean(consola.nextLine());

        // Imprmir valores del empelado
        System.out.println(" \n Datos del empelado: ");
        System.out.println(" \t Nombre: " + nombreEmpelado);
        System.out.println(" \t Edad: " + edad + "años");
        System.out.printf(" \t Salario: $%.2f%n", salario); //printf
        System.out.println(" \t Es jefe de departamento: " + isjefe);
    }
}
