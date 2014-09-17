/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wexamp;

/**
 *
 * @author Admin
 */
public class childclass extends parentclass{
    @Override
    int printmethod()
    {
        System.out.println("This is method of child class");
        super.printmethod();
        return 1;
    }
    public static void main(String[] args) {
        childclass obj=new childclass();
        obj.printmethod();
        obj.printmethod2();
        
    }
    
}
