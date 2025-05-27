package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {

        System.out.println(" *** Ejemplo aritmetica *** ");
        var aritmetica1 = new Aritmetica();
        aritmetica1.setOperando1(5);
        aritmetica1.setOperando2(7);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();

        var aritmetica2 = new Aritmetica();
        aritmetica2.setOperando1(12);
        aritmetica2.setOperando2(16);
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
