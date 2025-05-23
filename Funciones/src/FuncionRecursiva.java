public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion recursiva

    static void funcionRecursiva(int numero){

        //caso base
        if(numero == 1){
            System.out.println(numero +  " ");
        }
        else{
            //caso recursivo
            funcionRecursiva(numero - 1);
            System.out.println(numero + " ");
        }
    }

    public static void main(String[] args) {
            funcionRecursiva(5);
    }

}
