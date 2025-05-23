public class FuncionSumar {

    //definir la funcion sumar

    static int sumar(int x, int y){
        var suma = 0;
        suma = x + y ;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("La suma es : "+ sumar(10,20));
    }
}
