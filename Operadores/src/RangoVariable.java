import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {

        System.out.println("*** Rango de una variable ***");

        var consola = new Scanner(System.in);

        System.out.println(" Proporciona un dato entero : ");
        var dato = Integer.parseInt(consola.nextLine());

        //revisamos si esta dentro de rango (entre 1 a 10)

        var estaDentroRango = dato >= 1 && dato <= 10;

        System.out.println("Variable dentro de rango (1 y 10 )? " + estaDentroRango);

        //revisamos si esta fuera de rango (entre 1 a 10)

        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10 )? " + estaFueraRango);
    }
}
