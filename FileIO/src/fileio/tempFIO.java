
package fileio;

import java.io.*;
public class tempFIO {
    public static void main(String[] args) {
        File obj1 = new File("D:\\Texts\\");
        FilenameFilter obj2= new FileFilter("txt");
        
        String [] s = obj1.list(obj2);
               
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println(s.length);
        
        }
    
}
