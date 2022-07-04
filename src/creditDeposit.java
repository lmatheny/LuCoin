/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class creditDeposit {
    JPanel panel;
    JFrame frame;
    JLabel howMuch;
    JTextField answerHowMuch;
    JButton deposit;
    JLabel cardOnFile;
    JLabel cardLabel;
    creditCard visa = new creditCard();

    creditDeposit(String a, double b, double btc, double eth, double sol) {

        panel = new JPanel();
        frame = new JFrame();


        panel.setLayout(null);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Card Deposit");


        howMuch = new JLabel("How Much? ");
        howMuch.setBounds(5, 45, 160, 40);
        panel.add(howMuch);
        howMuch.setFont(new Font("SansSerif", Font.PLAIN, 14));

        cardLabel = new JLabel("Card on File:  ");
        cardLabel.setBounds(5, 10, 160, 40);
        panel.add(cardLabel);
        cardLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));

        cardOnFile = new JLabel(visa.cardNumber);
        cardOnFile.setBounds(100, 11, 200, 40);
        panel.add(cardOnFile);


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
                        printReceipt(visa);
                        visa.deposit(dub, b, btc, eth, sol);
                    }
                }
        );
    }

    public void printReceipt(creditCard visa) {
        System.out.println("************************************");
        System.out.println("Transaction Report");
        System.out.println("Deposit Type: Credit card");
        System.out.println("Name: " + visa.fullName);
        System.out.println("Billing Address: " + visa.billingAddress);
        System.out.println("Card Number: " + visa.cardNumber);
        System.out.println("CVV: " + visa.cvv);
        System.out.println("Expiration Date: " + visa.expMon + " / " + visa.expYear);
        System.out.println("************************************");
    }
}
