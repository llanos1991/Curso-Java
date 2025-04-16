public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println(" *** Operadores Unarios ***");
        int a = 3 , b = -2, resultado;
        var c = true;

        //Operador Unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        //Operador Unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // *** Operadores unarios incremento/decremento ***

        //PRE-INCREMENTO
        a = 3;
        resultado = ++a; //primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println(" \"a\" ya se incremento = " + a);

        //POST - INCREMENTO
        a = 3;
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("resulta a++ = " + resultado);
        System.out.println("\"a\" en este momento se incrementa = " + a);

        //PRE-DECREMENTO
        b = -2;
        resultado = --b; //primero se incrementa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println(" \"b\" ya se incremento = " + b);

        //POST - DECREMENTO
        b = -2;
        resultado = b--; //primero se usa el valor y despues se incrementa
        System.out.println("resulta b++ = " + resultado);
        System.out.println("\"b\" en este momento se incrementa = " + b);


    }
}
