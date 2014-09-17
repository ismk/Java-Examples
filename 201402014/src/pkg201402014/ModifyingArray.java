/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg201402014;

import java.lang.reflect.Array;

/**
 *
 * @author Administrator
 */
public class ModifyingArray {

    public static void main(String[] args) {
        int[] intArray = {83, 20, 30, 40, 50};
        System.out.print("The Original Array:");
        for (int i = 0; i < intArray.length; i++) {

            System.out.print(" " + intArray[i]);
        }
        displayArray(intArray, 60);
        System.out.println("");
        System.out.print("The Modified Array:");
        for (int i:intArray) {

            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.println("HEllO World!");
        System.out.println();

    }

    public static void displayArray(Object Source, Integer value) {
//        System.out.println(Array.get(Source, 0));
        Array.set(Source, 0, value);
//        System.out.println(Array.get(Source, 0));
    }
}
