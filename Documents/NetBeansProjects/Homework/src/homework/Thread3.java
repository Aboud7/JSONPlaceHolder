package homework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread {
    BlockingQueue queue;
    public Thread3(BlockingQueue q){
        this.queue = q;
    }
    public synchronized void run(){
        
        FileUtils f = null;
        for (int i = 0; i < 100; i++) {
            try {
                String s = (String) queue.pop();
                f.appendStringToFile(s);
            } catch (IOException ex) {
                Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
