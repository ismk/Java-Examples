/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;

public class FileRead {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream obj1 = new FileInputStream("D:\\new1.txt\\");
        BufferedInputStream obj2 = new BufferedInputStream(obj1);
        Boolean efo = false;
        while (!efo) {
            int b = obj2.read();
            System.out.print((char) b);
            if (b == -1) {
                efo = true;
            }
        }
    }

}
