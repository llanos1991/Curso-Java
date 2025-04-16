
import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println(" *** VALOR DENTRO DE RANGO ***");
        //DEFINIMOS LOS LIMITES
        var scaner = new Scanner(System.in);
        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.println("Proporciona un dato entre 0 a 5");
        var dato = Integer.parseInt(scaner.nextLine());

        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango = " + estaDentroRango);
    }
}
