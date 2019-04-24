package homework;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Thread1 extends Thread{
    BlockingQueue queue=new BlockingQueue(100);
    public Thread1(){
    }
    
    @Override
    public synchronized void run(){
    
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
    public BlockingQueue getQueue(){
        return queue;
    }
}
