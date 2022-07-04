/**
 * @author lmatheny
 */
public class paypalAccount extends paymentType {
    String email = "lmatheny55@gmail.com";

    String accountUsername = "lukemat55";

    String accountPassword = "CNIT255";

    paypalAccount() {

    }

    paypalAccount(String ba, double amount, String fn, String e, String accUser, String accPass) {
        super(ba, amount, fn);
        e = this.email;
        accUser = this.accountUsername;
        accPass = this.accountPassword;
    }

    public void deposit(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        super.deposit(amount, currentBalance, btcStart, ethStart, solStart);
    }
}
