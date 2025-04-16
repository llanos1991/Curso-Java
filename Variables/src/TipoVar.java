public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*************** Uso de Var en Java ***************");

        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        
        var edad = 30;
        System.out.println("edad = " + edad);

        var sueldo = 5000.5F;
        System.out.println("sueldo = " + sueldo);
        
        var isMarry = false;
        System.out.println("isMarry = " + isMarry);
    }
}
