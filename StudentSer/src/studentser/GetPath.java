package studentser;

import java.io.*;

public class GetPath {

    public String gettingpath() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Drive where File is to be created/read: ");
        String usrdrive = br.readLine();
        char drive = usrdrive.charAt(0);
        drive = Character.toUpperCase(drive);

        System.out.println(
                "Enter Folder name if ROOT type root");
        String usrpath = br.readLine();
        String path;
        String stufn = "anewfile.txt";

        if ("root".equals(usrpath)) {
            path = drive + ":\\" + stufn;
        } else {
            path = drive + ":\\" + usrpath + "\\" + stufn;
        }
        return path;
    }

}
