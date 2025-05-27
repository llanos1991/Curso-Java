package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas",70));
        snacks.add(new Snack("Refresco",50));
        snacks.add(new Snack("Sandwitch", 120));
    }

    // metodo agregar snack
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    // metodo mostrar snacks
    public static void mostrarSnacks(){
        var inventarioSnack = "";

        for(var snack: snacks){
            inventarioSnack += snack.toString() + "\n";
        }

        System.out.println(" --- Snacks en el inventario --- ");
        System.out.println(inventarioSnack);

    }

    // metodo obtener snacks
    public static List<Snack> getSnacks(){
        return snacks;
    }

}
