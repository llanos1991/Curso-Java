public class Funciones {

    static void saludar(String mensaje){ //parametro es lo que recibe la funcion
        System.out.println("mensaje: " + mensaje);
    }

    public static void main(String[] args) {

        saludar("Hola"); // argumento
        saludar("Adios");
    }
}
