/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

/**
 *
 * @author Leonardo González G.
 */
public class MyThread implements Runnable {

    private int ID;
    private String nombre;
    private int numIteraciones;
    private int tiempoEspera;
    private Thread theThread = null;

    public MyThread(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        this.numIteraciones = 60 /ID;
        this.tiempoEspera = ID * 1000;
    }


     public Thread start() {

        if (theThread == null) {
            this.theThread = new Thread(this);
            theThread.start();
        }
        return theThread;

    }

    public Thread getTheThread() {
        return theThread;
    }
    

    @Override
    public void run() {
        Repeat.runMyThread(this.numIteraciones, this.tiempoEspera, this.ID, this.nombre);
    }

}
