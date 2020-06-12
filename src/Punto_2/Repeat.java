package Punto_2;

/**
 *
 * @author Leonardo González G.
 */
public class Repeat {

    public static void runMyThread(int numIteracion, int tiempo, int ID, String name) {

        for (int i = 1; i <= numIteracion; i++) {

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                System.out.println(":(");
            }

            System.out.println("Tiempo espera aprox. " + (i * ID) + " Nombre hilo: " + name);

        }

    }

}
