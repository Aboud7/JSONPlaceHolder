
package homework;


import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue s2 = new BlockingQueue(100);
        Thread1 th = new Thread1();
        th.start();
       
                
        Thread2 threadsArray[]=new Thread2[8];
        for(int i=0;i<8;i++){
            threadsArray[i]=new Thread2(th.getQueue(),s2);
            threadsArray[i].start();
        }
        
        Thread3 th0 = new Thread3(s2);
        th0.start();
        th.join();
        for(int i=0;i<8;i++){
            if(th.isAlive()){
                synchronized(threadsArray[i]){
            threadsArray[i].wait();}
        }
            
            else
                synchronized(th){
                    th.notifyAll();}
            threadsArray[i].join();
        }
        
        th0.join();
        
    }
}
