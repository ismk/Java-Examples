package studentser;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class RdFile {

    public void readingoffile(String path) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        Boolean efo = false;
        while (!efo) {
            int b = bis.read();
            System.out.print((char) b);
            if (b == -1) {
                efo = true;
            }
        }
    }

}
