package studentser;

import java.io.*;

public class UsrFileIO extends GetPath {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean ok = true;
        while (ok) {
            System.out.println("\nEnter if you want to read or write:");
            System.out.println("Type 1. Write");
            System.out.println("Type 2. Read");
            System.out.println("Type 3. To Exit");

            String usrio = br.readLine();
            if ("1".equals(usrio)) {
                GetPath gp = new GetPath();
                String path = gp.gettingpath();
                WrFile wf = new WrFile();
                wf.writtingtofile(path);
            } else if ("2".equals(usrio)) {
                GetPath gp = new GetPath();
                String path = gp.gettingpath();
                RdFile rf = new RdFile();
                rf.readingoffile(path);
            } else if ("3".equals(usrio)) {
                System.out.println("Goodbye");
                ok = false;
            }

        }

    }

}
