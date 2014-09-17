package pkg20140206;

import java.util.*;


//public class temp {
//	public static void main(String[] args) {
//	    	Vector vec = new Vector(8);
//	    	System.out.println("Vector Capactiy: "+vec.capacity());
//                
//                for (int i=0;i<10;i++) {
//                    vec.add(i);
//                }
//
//                System.out.println(vec);
//                System.out.println("Vector Size: "+vec.size());
//                System.out.println("Vector Capacity: "+vec.capacity());
//	}
//}
//


//public class temp {
//    public static void main(String[] args) {
//        String s="Hello World of Java";
//        String s2 = "Ismail";
//        System.out.println("String: " + s);
//        s = s + " " + s2;
//        System.out.println("New String = "+s);
//        System.out.println("Length of the string is: " + s.length());
//        System.out.println("Char at position 7 is " + s.charAt(7));
//        System.out.println("Position of the word \"World\":"+ s.indexOf("World"));
//        
//        String h1= "Hello";
//        String h2= "hello";
//        
//        if(h1.equalsIgnoreCase(h2)){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("Fasle");
//        }
//    }
//}


//public class temp {
//    public static void main(String[] args) {
//        String sen = "Now is the time for all good men to come to the aid of their country";
//        String[] parts = sen.split(" ");
//        
//        for (int i=0;i<parts.length;i++){
//            System.out.println(parts[i]);
//        }
//    }
//}



public class temp {
    public static void main(String[] args) {
        
        String sen = "Now is the time for all good men to come to the aid of their country";
        String[] parts = sen.split(" ");
        for (int i=0;i<parts.length;i++){
            for(int j=i+1;j<parts.length;j++){
                if (parts[j].compareTo(parts[i])<0){
                    String temp = parts[i];
                    parts[i] = parts[j];
                    parts[j] = temp;
                }
            }
        System.out.println(parts[i]);
        }
        String str1 = "Now";
        String str2 = "is";
        int n = str1.compareTo(str2);
        System.out.println(n);

    }
}


