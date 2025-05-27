import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "diego");
        persona.put("apellido", "flores");
        persona.put("edad","31");

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        persona.put("edad","35");
        System.out.println("\nNuevos Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elemntos del mapa separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((llave,valor)->{
            System.out.println("Llave: " + llave + "Valor: " + valor);
        });
    }
}
