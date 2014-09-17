
import java.util.*;

public class Books {

    public static void main(String[] args) {

        int catcher = catcher();

        if (catcher == 0) {
            System.out.println("You have earned no points.");
        } else if (catcher == 1) {
            System.out.println("You have earned 5 points.");
        } else if (catcher == 2) {
            System.out.println("You have earned 15 points.");
        } else if (catcher == 3) {
            System.out.println("You have earned 30 points.");
        } else if (catcher >= 4) {
            System.out.println("You have earned 60 points. Very nice!");
        } else {
            System.out.println("You borked it!");
            catcher();
        }
    }

    public static int catcher() {
        final Scanner in = new Scanner(System.in);
        int x;
        System.out.println("How many books have you bought this month? ");
        x = in.nextInt();
        if (x <= 4) {
            return x;
        } else if (x > 4) {
            System.out.println("Nice!");
            return x;
        } else {
            System.out.println("You borked it!");
            catcher();
        }
        return x;
    }
}
