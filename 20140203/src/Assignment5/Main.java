
package Assignment5;
public class Main implements Animate,Animate2 {
    public Main() {
        function1(10);
        function1(20,30);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void function1(int val1) {
        System.out.println("The Value is "+val1);
       
    }

    @Override
    public void function1(int val1, int val2) {
        System.out.println("The Value 1 is "+val1);
        System.out.println("The Value 2 is "+val2);
    }
}
