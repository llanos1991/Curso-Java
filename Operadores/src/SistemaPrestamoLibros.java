import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println(" *** Sistema Prestamo Libros *** ");

        final var DISTANCIA_PERMITIDA_KM = 3;

        var consola = new Scanner(System.in);

        System.out.println("¿ Cuentas con credenciales de estudiante (true/false)? ");
        var tienesCredenciales = Boolean.parseBoolean(consola.nextLine());

        System.out.println("¿ A cuantos km vives de la biblioteca? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredenciales || distanciaBiblioteca < DISTANCIA_PERMITIDA_KM;
        System.out.println(" Es elegible para prestamo de libro : " + esElegiblePrestamo);
    }
}
