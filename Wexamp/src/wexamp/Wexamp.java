/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wexamp;

public class Wexamp {

   public static void main(String[] args) {
           
        String str="Hello hw r u 123 ";
        int a=0;
        int b=0;
        int c=0;
       
for(int i=0;i<str.length();i++)
        
        {
            if(Character.isDigit(str.charAt(i)))
            {
                a++;
            }
            else if(Character.isSpace(str.charAt(i)))
            {
                b++;
            }
            else if(Character.isLetter(str.charAt(i)))
            {
                c++;
            }
            
        }
        System.out.println("No. of Digits " +a);
        System.out.println("No. of Spaces " +b);
      System.out.println("No. of Letters " +c);
}
   }