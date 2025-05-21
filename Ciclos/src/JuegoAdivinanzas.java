import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");

        var consola = new Scanner(System.in);
        var random = new Random();

        //generamos un numero aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;

        var intentos = 0;
        var adivinanzas = 0;
        final var INTENTOS_MAXIMOS = 5;

        //mientras no adivine
        while(adivinanzas != numeroSecreto && intentos < INTENTOS_MAXIMOS){
            System.out.println("Adivina el numero secreto (1-50): ");
            adivinanzas = consola.nextInt();

            //agregar una ayuda para orientar al jugador
            if(adivinanzas < numeroSecreto)
                System.out.println("El numero es mayor");
            else if (adivinanzas > numeroSecreto)
                System.out.println("El numero secreto es menor");

            // Incrementamos la variable
            intentos++;
        }

        //conclusion del juego
        if(adivinanzas == numeroSecreto) {

            System.out.printf("Felicidades, " + "adivinaste el numero secreto en %d intentos%n",intentos);
        }
        else {
            System.out.printf("Lo siento, has agotado tus intentos maximos: %d%n",INTENTOS_MAXIMOS);
            System.out.printf("El numero secreto era %d%n", numeroSecreto);
        }

    }
}
