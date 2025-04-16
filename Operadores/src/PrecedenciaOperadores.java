public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // precedencia de operadores en Java

        // 1. Parentesis y corchetes () y []
        // 2. Operadores unarios -, ++ , --
        // 3. Operadores Aritmeticos * , / , y %
        // 4. Operadores Aritmeticos + y -
        // 5. Relacionales < , <= , > , >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc;

        // Expresion
        var a =12 / 3 + 2 * 3 - 1; // se evalua de izquierda a derecha, por orden de precedencia.
        System.out.println("a = " + a);
    }
}
