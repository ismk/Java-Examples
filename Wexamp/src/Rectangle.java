
import com.sun.xml.internal.ws.util.ReadAllStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab3
 */
public class Rectangle {
    int len;
    int breadth;
    
    Rectangle(int l,int b)
    {
        len=l;
        breadth=b;
        
    }
    void area()
    {
        System.out.println("Area="+(len*breadth));
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(10,20);
        obj.area();
    }
    
}
