/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternsearchstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class UsrMatch {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String usrInputString;
        String regex;
        
        boolean found = false;
        Pattern ptrn = null;
        Matcher mtcher = null;

        System.out.println("Enter your Regular Expression: ");
        regex = s.nextLine();
        ptrn = Pattern.compile(regex);

        System.out.println("Enter string to search: ");
        usrInputString = s.nextLine();
        mtcher = ptrn.matcher(usrInputString);
        
        
        while (mtcher.find()) {
            System.out.println("Found text " + "\"" + mtcher.group() + "\"" + " Starting at:" + mtcher.start() + " and Ending at:" + mtcher.end());
            found = true;
        }
        if (!found) {
            System.out.println("No Match found");
        }

        if (mtcher.matches()) {
            System.out.println(">>>Exact match found");
        } else {
            System.out.println(">>>Exact match not found");
        }

    }

}
