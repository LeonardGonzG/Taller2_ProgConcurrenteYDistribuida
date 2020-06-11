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
                matrizX[i][j] = (int) (Math.random() * col);
            }

        }
        return matrizX;

    }

    public static void imprimirMatriz(int[][] matrizR) {
        for (int i = 0; i < matrizR.length; i++) {
            
            for (int j = 0; j < matrizR[0].length; j++) {
                System.out.print("\t" + matrizR[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
    }

    public static void calculoMatrizThread(int[][] matrizA, int[][] matrizB) {

        Task[] cuadrantes = new Task[4];

        for (int i = 0; i < cuadrantes.length; i++) {
            cuadrantes[i] = makeTaskMatriz(matrizA, matrizB, (i + 1));
        }

        for (Task cuad : cuadrantes) {
            cuad.start();
        }

        for (Task cuadJ : cuadrantes) {

            try {
                cuadJ.getTheThread().join();
//                System.out.println("CUADRANTE # " + cuadJ.getCuadrante());
//                System.out.println("");
//                imprimirMatriz(cuadJ.getMatrizR());

            } catch (InterruptedException ex) {

            }

        }
        

    }

    public static Task makeTaskMatriz(int[][] matrizA, int[][] matrizB, int cuadrante) {

        int mitadF = matrizA.length / 2;
        int mitadC = matrizA[0].length / 2;

        int dimension = matrizA[0].length;

        int inicioF = 0;
        int finF = mitadF;

        int inicioC = 0;
        int finC = mitadC;

        switch (cuadrante) {
            case 1:
                inicioF = 0;
                finF = mitadF;
                inicioC = 0;
                finC = mitadC;
                break;
            case 2:
                inicioF = 0;
                finF = mitadF;
                inicioC = mitadC;
                finC = dimension;
                break;
            case 3:
                inicioF = mitadF;
                finF = dimension;
                inicioC = 0;
                finC = mitadC;
                break;
            case 4:
                inicioF = mitadF;
                finF = dimension;
                inicioC = mitadC;
                finC = dimension;
                break;
            default:
                break;
        }
        
        int[][] matrizX = fragmentMatriz(matrizA, inicioF, finF, inicioC, finC, dimension/2);
        int[][] matrizY = fragmentMatriz(matrizB, inicioF, finF, inicioC, finC, dimension/2);

        return new Task(matrizX, matrizY, cuadrante);
    }

    public static int[][] fragmentMatriz(int[][] matriz, int inicioF, int finF, int inicioC, int finC, int dimens) {

        int[][] matrizFake = new int[dimens][dimens];
        int x = 0;
        int y = 0;
        for (int i = inicioF; i < finF; i++) {

            for (int j = inicioC; j < finC; j++) {
                matrizFake[x][y] = matriz[i][j];
                y++;
            }
            x++;
            y=0;
        }

        return matrizFake;

    }

}
