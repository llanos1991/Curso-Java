public class SentenciaIf {
    public static void main(String[] args) {
        // uso de la sentencia if

        var edad = 17;

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else if(edad >= 13 && edad < 18){
            System.out.println("Eres un adolescente");
        }
        else{
            System.out.println("Eres un niño");
        }
    }
}
