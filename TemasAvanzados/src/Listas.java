import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //List miLista = new ArrayList(); // asume que es una lista de objetos
        List <String>miLista = new ArrayList<>(); //Genericos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");

//        for(Object elemento : miLista){
//            System.out.println("Dia de la semana = " + elemento);
//        }

//        for(String elemento : miLista){
//            System.out.println("Dia de la semana = " + elemento);
//        }

        //Funciones lambda (funcion anonima de un codigo muy compacto)
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        //Metodo de referencia
        miLista.forEach(System.out::println);

        //Metodo asList
        List<String> nombre = Arrays.asList("\nPedro","Luis","Juan");
        nombre.forEach(System.out::println);

    }


}
