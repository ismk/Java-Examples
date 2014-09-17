/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentser;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class StuSerialization {
    public static void main(String[] args) throws IOException {
        StudentSer stu = new StudentSer();
        
        
        stu.StudentID = 1000234;
        stu.Name = "Ismail";
        stu.Subject = "Computer Science";
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        System.out.println("Enter the Drive Student File is to be created: ");
        String usrdrive = br.readLine();
        char drive = usrdrive.charAt(0);
        drive = Character.toUpperCase(drive);
        System.out.println("Enter Folder name if ROOT type root");
        String usrpath = br.readLine();
        String path;
        String stufn = "Student.ser";

        if ("root".equals(usrpath)){
           path = drive + ":\\" + stufn;
        }
        else{
            path = drive + ":\\" + usrpath + "\\" + stufn;
            
        }
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(stu);
        
        System.out.println("Student is Serialized into -> " + "\"" + path + "\"");
        
        fos.close();
        oos.flush();
        oos.close();
                
            
        
    }
    
}
