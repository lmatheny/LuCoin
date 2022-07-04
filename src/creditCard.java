/**
 * @author lmatheny
 */

public class creditCard extends paymentType {
    String cvv = "123";

    String cardNumber = "4332 123 4932 9191";

    String expMon = "06";

    String expYear = "2024";

    creditCard() {

    }

    creditCard(String ba, double amount, String fn, String cvv, String cn,
               String exm, String exy) {
        super(ba, amount, fn);
        cvv = this.cvv;
        cn = this.cardNumber;
        exm = this.expMon;
        exy = this.expYear;
    }


    public void deposit(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        super.deposit(amount, currentBalance, btcStart, ethStart, solStart);
    }

}
