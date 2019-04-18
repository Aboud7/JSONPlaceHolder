package homework;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Thread1 extends Thread{
    BlockingQueue queue;
    public Thread1(BlockingQueue q){
        queue = q;
    }
    
    @Override
    public synchronized void run(){
        Thread t = Thread.currentThread();
        String s;
        for (int i = 0; i < 100; i++) {
            s="data/f"+i+".txt";
            try {
                queue.add(s);
                        } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
