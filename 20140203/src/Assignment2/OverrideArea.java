package Assignment2;

import java.io.*;

public class OverrideArea {
    int length,breadth;
    OverrideArea(int a, int b){
        length = a;
        breadth = b;      
    }
    int area(){
        return (length*breadth);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length: ");
        int usrlen = Integer.parseInt(br.readLine());
        System.out.println("Enter Breadth: ");
        int usrbre = Integer.parseInt(br.readLine());
        
        OverrideArea obj1 = new OverrideArea(usrlen,usrbre);
        System.out.println("Area = "+obj1.area());
        
    }
}
