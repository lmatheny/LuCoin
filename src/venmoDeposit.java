/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class venmoDeposit {
    JPanel panel;
    JFrame frame;
    JLabel howMuch;
    JTextField answerHowMuch;
    JButton deposit;
    JLabel account;
    JLabel accountLabel;

    venmoAccount luke = new venmoAccount();

    venmoDeposit(String a, double b, double btc, double eth, double sol) {
        panel = new JPanel();
        frame = new JFrame();


        panel.setLayout(null);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Venmo Deposit");

        howMuch = new JLabel("How Much? ");
        howMuch.setBounds(5, 45, 160, 40);
        panel.add(howMuch);
        howMuch.setFont(new Font("SansSerif", Font.PLAIN, 14));

        accountLabel = new JLabel("Account on File:  ");
        accountLabel.setBounds(5, 10, 160, 40);
        panel.add(accountLabel);
        accountLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));

        account = new JLabel(luke.accountName);
        account.setBounds(125, 11, 200, 40);
        panel.add(account);


        answerHowMuch = new JTextField(50);
        answerHowMuch.setBounds(95, 50, 160, 35);
        panel.add(answerHowMuch);

        deposit = new JButton("Deposit");
        deposit.setBounds(10, 100, 80, 50);
        panel.add(deposit);


        frame.setVisible(true);

        deposit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double dub = Double.parseDouble(answerHowMuch.getText());
                        printReceipt(luke);
                        luke.deposit(dub, b, btc, eth, sol);
                    }
                }
        );
    }

    public void printReceipt(venmoAccount luke) {
        System.out.println("************************************");
        System.out.println("Transaction Report");
        System.out.println("Deposit Type: Venmo");
        System.out.println("Name: " + luke.fullName);
        System.out.println("Billing Address: " + luke.billingAddress);
        System.out.println("Account Name " + luke.accountName);
        System.out.println("Transaction visibility: " + luke.visibility);
        System.out.println("************************************");
    }
}
