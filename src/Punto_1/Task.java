package Punto_1;

/**
 *
 * @author Leonardo González G.
 */
public class Task implements Runnable {

    private int[][] matrizR;
    private int[][] matrizA;
    private int[][] matrizB;

    private int cuadrante;
    private Thread theThread=null;

    public Task(int[][] matrizA, int[][] matrizB, int cuadrante) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.cuadrante = cuadrante;
    }

    
    
    @Override
    public void run() {

        this.matrizR = MatrizOperacion.multiplicacionMatrices(matrizA, matrizB);
    }

    public Thread start() {

        if (theThread == null) {
            this.theThread = new Thread(this);
            theThread.start();
        }
        return theThread;

    }

    public int getCuadrante() {
        return cuadrante;
    }

    public Thread getTheThread() {
        return theThread;
    }

    public int[][] getMatrizR() {
        return matrizR;
    }

}
