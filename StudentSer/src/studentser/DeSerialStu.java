
package studentser;
import java.io.*;
public class DeSerialStu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Drive Student File is: ");
        String usrdrive = br.readLine();
        char drive = usrdrive.charAt(0);
        drive = Character.toUpperCase(drive);
        System.out.println("Enter Folder name if ROOT type root");
        String usrpath = br.readLine();
        String path;

        if ("root".equals(usrpath)){
           path = drive + ":\\";
        }
        else{
            path = drive + ":\\" + usrpath + "\\";
            
        }
        File fob = new File(path);
        FilenameFilter fnf = new FileFilter("ser");
        
        String[] ListOfFiles = fob.list(fnf);
        int LenOfList = ListOfFiles.length;
        System.out.println("Number of Files found: "+ListOfFiles.length);
        
        if (LenOfList == 0){
            System.out.println("Sorry No Files Found");
        }
        else{

            String newpath = path + ListOfFiles[0];

            System.out.println(newpath + " File Found!\nPrinting Records...\n");

            FileInputStream fis = new FileInputStream(newpath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            StudentSer stu = (StudentSer) ois.readObject();

            System.out.println(stu.StudentID);
            System.out.println(stu.Name);
            System.out.println(stu.Subject);
        }
    }
    
    
}
