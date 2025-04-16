import java.util.Scanner;

public class EstacionDeAño {
    public static void main(String[] args) {
        System.out.println(" *** Estacion del Año *** ");

        var consola = new Scanner(System.in);



        System.out.println(" Ingrese el numero del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = "";

        if (mes <= 2 || mes == 12){
            estacion= "Invierno";

        }else if( mes >= 3 && mes <= 5){
            estacion= "Primavera";

        }else if (mes >= 6 && mes <= 8){
            estacion= "Verano";
        }else if (mes >= 9 && mes <= 11){
            estacion= "Otoño";
        }else{
            estacion= "Desconocida";
        }

        System.out.printf(" la estacion para el mes %d es %s ",mes,estacion);
    }
}
