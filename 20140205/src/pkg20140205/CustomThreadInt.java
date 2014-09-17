package pkg20140205;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomThreadInt implements Runnable {
    Thread t;
    String name;
    public CustomThreadInt(String name){
        t = new Thread(this,name);
        t.start();
    
}
    public void run(){
        for (int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("Exception");
            }
    }
        
    }
    public static void main(String[] args) {
        new CustomThreadInt("First");
        new CustomThreadInt("Second");
        new CustomThreadInt("Third");
        new CustomThreadInt("Fourth");
        new CustomThreadInt("Five");
        
    }
}
