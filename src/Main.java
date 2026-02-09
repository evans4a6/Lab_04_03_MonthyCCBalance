//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final double INTEREST_RATE = 0.17;
        double balance = 5000.0;
        double monthlyRate = 0.0;
        double oneBalance = 0.0;
        double twoBalance = 0.0;

        monthlyRate = balance * INTEREST_RATE;
        oneBalance = monthlyRate + balance;
        twoBalance = (oneBalance * INTEREST_RATE) + oneBalance;
        System.out.println("Your credit card balance is " + balance + " dollars. After one month of interest, the new balance is " + oneBalance + " dollars.");
        System.out.println("Your credit card balance after two months is " + twoBalance + " dollars.");
    }
}