import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // declaramos un arreglo
        int[] enteros; // seccion de memoria stack

        //reservar espacio
        enteros = new int[5]; // seccion de memoria heap

        // Modificar valores
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        // leer los valores del arreglo
        System.out.println("valor 1 : \t" + enteros[0]);
        System.out.println("valor 3 : \t" + enteros[2]);



        // declarar e inicializar un arreglo
        int[] numeros = new int[2]; // var numeros = new int[2];

        // sintaxis simplicada de arreglos
        int[] numbers = {10,20,30,40,50};
        // var enteros = new enteros[]{10,20,30,40,50};

        // iterar los elementos del arreglo con el ciclo for

        for (var i = 0; i < numbers.length; i++ ){
            System.out.println( "Valor del indice: " + i + " = " +numbers[i]);
        }

        //introducir valores a un arreglo
        var consola = new Scanner(System.in);

        System.out.println("Proporciona el tamaño del arreglo");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var ente = new int[largoArreglo];
        // solicitar los arreglos
        for(var i = 0; i< largoArreglo;i++){
            System.out.println("Proporciona enteros[" + i + "] = ");
            ente[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir valores del arreglo
        for (var i = 0; i < largoArreglo; i++ ){
            System.out.println( "Valor del indice: " + i + " = " +ente[i]);
        }
    }
}
