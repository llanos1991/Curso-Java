import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var opcion = 0;
        do {
            System.out.println(" *** Sistema de administracion de cuentas *** ");
            System.out.printf("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    """);

            System.out.print(" Ejecute una opción:");
            opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Creando tu cuenta ...\n");
                    break;
                case 2:
                    System.out.println("Eliminando cuenta ...\n");
                    break;
                case 3:
                    System.out.println("Saliendo del menu\n");
                default:
                    System.out.println("Opcion invalida");
            }
        }while(!(opcion == 3));
    }
}
