import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println("*** Numeros Aleatorios ***");
        var random = new Random(); // usas la clase random

        // Generar un numero aleatorio entre 0 - 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        // Generar un numero aleatorio flotante (0.0 - 1.0)
        
        var numeroFlotante = random.nextFloat();
        System.out.println("numeroFlotante = " + numeroFlotante);

        // Simular el lanzamiento de un dado 0-6
        var dado = random.nextInt(6) + 1 ;
        System.out.println("dado = " + dado);
    }
}
