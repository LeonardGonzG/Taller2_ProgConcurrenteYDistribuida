package Punto_3.NoSync;

/**
 *
 * @author Leonardo González G.
 */
public class ThreadNoSync implements Runnable {

    private Thread theThread = null;
    private boolean isRunning = false;
    private int theDelay = 0;
    private Contador cont;

    public ThreadNoSync() {
    }

    public Thread start(Contador cont,int delay) {

        this.cont = cont;
        this.theDelay = delay;
        this.theThread = new Thread(this);
        theThread.start();

        return theThread;
    }

    public void stop() {
        isRunning = false;
    }

    @Override
    public void run() {
        isRunning = true;
        while (isRunning) {

            this.cont.sumar();
            
            try {
                Thread.sleep(this.theDelay);
            } catch (InterruptedException ex) {
                System.out.println(":(");
            }

        }
    }

}
