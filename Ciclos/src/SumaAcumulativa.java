public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma acumulativa ***");

        var i = 1;
        var suma = 0;

        while(i <= 10){
            //suma = i + suma;
            System.out.print(i + " ");
            suma+=i;
            i++;
        }

        System.out.println("\nLa suma es:" +suma);
    }
}
