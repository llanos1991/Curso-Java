public class SumaDiagonal {
    public static void main(String[] args) {
        System.out.println(" *** Suma la diagonal de la Matriz ***");

        //Definimos la matriz de forma simplificada

        int [][] matriz = new int[][] {{100,200,300},{400,500,600},{700,800,900}};

        // elementos de la diagonal de indice (0,0), (1,1) , (2,2). = 100 +500 +900 = 1500
        var suma = 0;
        //recorremos el arreglo

        for(int y = 0; y < matriz.length; y++){

            for(int x = 0; x < matriz[y].length; x++){

                if (x == y){
                    suma = suma + matriz[x][y];
                }

            }
        }
        System.out.println("La suma de la diagonal de la matriz es: " + suma);
    }
}
