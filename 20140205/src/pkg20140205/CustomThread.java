package pkg20140205;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomThread extends Thread {
    public CustomThread(String name){
        super(name);
        start();
    
}
    public void run(){
        for (int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThread.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    }
    public static void main(String[] args) {
        CustomThread obj1 = new CustomThread("First");
        CustomThread obj2 = new CustomThread("Second");
        CustomThread obj3 = new CustomThread("Third");
        CustomThread obj4 = new CustomThread("Fourth");
        CustomThread obj5 = new CustomThread("Five");
        
    }
}
