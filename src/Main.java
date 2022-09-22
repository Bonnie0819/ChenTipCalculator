import java.util.Scanner;
import java.text.DecimalFormat;
    public class Main {
      public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to TipCalculator!");

        System.out.print("How many people are in your group?: ");
        int groupTotal = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage? (0-100):");
        int tipPercent = scan.nextInt();
        scan.nextLine();


        System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
        double priceOfItem = scan.nextDouble();

        while (priceOfItem != -1) {
            System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
            priceOfItem = scan.nextDouble();
        }





    }
}
