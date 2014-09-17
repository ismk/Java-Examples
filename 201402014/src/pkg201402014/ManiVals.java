package pkg201402014;

import java.awt.Rectangle;

import java.lang.*;

public class ManiVals {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Rectangle rect = (Rectangle) createObject("java.awt.Rectangle");

    }

    static Object createObject(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object object1 = null;
        Class classDefinition = Class.forName(className);
        object1 = classDefinition.newInstance();
        return object1;

    }

}
