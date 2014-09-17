/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternsearchstring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class PatternSearchString {

    public static void main(String[] args) {
        
       
        String textString = "Oak and Java";
        System.out.println("Original String: " + textString);
        System.out.println("Search pattern: " + textString);
        Pattern ptrnSearch = Pattern.compile(textString);
        Matcher mtrtext = ptrnSearch.matcher(textString);
        
        if (mtrtext.matches()){
            System.out.println("Exact match, found");
            
        }
        else {
            System.out.println("Exact match not found");
        }
        mtrtext = ptrnSearch.matcher("Java");
        if(mtrtext.matches()){
            System.out.println("Excat match found");
        }
        else{
            System.out.println("Exact match not found");
        }

    }
}
