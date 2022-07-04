/**
 * @author lmatheny
 */
public class paymentType extends Wallet {
    String billingAddress = "57 Coulter St.";

    String fullName = "Luke Matheny";

    paymentType(String ba, double a, String fn) {
        ba = this.billingAddress;
        fn = this.fullName;
    }

    paymentType() {

    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void deposit(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        double newBalance = currentBalance + amount;
        dollarBalance = newBalance;
        System.out.println(dollarBalance);
        home newHome = new home("w3123w9181", newBalance, btcStart, ethStart, solStart);
    }


}
