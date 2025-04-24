public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println(" *** Numeros impares del 0 - 20 *** ");

        var i = 0;

        while(i <= 20){
            if(i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }
}
