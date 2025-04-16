import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        final String USER = "admin";
        final String PASSWORD = "123";

        System.out.println("*** Sistema de Autenticacion ***");
        var consola= new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario : ");
        var user = consola.nextLine();

        System.out.println("Ingrese password : ");
        var password = consola.nextLine().strip();

        if(user.equals(USER) && password.equals(PASSWORD)){
            System.out.println("Binvenido al sistemas :)");
        }else if (user.equals(USER) && !password.equals(PASSWORD)){
            System.out.println("Password es invalido");
        }else if (!user.equals(USER) && password.equals(PASSWORD)){
            System.out.println("Usuario es invalido");
        }else if (!user.equals(USER) && !password.equals(PASSWORD)){
            System.out.println("Usuario y Password invalido");
        }
    }
}
