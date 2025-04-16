import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema generador de ID unico ***");

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        var nombre = consola.nextLine();
        var nom = nombre.substring(0,2).toUpperCase();
        System.out.println("nom = " + nom);

        System.out.println("Cual es tu apellido: ");
        var apellido = consola.nextLine();
        var apel = apellido.substring(0,2).toUpperCase();
        System.out.println("apel = " + apel);
        
        
        System.out.println("Cual es tu año de nacimiento (yyyy): ");
        var anio = consola.nextLine(); //entero
        var an = anio.substring(2);
        System.out.println("an = " + an);
        
        //crear un numero aleatorio de 4 cifras
        var random = new Random();
        var aleatorio = random.nextInt(9999)+1;
        var formatoAleatorio = String.format("%04d",aleatorio);
        System.out.println("aleatorio = " + aleatorio);
        
        //concatenar 
        var concatenar = nom+apel+an+formatoAleatorio;
        System.out.println("concatenar = " + concatenar);
        
        
        // Imprimir en pantalla
        
        var imprimir = """
                 %n Hola: %s,
                 Tu numero de identificacion (ID) generado por el sistema es: \s 
                \t %s
                \t Felicidades!
                
                """.formatted(nombre,concatenar);

        System.out.println(imprimir);

    }
}
