public class TipoDatos {
    public static void main(String[] args) {
        //Tipo de datos en java
        //Enteros valor por default = 0
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto Flotante valor por default = 0.0
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315D;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter valor por default '\u0000'
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;

        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        //Booleano por default = false
        
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipo Object (referencia)
        String nombre = null; //valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
        

    }
}
