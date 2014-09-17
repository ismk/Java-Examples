

/**
 *
 * @author Lab2
 */
public class continueDemo {
    public static void main(String[] args) {
        String tobesearched = "peter piper picked a peck of pickled peppers";
        int counter=0;
        int lenofstr = tobesearched.length();
        System.out.println(lenofstr);
        for (int i=0; i<lenofstr; i++){
            if ( tobesearched.charAt(i) == 'p'){
                counter++;
            }
        }
        System.out.println("Number of 'p' =" +counter);
    }
    
}
