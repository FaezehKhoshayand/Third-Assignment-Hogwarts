/*
    TODO: Import all the classes that you have defined and make use of them to build the program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Program starts from here
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        Account a = new Account();
        System.out.println(a.validatePassword(x));
    }

    public static void runMenu() {
        // TODO: Menu will be shown here...
    }
}
