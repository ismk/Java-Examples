
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab2
 */
public class rectangle {
    public int length, breadth;
    
    public rectangle (int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        
    }
    public int getArea(){
        return length * breadth;
    }
    public int getPerimeter(){
        return 2*(length + breadth);
    }
    public static void main(String[] args) throws IOException {
    
        int l,b;
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter Length: ");
        l = Integer.parseInt(br.readLine());
        System.out.println("Enter Breadth: ");
        b= Integer.parseInt(br.readLine());
        rectangle obj1 = new rectangle(l,b);
        System.out.println("Rectangle \n");
        System.out.println("Length: "+obj1.length);
        System.out.println("Breadth: "+obj1.breadth);
        System.out.println("Area: "+obj1.getArea());
        System.out.println("Perimeter: "+obj1.getPerimeter());
    }
    
}
