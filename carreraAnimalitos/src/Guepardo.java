
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis_
 */
public class Guepardo extends Thread {
    public void run(){
        int i   = 0;
        long ms = 0;
        System.out.println("Comienza El Guepardo");
        while(i < 5){
            try {
                ms = (long) ((Math.random() * 5 + 1) * 1000);
                Thread.sleep(ms);
                System.out.println("Guepardo corriendo a " + ms + " m x s");
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }
        System.out.println("Termina el Guepardo");
    }
}
