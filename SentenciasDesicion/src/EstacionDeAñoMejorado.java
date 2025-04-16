import java.util.Scanner;

public class EstacionDeAñoMejorado {
    public static void main(String[] args) {
        System.out.println(" *** Estacion del Año *** ");
        var consola = new Scanner(System.in);
        System.out.println(" Ingrese el numero del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

       var estacion = switch (mes){
           case 1, 2, 12 -> "Invierno";
           case 3, 4, 5 -> "Primavera";
           case 6, 7, 8 -> "Verano";
           case 9, 10, 11 -> "Otoño";
           default -> "Estacion desconocida";
       };

        System.out.printf(" la estacion para el mes %d es %s ",mes,estacion);
    }
}
