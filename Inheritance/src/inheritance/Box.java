
package inheritance;

class Box extends Rectangle {
    protected int h;

    public Box(int a,int b,int c){
        super(a,b);
         h = c;
    }
    int getVolume(){
        return l*b*h;
    }
    
    public static void main(String[] args) {
        Box b = new Box(5,6,7);
        System.out.println(b.getVolume());
    }

}
