
package homework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread {
    BlockingQueue queue1;
    BlockingQueue queue2;
    Integer i;
    Integer j;
    
    public Thread2(BlockingQueue q1,BlockingQueue q2,Integer i,Integer j){
        queue1 = q1;
        queue2 = q2;
        this.i=i;
        this.j=j;
    }
         public static int [] count(String s){
         int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        char [] ch = s.toCharArray();
        for(char c5: ch){
            if(Character.isLetter(c5)){
                c1++;
            }
            else if(Character.isDigit(c5))
                c2++;
            else
                c3++;
        } int a[] = {c1, c2, c3};
        return a;
     }
    @Override
    public synchronized void run(){
        Thread t = Thread.currentThread();
       
        for (int i1 = i; i1 <= j; i1++) {
            try {
                String s = (String) queue1.pop();
                String s2 = FileUtils.readFileAsString(s);
                int c[]=count(s2);
                String s3 = "file " + s + ",numofchar " +c[0] + ",numofdigit " + c[1] + ",numofrest" + c[2];
                queue2.add(s3);
                notifyAll();
            } catch (InterruptedException | IOException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
