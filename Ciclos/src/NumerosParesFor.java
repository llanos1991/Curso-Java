public class NumerosParesFor {

    public static void main(String[] args) {
        System.out.println(" *** Numeros pares usando for ***");

        for(var i = 0; i<=20; i++){
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        System.out.println(" *** Numeros impares usando for ***");
        for(var i = 0; i<=20; i++){
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
