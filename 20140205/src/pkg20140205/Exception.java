package pkg20140205;
public class Exception {
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=42/d;
            System.out.println("This is will not be printed");
           }
//        catch (ArithmeticException e) {
//            System.out.println("The exception is "+e);
//        }
       finally{
       System.out.println("This will print no matter the result");
}
        System.out.println("After catch statement");
        

}
}