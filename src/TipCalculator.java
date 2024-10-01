import java.text.DecimalFormat;

public class TipCalculator {
    private double bill;
    private double tipPercentage;
    private int numberOfPeople;
    private DecimalFormat billFormat = new DecimalFormat("$#,##0.00");

    public TipCalculator(double bill, double tipPercentage, int numberOfPeople) {
        this.bill = bill;
        this.tipPercentage = tipPercentage / 100; // Convert percentage to a decimal
        this.numberOfPeople = numberOfPeople;
    }

    public String formatTotalTip() {
        return billFormat.format(bill * tipPercentage);
    }

    public String formatTotalBill() {
        double total = bill + (bill * tipPercentage);
        return billFormat.format(total);
    }

    public String formatTipPerPerson() {
        double tipPerPerson = (bill * tipPercentage) / numberOfPeople;
        return billFormat.format(tipPerPerson);
    }

    public String formatBillPerPerson() {
        double totalBillPerPerson = (bill + (bill * tipPercentage)) / numberOfPeople;
        return billFormat.format(totalBillPerPerson);
    }
}
