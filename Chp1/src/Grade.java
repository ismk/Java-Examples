
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab2
 */
public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the mark");
        
        int score = Integer.parseInt(br.readLine());
        char grade;
        
        if (score>80){
            grade = 'A';
            System.out.println("Grade ="+grade+"\nDistinction");
            }
        else if (score >70){
            grade = 'B';
            System.out.println("Grade = "+grade+"\nFirst Class");
        }
        else if(score >60){
            grade = 'C';
            System.out.println("Grade = "+grade+"\nHigher Second Class");   
        }
        else {
            grade = 'F';
            System.out.println("Failed");
        }
    }
    
}
