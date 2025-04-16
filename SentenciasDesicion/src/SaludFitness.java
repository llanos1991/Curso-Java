import java.util.Scanner;
import java.util.function.DoubleFunction;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println(" *** Salud y Fitness *** ");

        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.println(" Cuantos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? " Si :)" : "No :(";

        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        System.out.printf("""
                %n Usuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzados: %s
                --------------------------------------
                
                La meta de pasos diarios es de : %d pasos
                """, nombreUsuario, pasosDiarios,caloriasQuemadas,metaAlcanzada,META_PASOS_DIARIOS);
    }
}
