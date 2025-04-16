import java.util.Locale;

public class MetodosDeCadenas {

    public static void main(String[] args) {
        
        //metodos de cadenas
        var cadena1 = " Hola Mundo";
        
        //largo de la cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        //remplazar caracteres
         var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //convertia a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //eliminar espacios al inicio y al final
        var cadena2 = " LEO REYES   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
