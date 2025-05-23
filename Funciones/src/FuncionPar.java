import java.util.Scanner;

public class FuncionPar {

    static boolean funcionPar(int numero){
        boolean valor = true;

        if(numero%2 == 0)
        {valor = true;
        return valor;}
        else{
            return false;
        }
    }


    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        var numero = consola.nextInt();

        if(funcionPar(numero)==true){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

    }
}
