public class BusquedaSubcadenas {

    public static void main(String[] args) {
        
        //buscar subcadenas
        // indexOff - devuelve el indice de la primera aparicion de la subcadena
        
        var cadena1 = "Hola Mundo";
        
        //subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //si no encuentra la cadena envia (-1)
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
