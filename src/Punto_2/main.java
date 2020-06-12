package Punto_2;


/**
 *
 * @author Leonardo González G.
 */
public class main {

    public static void main(String[] args) {
        
        MyThread[] tasks= new MyThread[6];
        
        tasks[0] = new MyThread(1, "A");
        tasks[1] = new MyThread(2, "B");
        tasks[2] = new MyThread(3, "C");
        tasks[3] = new MyThread(4, "D");
        tasks[4] = new MyThread(5, "E");
        tasks[5] = new MyThread(6, "F");
        
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].start();
        }
        
        for (MyThread task : tasks) {
            try {
                task.getTheThread().join();
            } catch (InterruptedException ex) {
                System.out.println(":(");
            }
        }
        
    }
    
}
