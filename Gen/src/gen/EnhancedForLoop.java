
package gen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EnhancedForLoop {
    public static void main(String[] args) throws IOException {
//        String usrStr = "Hello this is the world of Java";
//        String[] parts = usrStr.split(" ");
//        for (String s:parts){
//            System.out.println(s);
//        }
//
//        int[] usrInt={1,2,3,4,5,6,7,8,9,0};
//        for (int i:usrInt){
//            System.out.println(i);
//        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> alist = new ArrayList<Integer>();
        System.out.println("How many numbers to be added ? ");
        int usrans = Integer.parseInt(br.readLine());
        
        for (int i =0;i<usrans;i++){
            alist.add(Integer.parseInt(br.readLine()));
        }
        for(int a:alist){
            System.out.println(a);
        }
        
        
    }
    
}
