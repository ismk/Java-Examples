
package serialization;

import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Employee1 emp1 = new Employee1();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean EnterMoreRecords = true;
        
        String answer;
        
        while(EnterMoreRecords){
        System.out.println("Enter Employee Details:");
        System.out.print("First Name: ");
        emp1.FirstName = br.readLine();
        System.out.print("Last Name: ");
        emp1.LastName = br.readLine();
        System.out.print("Salary: ");
        emp1.Salary = br.readLine();
        System.out.print("Address: ");
        emp1.Address = br.readLine();
        System.out.println("Enter More Employee Records? : ");
        answer = br.readLine();
        answer = answer.toLowerCase();
        
        if ("no".equals(answer) || "n".equals(answer)){
            EnterMoreRecords = false;
            }
        }

        String path = "C:\\EmployeeFile.Ser\\";
        
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
       
        oos.writeObject(emp1);
        
        System.out.println("An Employee is Serialized into -> " + "\"" +path + "\"" );
        fos.close();
        oos.flush();
        oos.close();
        
        

    }
    
}
