import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Reserva de Hotel *** ");

        var consola = new Scanner(System.in);
        System.out.println("Nombre del Cliente:");
        var nombre = consola.nextLine();

        System.out.println("Dias de estadia:");
        var dias = Integer.parseInt(consola.nextLine());

        System.out.println("Con vista al mar (true/false)?");
        var isVistaMar = Boolean.parseBoolean(consola.nextLine());

        var estado = (isVistaMar) ? "Si :)" : "No :(";
        var costoTotal = (isVistaMar) ? 150.50*dias : 190.50*dias;
        System.out.println("costoTotal = " + costoTotal);


        System.out.printf("""
                %n------------- Detalle de la reservacion----------
                %nCliente : %s
                Dias de estadia: %d
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """,nombre,dias,costoTotal,estado);
    }
}
