/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg201402014;

import java.awt.Rectangle;
import java.lang.*;
import java.lang.reflect.Field;

/**
 *
 * @author Administrator
 */
public class ModifyingRect {
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Rectangle rect = new Rectangle(100, 200);
        System.out.println("Original "+ rect.toString());
        ModifyWidth(rect, new Integer(300));
        System.out.println("Modified "+rect.toString());
        
    }
    static void ModifyWidth(Rectangle rect, Integer widthPara) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        Field widthField;
        Integer widthValue;
        
        Class objclass= rect.getClass();
        widthField = objclass.getField("width");
        widthField.set(rect,widthPara);
        
    }
}
