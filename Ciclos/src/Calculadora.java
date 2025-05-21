import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        double operando1 = 0, operando2 = 0, resultado;

        var salir = false;

        while(!salir){

            System.out.print("""
                    
                    *** Calculadora ***
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            if(opcion >= 1 && opcion <= 4 ){
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.println("Dame el valor 2 ");
                operando2 = consola.nextDouble();
            }

            switch(opcion){
                case 1 -> {
                    // suma
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n",resultado);
                }
                case 2 -> {
                    // resta
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado de la resta: %.2f%n%n",resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado de la multiplicacion: %.2f%n%n",resultado);
                }
                case 4 -> {
                    if(operando2 != 0){
                    resultado = operando1 / operando2;
                    System.out.printf("Resultado de la division: %.2f%n%n",resultado);}
                    else
                        System.out.println("Error division entre cero.\n");
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de calculadora!");
                    salir = true;
                }
                default -> {
                    System.out.println("Opcion invalida, " + "selecciona otra opcion!\n");
                }
            }
        }
    }
}
