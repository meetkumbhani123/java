import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;

public class ShowMess {

    private static double monthlyPayment;

    public static void main(String[] args) {
        String annuaalInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate for, example 8.25:");
        double annuaalInterestRate = Double.parseDouble(annuaalInterestRateString);
        double mothlyInterestRate = annuaalInterestRate / 1200;
        String numberOfYearsString = JOptionPane
                .showInputDialog("Enter number of years as integer,\n for example 5 : ");
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        String loanString = JOptionPane.showInputDialog("Enter loan amoun,For example 120000.95 : ");
        double loanAmount = Double.parseDouble(loanString);
        double monthlyPayment = loanAmount * mothlyInterestRate
                / (1 - 1 / Math.pow(1 + mothlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
        totalPayment = (int) (totalPayment * 100) / 100.0;
        
        JOptionPane.showMessageDialog(null, "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment);
    }
}