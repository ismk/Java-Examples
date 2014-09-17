
package gen;
public class CountWord {
    public static <T> int CountNumberOfOccurances(T[] list, T itemtocount) {
        int countobj=0;
        if(itemtocount == null){
            for ( T wordObj:list) {
                if (wordObj == null){
                    countobj++;
                }
            }
        }
        else{
            for (T wordItem:list) {
                if (itemtocount.equals(wordItem)){
                    countobj++;
                }
            }
        }
        return countobj;        
    
}
    
    

public static void main(String[] args) {
    String[] wordList = {"Hello", "Java", "hello", "Java"};
    String search = "Java";
    
    int number = CountNumberOfOccurances(wordList, search);
    System.out.println(number);

}

}