public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " + cadena1);
        
        // \n - imprimir un salto de linea
        
        cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulador
        cadena1 = "\tHola\tMundo";
        System.out.println("cadena1 = " + cadena1);

        //  \' - agregar una comilla simple
        cadena1 = "Hola \' Mundo \'";
        System.out.println("cadena1 = " + cadena1);

        // \" - agregar comilla doble
        cadena1 = "\t Hola \"Mundo\"";
        System.out.println("cadena1 = " + cadena1);

        // \\ - agregar diagonal invertida
        cadena1 = "Hola \\mundo";
        System.out.println("cadena1 = " + cadena1);
    }
}
