package Punto_1;

/**
 *
 * @author Leonardo González G.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] dimensionM = {100, 500, 1000};
        long startTime = 0;
        long endTime = 0;
        long diffTime = 0;

        for (int i = 0; i < dimensionM.length; i++) {
            System.out.println("PROCESO PRINCIPAL - Matriz " + dimensionM[i] + " x " + dimensionM[i]);

            int[][] matrizA = MatrizOperacion.randomMatriz(dimensionM[i], dimensionM[i]);
            int[][] matrizB = MatrizOperacion.randomMatriz(dimensionM[i], dimensionM[i]);
//            System.out.println("Matriz A");
//            MatrizOperacion.imprimirMatriz(matrizA);
//
//            System.out.println("");
//            System.out.println("Matriz B");
//            MatrizOperacion.imprimirMatriz(matrizB);
            startTime = System.currentTimeMillis();
            int[][] matrizR = MatrizOperacion.multiplicacionMatrices(matrizA, matrizB);

            endTime = System.currentTimeMillis();
            diffTime = (endTime - startTime);

//            System.out.println("Matriz Resultante");
//            MatrizOperacion.imprimirMatriz(matrizR);
            System.out.println("\033[31m(*) Tiempo principal: " + diffTime / 1000f);

            System.out.println("Hilos: Un hilo por cuadrante");
            startTime = System.currentTimeMillis();
           
            MatrizOperacion.calculoMatrizThread(matrizA, matrizB);
            
            endTime = System.currentTimeMillis();
            diffTime = (endTime - startTime);            
            System.out.println("\033[34m(*) Tiempo usando hilos: " + diffTime / 1000f);
            
            System.out.println("_______________________________________________________________");
        }

    }

}
