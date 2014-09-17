
package serialization;
import java.io.*;
public class DeSerialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String path = "C:\\EmployeeFile.Ser\\";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Employee1 emp2 = (Employee1)ois.readObject();
        
        System.out.println(emp2.FirstName);
        System.out.println(emp2.LastName);
        System.out.println(emp2.Salary);
        System.out.println(emp2.Address);
        

        
    }
    
    
}
