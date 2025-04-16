import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Autenticacion *** ");

        final var USUARIO = "admin";
        final var CLAVE = "123";

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre de usuario:? ");
        var usuario = consola.nextLine();


        System.out.println("Cual es tu password : ?");
        var clave = consola.nextLine();


        var validacion = (usuario.equals(USUARIO)) && (clave.equals(CLAVE));
        System.out.println("datos son correctos? \t"  + validacion);
    }
}
