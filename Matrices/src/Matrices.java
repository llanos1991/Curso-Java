import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {

        // Definimos la matriz

        int [][] matriz = new int[2][3]; // var matriz = new int[2][3]

        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // accedemos a los valores
        System.out.println("valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("valor 6 [1][2] = " + matriz[1][2]);

        // Recorrer una matriz

        for(int y = 0; y < 2 ; y++ ){
            for(int x = 0; x < 3 ; x++ ){
                System.out.printf("La matriz de orden [%d] [%d] = %d\n",y,x, matriz[y][x]);
            }
        }

        // Sintaxis simplificada de matriz
        var matriSimplificada = new int [][]{
                {100,200,300},
                {400,500,600}};

        //recorrer una matriz
        /*
        * matriSimplificada[0] → {100, 200, 300}
          matriSimplificada[0].length → 3
        * */
        System.out.println(Arrays.toString(matriSimplificada[0])); // -> [100, 200, 300]
        System.out.println(matriSimplificada[0].length); // define el tamaño de la columna de la primera fila

        for(int y = 0; y < matriSimplificada.length ; y++ ){
            for(int x = 0; x < matriSimplificada[y].length ; x++ ){
                System.out.printf("La matriz de orden [%d] [%d] = %d\n",y,x, matriSimplificada[y][x]);
            }
        }

    }
}
