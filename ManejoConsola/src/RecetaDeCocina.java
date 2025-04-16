import java.util.Scanner;

public class RecetaDeCocina {
    public static void main(String[] args) {

        System.out.println(" *** Receta de Cocina *** ");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese el nombre : ");
        var nombreReceta = consola.nextLine();

        System.out.println("Ingrese los ingredientes : ");
        var ingredientes = consola.nextLine();

        System.out.println("Ingrese el tiempo de preparación (min) : ");
        var tiempo = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese la dificultad (facil / medio / dificil):");
        var dificultad = consola.nextLine();

        //imprimir por consola
        System.out.println("Nombre de receta :" + nombreReceta);
        System.out.println("Ingredientes : " + ingredientes);
        System.out.println("Tiempo de preparacion : " + tiempo + " min");
        System.out.println("Dificultad : " + dificultad);

    }
}
