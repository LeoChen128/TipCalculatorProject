//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //takes bill from user input
        System.out.println("Please enter the bill in dollars and cents: ");
        double bill = scan.nextDouble();
        System.out.println("----------------------------------------------");

        //obtain tip percentage from user input
        System.out.println("What is the tip percentage: ");
        double tipPercentage = scan.nextDouble();
        System.out.println("----------------------------------------------");

        //obtain number of people from user input
        System.out.println("Number of people: ");
        int numberOfPeople = scan.nextInt();

        TipCalculator calculator = new TipCalculator(bill, tipPercentage, numberOfPeople);

        System.out.println("Total Bill amount: " + calculator.formatTotalBill());
        System.out.println("----------------------------------------------");
        System.out.println("Total Tip amount: " + calculator.formatTotalTip());
        System.out.println("----------------------------------------------");
        System.out.println("Tip per person: " + calculator.formatTipPerPerson());
        System.out.println("----------------------------------------------");
        System.out.println("Bill per person: " + calculator.formatBillPerPerson());
        System.out.println("----------------------------------------------");

        scan.close();
    }
}
