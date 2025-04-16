import java.sql.SQLOutput;

public class ComparacionCadenas {

    public static void main(String[] args) {

        var cadena1 = "Java";
        var cadena2 = "Java";

        var cadena3 = new String("Java");

        //COMPARACION DE CADENAS

        System.out.print("cadena1 es igual en referencia a cadena2 ");
        System.out.println(cadena1 == cadena3);  //compara las referncias de cadena

        //COMPARACION DE CONTENIDOS
        System.out.println(cadena1.equals(cadena3)); //compara el contenido de la cadena

    }
}
