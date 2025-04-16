import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        System.out.println(" *** Mayor de DOS Numeros *** ");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        var primerNumero = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese el segundo numero");
        var segundoNumero = Integer.parseInt(consola.nextLine());

        var mayorNumero = (primerNumero>segundoNumero) ?  primerNumero : segundoNumero;

        System.out.println("EL mayor numero  es :  " + mayorNumero);
    }
}
