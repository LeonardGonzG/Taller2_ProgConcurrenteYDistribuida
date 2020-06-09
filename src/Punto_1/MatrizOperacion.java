package Punto_1;

/**
 *
 * @author Leonardo González G.
 */
public class MatrizOperacion {

    public static int[][] multiplicacionMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] matrizAB = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizAB.length; i++) {
            for (int j = 0; j < matrizAB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizAB[i][j] = matrizAB[i][j] + matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return matrizAB;
    }

    public static int[][] randomMatriz(int row, int col) {

        int[][] matrizX = new int[col][row];

        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[0].length; j++) {
                matrizX[i][j] = (int) Math.random() + 1;
            }

        }
        return matrizX;

    }

    public void imprimirMatriz(int[][] matrizR) {
        for (int i = 0; i < matrizR.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizR[0].length; j++) {
                System.out.println("\t" + matrizR[i][j]);
            }

        }

    }

    public static int[][] calculoMatrizThread(int[][] matrizA, int[][] matrizB) {

        
        /////
    }

    public static Task makeTaskMatriz(int[][] matrizA, int[][] matrizB, int cuadrante) {

        int inicioF = 0;
        int finF = matrizA.length / 2;

        int inicioC = 0;
        int finC = matrizA[0].length / 2;

        if (cuadrante == 1) {

         ///   return new Task(matrizA, matrizB, cuadrante);
        } else if (cuadrante == 2) {

        } else if (cuadrante == 3) {

        } else if (cuadrante == 4) {

        }
        
        return null;
    }

    public static int[][] frgmentMatriz(int[][] matriz, int inicioF, int finF, int inicioC, int finC) {

        int[][] matrizFake = new int[finF][finC];
        int x = 0;
        int y = 0;
        for (int i = inicioF; i < finF; i++) {

            for (int j = inicioC; j < finC; j++) {
                matrizFake[x][y]= matriz[i][j];
                y++;
            }
            x++;
        }
        
        return matrizFake;

    }

}
