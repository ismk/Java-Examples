package fileio;

import java.io.*;

public class FileFilter implements FilenameFilter{
    String ext;
    public FileFilter(String ext){
        this.ext = "."+ext;   
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
    
    
}
