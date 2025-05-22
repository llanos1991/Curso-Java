import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println(" *** Promedio de calificaciones **** ");

        var consola = new Scanner(System.in);

        //definimos el arreglo
        System.out.println("Cuantas calificaciones desea agregar:");
        var calificaciones = Integer.parseInt(consola.nextLine());

        double[] notas = new double[calificaciones];

        for (int i = 0; i < calificaciones; i++) {
            System.out.printf("Ingrese la %d nota \n", i + 1);
            notas[i] = Double.parseDouble(consola.nextLine());
        }

        var suma = 0.0;
        var promedio = 0.0;

        for (int i = 0; i < calificaciones; i++)
            suma = suma + notas[i];

        promedio = suma/calificaciones;

        System.out.println("El promedio de notas : " + promedio);
    }
}
