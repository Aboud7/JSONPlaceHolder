
package homework;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Homework {

    public static void main(String[] args) {
        Integer l1 = 100;
        BlockingQueue s1 = new BlockingQueue(l1);
        BlockingQueue s2 = new BlockingQueue(l1);
        Thread1 th = new Thread1(s1);
        th.start();
        Thread2 th1 = new Thread2(s1, s2,0,11);
        th1.start();
        Thread2 th2 = new Thread2(s1, s2,12,23);
        th2.start();
        Thread2 th3 = new Thread2(s1, s2,24,35);
        th3.start();
        Thread2 th4 = new Thread2(s1, s2,36,47);
        th4.start();
        Thread2 th5 = new Thread2(s1, s2,48,59);
        th5.start();
        Thread2 th6 = new Thread2(s1, s2,60,71);
        th6.start();
        Thread2 th7 = new Thread2(s1, s2,72,83);
        th7.start();
        Thread2 th8 = new Thread2(s1, s2,84,99);
        th8.start();
        Thread3 th0 = new Thread3(s2);
        th0.start();
    }
    
}
