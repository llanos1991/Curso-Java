import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        var saldo = 1000.0;
        var salir = false;

        while(!salir){
            System.out.println("""
                    *** Aplicacion de Cajero Automatico ***
                    Operacioness que puede realizar:
                    
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");

            var opcion = consola.nextInt();

            //procesamos casos
            switch(opcion){
                case 1 -> System.out.printf("Tu saldo actual es: %.2f%n%n",saldo);
                case 2 -> {
                    System.out.println("Ingresa el monto a retirar:");
                    var retiro = consola.nextDouble();

                    if(retiro <= saldo){
                        saldo-=retiro;
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n",saldo);
                    }
                    else
                        System.out.printf("No cuentas con el saldo suficiente." + "Tu saldo actual es: %.2f%n%n",saldo);

                }
                case 3 -> {
                    System.out.println("Ingresa el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo+=deposito;
                    System.out.printf("Tu nuevo saldo es: %.2f%n%n",saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automatico. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida." + "Seleccione otra opcion. \n");
            }
        }
    }
}
