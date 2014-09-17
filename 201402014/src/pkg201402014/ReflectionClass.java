package pkg201402014;

import java.awt.Rectangle;
import java.lang.reflect.Field;

public class ReflectionClass {
    
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Thread obj2 = new Thread();
    
        printFields(obj2);
        
    }
    
    
    
    

    static void printFields(Object obj) {
        Class objClass = obj.getClass();
        Field[] publicFields = objClass.getFields();
        for (int i = 0; i < publicFields.length; i++) {
            String fieldName = publicFields[i].getName();
            Class typeClass = publicFields[i].getType();
            String fieldType = typeClass.getName();
            System.out.println("Name" + fieldName + " Type:" + fieldType);
            
        }
        
    }
    
}
