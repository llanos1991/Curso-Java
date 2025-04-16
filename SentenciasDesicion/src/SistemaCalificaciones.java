import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Calificaciones *** ");

        /*
        * calificacion numerica entre (0 - 10)
        * letra a convertir (F - A)
        *
        * [9-10] = A
        * [8-9> = B
        * [7-8> = C
        * [6-7> = D
        * [0-6> = F
        *
        * OTRO VALOR : DESCONOCIDO
        * */

        var consola = new Scanner(System.in);
        var conversion = ' ';
        System.out.println("Ingrese la calificacion obtenida entre 0 - 10 : ");
        var calificacion = Double.parseDouble(consola.nextLine());

        if (calificacion >=0 && calificacion <=10) {
            if (calificacion >= 9 && calificacion <= 10) {
                conversion = 'A';
            } else if (calificacion >= 8 && calificacion < 9) {
                conversion = 'B';
            } else if (calificacion >= 7 && calificacion < 8) {
                conversion = 'C';
            } else if (calificacion >= 6 && calificacion < 7) {
                conversion = 'D';
            } else if (calificacion >= 0 && calificacion < 6) {
                conversion = 'F';
            }

            System.out.printf("""
                \nSistema de calificaciones
                ******************************
                La calificacion es: %.1f
                La conversion obtenida es: %s
                """,calificacion,conversion);

        } else {
            System.out.println("Valor desconocido ¡¡");
        }


    }
}
