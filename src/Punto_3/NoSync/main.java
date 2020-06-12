package Punto_3.NoSync;

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
        ThreadNoSync H1= new ThreadNoSync();
        ThreadNoSync H2= new ThreadNoSync();
        
        H1.start(cont, 0);
        H2.start(cont, 0);
        
    }
    
}
