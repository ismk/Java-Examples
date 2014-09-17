
package gen;

public class Studpair<T, U> {
    private T name;
    private U rollnum;
    
    
    public Studpair(T nme, U rnum){
        
        name = nme;
        rollnum = rnum;
    }
    public U StudRN(){
        return rollnum;
    }
    public T StudN(){
        return name;
    }
    
}
