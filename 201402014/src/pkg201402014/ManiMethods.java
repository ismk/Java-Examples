
package pkg201402014;

import java.awt.Rectangle;
import java.lang.reflect.Method;

public class ManiMethods {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        showMethods(rect);
    }
    
    
    public void newMethod(int x, int y){
                
    }
    
    static void showMethods(Object obj){
        Class Object = obj.getClass();
        Method [] themethod = Object.getMethods();
        for (int i =0;i<themethod.length;i++){
            String methodString = themethod[i].getName();
            System.out.println("Name "+methodString);
            String returnString = themethod[i].getReturnType().getName();
            System.out.println("Return Type "+ returnString);
            Class[] parameterTypes = themethod[i].getParameterTypes();
            for (int k = 0; k < parameterTypes.length; k++) {
                String paraString = parameterTypes[k].getName();
                System.out.print(paraString + " <---------------");
            }
        }
        
        
    }
    
}
