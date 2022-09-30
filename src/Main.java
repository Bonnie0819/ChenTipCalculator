import java.util.Scanner;
import java.text.DecimalFormat;
    public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#.##");

        // Welcoming Statement/Questions for User
            System.out.println("Welcome to TipCalculator!");

            System.out.print("How many people are in your group?: ");
            int groupTotal = scan.nextInt();
            scan.nextLine();

            System.out.println("What is the tip percentage? (0-100):");
            int tipPercent = scan.nextInt();
            scan.nextLine();

        //Asks for the price of an item
            System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
            double priceOfItem = scan.nextDouble();
            scan.nextLine();
            double billBeforeTip = 0;
            billBeforeTip = billBeforeTip + priceOfItem;

        //Use of while loop to track prices of items bought by user
            while (priceOfItem != -1) {
                System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
                priceOfItem = scan.nextDouble();

                if (priceOfItem == -1) {
                    billBeforeTip = billBeforeTip;
                } else {
                    billBeforeTip = billBeforeTip + priceOfItem;
                }

            }

        //Variables For Receipt
            //Formatting billBeforeTip
            String roundedBillBeforeTip = formatter.format(billBeforeTip);

            //Total Tip
            double tip = (tipPercent * .01 * billBeforeTip);
            String roundedTip = formatter.format(tip);

            //Total Price with Tip
            double totalPrice = billBeforeTip + tip;
            String roundedTotalPrice = formatter.format(totalPrice);

            //Per Person Cost Before Tip
            double personCostBeforeTip = billBeforeTip/groupTotal;
            String roundedPersonCostBeforeTip = formatter.format(personCostBeforeTip);

            //Tip Per Person
            double tipPerPerson = tip/groupTotal;
            String roundedTipPerPerson = formatter.format(tipPerPerson);

            //Total Cost Per Person
            double totalCostPerPerson = totalPrice/groupTotal;
            String roundedTotalCostPerPerson = formatter.format(totalCostPerPerson);

            //Receipt
            System.out.println("___________________________________");
            System.out.println("Total Bill Before Tip: " + roundedBillBeforeTip);
            System.out.println("Tip Percentage: " + tipPercent);
            System.out.println("Total Tip: " + roundedTip);
            System.out.println("Total Bill With Tip: " + roundedTotalPrice);
            System.out.println("Per Person Cost Before Tip: " + roundedPersonCostBeforeTip);
            System.out.println("Tip Per Person: " + roundedTipPerPerson);
            System.out.println("Total Cost Per Person: " + roundedTotalCostPerPerson);



        }
    }

