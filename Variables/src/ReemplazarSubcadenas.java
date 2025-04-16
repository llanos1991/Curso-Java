public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //reemplazar Mundo por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //reemplazar Hola por "A Dios"
        nuevaCadena = nuevaCadena.replace("Hola", "A Dios");
        System.out.println("nuevaCadena = " + nuevaCadena);


    }
}
