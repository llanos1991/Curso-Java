import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Calculo del Area y Perimetro del Rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la base del rectangulo : ");
        var base = Double.parseDouble(consola.nextLine());
        System.out.println("base = " + base);

        System.out.println("Ingrese el tamaño de la altura del rectangulo : ");
        var altura = Double.parseDouble(consola.nextLine());
        System.out.println("altura = " + altura);

        //calulo del perimetro

        var perimetro = 2 * (base + altura);
        var area = base * altura;
        System.out.println("El perimetro del rectangulo es : " + perimetro);
        System.out.println("El area del rectangulo es : " + area);
    }
}
