package pkg201402014;

import java.awt.Rectangle;
import java.lang.reflect.Constructor;

public class ReflectionConstructor {

    public static void main(String[] args) {
        Rectangle recobj = new Rectangle();
        showConstructor(recobj);

    }

    static void showConstructor(Object obj) {

        Class objClass = obj.getClass();
        Constructor[] thecon = objClass.getConstructors();
        for (int i = 0; i < thecon.length; i++) {
            System.out.print("(");
            Class[] parameterTypes = thecon[i].getParameterTypes();
            for (int k = 0; k < parameterTypes.length; k++) {
                String paraString = parameterTypes[k].getName();
                System.out.print(paraString + " ");
            }
            System.out.println(")");
        }

    }

}
