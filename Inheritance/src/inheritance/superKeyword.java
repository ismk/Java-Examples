
package inheritance;
public class superKeyword extends superclass {
    public void printMethod() {
        super.Methodprint();
        System.out.println("Printed in Subclass");
        
    }
    public static void main(String[] args) {
        superKeyword s = new superKeyword();
        s.printMethod();
                
                
    }
}
