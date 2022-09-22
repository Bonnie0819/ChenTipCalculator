import java.util.Scanner;
import java.text.DecimalFormat;
    public class Main {
      public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to TipCalculator!");

        System.out.print("How many people are in your group?: ");
        int number = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage? (0-100):");
        int tipPercent = scan.nextInt();
        scan.nextLine();




//        // the while loop begins and repeats as
//        // long as the condition is TRUE; as soon
//        // as the condition becomes FALSE, it stops
//        while (number % 2 != 0) {
//            System.out.print("No silly, i said EVEN not odd! Try again: ");
//            number = scan.nextInt();
//        }


    }
}
