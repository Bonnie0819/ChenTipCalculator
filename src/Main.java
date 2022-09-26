import java.util.Scanner;
import java.text.DecimalFormat;
    public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#.##");

        //Welcoming Statement
            System.out.println("Welcome to TipCalculator!");

            System.out.print("How many people are in your group?: ");
            int groupTotal = scan.nextInt();
            scan.nextLine();

            System.out.println("What is the tip percentage? (0-100):");
            int tipPercent = scan.nextInt();
            scan.nextLine();

        //Asks for the price of item
            System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
            double priceOfItem = scan.nextDouble();
            scan.nextLine();
            double billBeforeTip = 0;
            billBeforeTip = billBeforeTip + priceOfItem;


        //Use of while loop to track prices of items
            while (priceOfItem != -1) {
                System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
                priceOfItem = scan.nextDouble();

                if (priceOfItem == -1) {
                    billBeforeTip = billBeforeTip;
                } else {
                    billBeforeTip = billBeforeTip + priceOfItem;
                }

            }


            //Receipt
            System.out.println("____________________________");
            System.out.println(billBeforeTip);

        }
    }

