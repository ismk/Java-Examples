
import wexamp.shape;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class square extends shape{

   

    public static void main(String[] args) {
        square obj=new square();
        obj.area();
        obj.animate();
    }

    @Override
     public void area() {
        System.out.println("calculate the area");
    }
}
