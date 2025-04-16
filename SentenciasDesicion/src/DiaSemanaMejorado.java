public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println( "*** Dia de la semana con switch mejorado *** ");
        var dia = 7;

        var nombre = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };

        System.out.printf(" El dia %d es %s",dia, nombre);
    }
}
