/**
 * @author lmatheny
 */
public class venmoAccount extends paymentType {
    String accountName = "@Luke_Matheny";
    String visibility = "Private";

    venmoAccount() {

    }

    venmoAccount(String ba, double amount, String fn, String accN, String vis) {
        super(ba, amount, fn);
        accN = this.accountName;
        vis = this.visibility;
    }

    public void deposit(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        super.deposit(amount, currentBalance, btcStart, ethStart, solStart);
    }

}
