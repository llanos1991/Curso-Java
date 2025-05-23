package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clases y objetos tipo persona");
        var objeto1 = new Persona();
        objeto1.setNombre("Layla");
        objeto1.setApellido("Acosta");

        var objeto2 = new Persona();
        objeto2.setNombre("Juan") ;
        objeto2.setApellido("Acosta");

        objeto1.mostrarPersona();
        objeto2.mostrarPersona();
    }
}
