package Punto_3.Sync;


/**
 *
 * @author Leonardo González G.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Contador cont= new Contador();
        ThreadSync H1= new ThreadSync();
        ThreadSync H2= new ThreadSync();
        
        H1.start(cont, 0);
        H2.start(cont, 0);
    }
    
}
