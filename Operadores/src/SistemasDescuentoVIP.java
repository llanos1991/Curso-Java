import java.util.Scanner;

public class SistemasDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de descuento VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.println("¿ cuantos productos compraste hoy?");
        var cantidadProducto = Integer.parseInt(consola.nextLine());

        System.out.println("¿Tienes la membresia de la tienda (true / false)?");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProducto >= NO_PRODUCTOS_DESCUENTO && tienesMembresia ;
        System.out.println("Tienes acceso al descuento VIP:  = " + esElegibleDescuento);


    }
}
