/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class withdraw extends bankAccount {
    JPanel panel;
    JFrame frame;
    JLabel howMuch;
    JTextField answerHowMuch;
    JButton withdraw;
    JLabel account;
    JLabel accountLabel;
    double dollarBalance;

    bankAccount luke = new bankAccount();

    withdraw(String a, double b, double btc, double eth, double sol) {
        panel = new JPanel();
        frame = new JFrame();

        frame.setBackground(Color.BLUE);
        frame.setTitle("Withdraw");

        panel.setLayout(null);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);


        howMuch = new JLabel("How Much? ");
        howMuch.setBounds(5, 60, 160, 40);
        panel.add(howMuch);
        howMuch.setFont(new Font("SansSerif", Font.PLAIN, 14));

        accountLabel = new JLabel("Account on File:  ");
        accountLabel.setBounds(5, 10, 160, 40);
        panel.add(accountLabel);
        accountLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));

        String blurred = "(CHASE) *********" + luke.accountNumber.substring(6);
        account = new JLabel(blurred);
        account.setBounds(125, 10, 200, 40);
        panel.add(account);

        answerHowMuch = new JTextField(50);
        answerHowMuch.setBounds(105, 62, 160, 35);
        panel.add(answerHowMuch);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(5, 115, 80, 50);
        panel.add(withdraw);

        frame.setVisible(true);

        withdraw.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double dub = Double.parseDouble(answerHowMuch.getText());

                        if (dub < b) {
                            newWithdraw(dub, b, btc, eth, sol);
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "Not enough funds",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );
    }


    public void newWithdraw(double amount, double currentBalance, double btcStart, double ethStart, double solStart) {
        double newBalance = currentBalance - amount;
        dollarBalance = newBalance;
        System.out.println(dollarBalance);
        home newHome = new home("w3123w9181", newBalance, btcStart, ethStart, solStart);

        System.out.println("************************************");
        System.out.println("Transaction Report");
        System.out.println("Withdraw from wallet: w3123w9181");
        System.out.println("Name: " + luke.fullName);
        System.out.println("Billing Address: " + luke.billingAddress);
        System.out.println("Bank: " + luke.bank);
        System.out.println("Amount: " + amount);
        System.out.println("Account Number: " + luke.accountNumber);
        System.out.println("Routing Number: " + luke.routingNumber);
        System.out.println("************************************");
    }

}
