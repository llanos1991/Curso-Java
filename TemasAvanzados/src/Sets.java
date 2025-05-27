import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>(); // no permite elementos duplicados
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Carlos");
        conjunto.add("Victoria");

        conjunto.forEach(System.out::println);

        //Remover un elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos Elementos del Set");
        conjunto.forEach(System.out::println);
    }
}
