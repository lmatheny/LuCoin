/**
 * @author lmatheny
 */
public class Wallet {
    String address;

    double dollarBalance;

    double btcStart = 55400;

    double ethStart = 2000;

    double solStart = 400.32;

    Wallet() {

    }

    public double getDollarBalance() {
        System.out.println("used");
        return dollarBalance;

    }

    public void setDollarBalance(double dollarBalance) {
        this.dollarBalance = dollarBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
