package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clases y objetos tipo persona");
//        var objeto1 = new Persona();
//        objeto1.setNombre("Layla");
//        objeto1.setApellido("Acosta");
//        objeto1.mostrarPersona();
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Layla","Acosta");
        System.out.println(objeto1.toString()); // o tambien: System.out.println(objeto1)
        System.out.println("Variable estatica despues de crear el objeto: " + Persona.contadorPersonas);
        var objeto2 = new Persona("ian","Acosta");
        System.out.println("Variable estatica despues de crear el objeto: " + Persona.contadorPersonas);
    }
}
