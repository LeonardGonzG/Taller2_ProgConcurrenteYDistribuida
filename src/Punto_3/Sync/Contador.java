/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_3.Sync;

/**
 *
 * @author Leonardo González G.
 */
public class Contador {

    private int cont = 0;

    public void sumar() {
        if (this.cont <= 5000) {

            cont++;
            System.out.println(cont);
        }

    }

}
