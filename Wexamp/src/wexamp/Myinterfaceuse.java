/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wexamp;

/**
 *
 * @author Admin
 */
public class Myinterfaceuse implements InterfaceDemo,InterfaceDemo2 {

    public Myinterfaceuse() {
        
        changecadence(20);
        changegear(30);
        changespeed(40);
        
        changecadence(420);
        changegear(730);
        changespeed(240);
        funinter();
    }
    
    
    

    @Override
    public void changecadence(int val1) {
        System.out.println("value1="+val1);
    }

    @Override
    public void changegear(int val2) {
   System.out.println("value2="+val2);    }

    @Override
    public void changespeed(int val3) {
   System.out.println("value3="+val3);    }
    
    
    
    public static void main(String[] args) {
        new Myinterfaceuse();
    }

    @Override
    public void funinter() {
         System.out.println("Function of 2 nd interface");    
    }
    
    
}
