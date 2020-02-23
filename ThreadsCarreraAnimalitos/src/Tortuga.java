
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis_
 */
public class Tortuga implements Runnable{
    public void run(){
        int i   = 0;
        long ms = 0;
        System.out.println("Comienza la Tortuga");
        while(i < 5){
            try {
                ms = (long) ((Math.random() * 5 + 1) * 1000);
                Thread.sleep(ms);
                System.out.println("Tortuga corriendo a " + ms + " m x s");
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }
        System.out.println("Termina la Tortuga");
    }
}
