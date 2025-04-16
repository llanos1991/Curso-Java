import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Envios Nacionales e Internacionales *** ");

        //CONSTANTES

        final double NACIONAL = 10;
        final double INTERNACIONAL = 20;

        var console = new Scanner(System.in);
        System.out.println("Ingrese el destino Nacional = [N] e Internacional = [I]");
        var destino = console.nextLine().strip().toUpperCase();
        System.out.println("Ingrese el peso del Paquete en Kg: ");
        var peso = Double.parseDouble(console.nextLine());
        double constoEnvio = 0;

        if(destino.equals("N")) {
            constoEnvio = NACIONAL * peso;
            System.out.println("constoEnvio = " + constoEnvio);
        }else if(destino.equals("I")){
            constoEnvio = INTERNACIONAL * peso;
        }else{
            System.out.println("No es un destino ¡¡");
        }

        System.out.printf("""
                \nSistema de Envios Nacional e Internacional
                **********************************************
                Nacional : N
                Internacional : I
                
                Destalle:
                Destino de viaje : %s
                Costo de envio : %.1f
                
                """,destino,constoEnvio);

        /*
        * //con switch mejorado
        *
        * Double costoEnvio = switch(destino){
        *   case "N" -> peso*NACIONAL;
        *   case "I" -> peso*INTERNACIONAL;
        *   default -> {
        *       System.out.println("No es un destino ¡¡");
        *       yield null;
        *   }
        * };
        * */

    }
}
