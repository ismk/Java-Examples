
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab2
 */
public class switchcase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the month ");
        String month;
        month = br.readLine();
        month = month.substring(0, 3).toLowerCase();
        switch(month){
            case "jan": System.out.println("01 "); break;
            case "feb":System.out.println("02"); break;
            case "mar":System.out.println("03"); break;
            case "apr":System.out.println("04"); break;
            case "may":System.out.println("05"); break;
            case "jun":System.out.println("06"); break;
            case "jul":System.out.println("07"); break;
            case "aug":System.out.println("08"); break;
            case "sep":System.out.println("09"); break;
            case "oct":System.out.println("10"); break;
            case "nov":System.out.println("11"); break;
            case "dec":System.out.println("12"); break;
            default: System.out.println("Please enter a month");                          
        }    
    }
}
