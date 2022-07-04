/**
 * @author lmatheny
 */
public class bankAccount extends paymentType {
    String bank = "Chase";

    String routingNumber = "12345678532";

    String accountNumber = "2348736222";

    bankAccount() {

    }

    bankAccount(String ba, double amount, String fn, String bank, String rn, String an) {
        super(ba, amount, fn);
        bank = this.bank;
        rn = this.routingNumber;
        an = this.accountNumber;
    }

    public void deposit(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        super.deposit(amount, currentBalance, btcStart, ethStart, solStart);
    }
}
