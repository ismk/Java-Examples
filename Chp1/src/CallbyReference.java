
public class CallbyReference {
    int x,y;
    public void swap(CallbyReference o){
        int temp = o.x;
        o.x = o.y;
        o.y = temp;
    }
    public static void main(String[] args) {
        CallbyReference obj = new CallbyReference();
        
        obj.x = 10;
        obj.y = 5;
        
        System.out.println("Values before Swap:");
        System.out.println("Value of x: "+obj.x);
        System.out.println("Value of y: "+obj.y);
        
        obj.swap(obj);
        
        System.out.println("Values after Swap:");
        System.out.println("Value of x: "+obj.x);
        System.out.println("Value of y: "+obj.y);
        
    }
    
}
