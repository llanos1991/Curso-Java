import java.sql.SQLOutput;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {

        //leer distintos tipos de datos
        var consola = new Scanner(System.in);

        // leer de tipo entero
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextInt(); // nextInt
        System.out.println("edad = " + edad);

        //leer de tipo double
        System.out.println("Ingresa tu altura : ");
        var altura = consola.nextDouble(); // nextDouble
        System.out.println("altura = " + altura);

        //consumir salto de linea
        consola.nextLine();

        //leer un tipo String
        System.out.println(" Ingresa tu nombre : ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        
        //conversion de datos
        // tipo entero
        System.out.println("Proporsiona un valor entero");
        var enteroString =consola.nextLine();
        var entero = Integer.parseInt(enteroString); // Integer.parseInt()
        System.out.println("entero = " + entero);

        // tipo flotante
        System.out.println("Proporsiona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine()); //metodo abreviado
        System.out.println("flotante = " + flotante);
        
    }
}
