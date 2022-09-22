import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an EVEN integer: ");
        int number = scan.nextInt();

        // the while loop begins and repeats as
        // long as the condition is TRUE; as soon
        // as the condition becomes FALSE, it stops
        while (number % 2 != 0) {
            System.out.print("No silly, i said EVEN not odd! Try again: ");
            number = scan.nextInt();
        }

        System.out.println("Welcome");
    }
}
