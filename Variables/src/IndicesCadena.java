public class IndicesCadena {

    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";

        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        var penultimoCaracter = cadena1.charAt(8);
        System.out.println("penultimoCaracter = " + penultimoCaracter);
        
        var quintoCaracter = cadena1.charAt(5);
        System.out.println("quintoCaracter = " + quintoCaracter);
    }
}