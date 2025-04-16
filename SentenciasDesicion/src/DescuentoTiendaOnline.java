import java.util.Scanner;

public class DescuentoTiendaOnline {
    public static void main(String[] args) {

        System.out.println("*** Tienda Online ***");

        final var MONTO_MINIMO = 1000;
        /*
        * compra > 1000 && es miembro = descuento 10%
        * solo es miembro = 5%
        * no es miembro && compra < 1000 = descuento  0%
        * */

        var consola = new Scanner(System.in);
        System.out.println("Cual fue el monto de tu compra?");
        var monto = Integer.parseInt(consola.nextLine());
        System.out.println("monto = " + monto);

        System.out.println("Eres miembro de la tienda (true/false) ?");
        var isMiembro = Boolean.parseBoolean(consola.nextLine());
        System.out.println("isMiembro = " + isMiembro);


        if(monto > MONTO_MINIMO && isMiembro == true){
            var porcentajeDescuento = 10;
            var descuento = monto*porcentajeDescuento/100;
            var total = monto - descuento;

            System.out.printf(
                    """
                         %n Felicidades, has obtenido un descuento del %s%%
                            Monto de la compra: $%s
                            Monto del decuento: $%s
                            Monto final de la compra con descuento: $%s
                    """,porcentajeDescuento,monto,descuento,total);

        }else if (monto < MONTO_MINIMO && isMiembro == true){
            var porcentajeDescuento = 5;
            var descuento = monto*porcentajeDescuento/100;
            var total = monto - descuento;

            System.out.printf(
                    """
                         %n Felicidades, has obtenido un descuento del %s%%
                            Monto de la compra: $%s
                            Monto del decuento: $%s
                            Monto final de la compra con descuento: $%s
                    """,porcentajeDescuento,monto,descuento,total);
        }else{
            var total = monto;
            System.out.printf(
                    """
                         %n Te invitamos a hacerte miembro de la tienda
                            Monto final : $%s
                    """,total);
        }


    }
}
