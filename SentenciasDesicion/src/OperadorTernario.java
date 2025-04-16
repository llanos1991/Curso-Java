public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println(" *** Operador ternario *** ");
        //sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un numero es par o no

        var numero = 1;

        var resultado = (numero % 2 == 0) ? "Par" :  "Impar";

        System.out.println(" EL NUMERO ES : " + resultado);

        // calcular si es mayor de edad
        var edad = 17;

        var mensaje = (edad>=18) ? "mayor de edad" : "menor de edad";

        System.out.println(" tienes " + edad + " eres "+ mensaje);

        //valor positivo, negativo o cero (operador ternario anidado)
        var num = -12;
        var result = (num > 0) ? "positivo" : (num < 0) ? "negativo" : "cero";
        System.out.println("el numero  "+ num + " es "+ result);

    }
}
