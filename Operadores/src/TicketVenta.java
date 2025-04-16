import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion de Ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.println(" Precio del producto leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.println(" Precio del pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.println(" Precio de lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.println(" Precio de los platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.println(" ¿Aplicar algun descuento (%) ?");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // calculo del subtotal (sin impuestos)

        var subTotal = precioLeche + precioPan + precioPlatanos + precioLechuga;

        //aplicar el descuento
        var descuento = subTotal * (descuentoPorcentaje/100.0);

        var subTotalConDescuento = subTotal - descuento;

        // calculo con impuestos (16%)

        var impuesto = subTotalConDescuento * 0.16;

        //calculo total de la compra

        var totalCompra = subTotalConDescuento + impuesto;

        System.out.printf("""
                %n Ticket de venta
                -------------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """,subTotal,descuento,descuentoPorcentaje,impuesto,totalCompra);
    }
}
