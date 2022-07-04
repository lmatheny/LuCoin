/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sell extends Wallet implements trade {
    JPanel panel;
    JFrame frame;
    JTextField amount;
    JTextField type;
    JLabel coin;
    JLabel quantity;
    JButton sell;
    JLabel sale;

    sell(String a, double b, double btc, double eth, double sol) {
        panel = new JPanel();
        frame = new JFrame();


        panel.setLayout(null);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Sell");

        frame.setSize(325, 225);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);

        sale = new JLabel("Sell Crypto");
        sale.setBounds(15, 10, 200, 30);
        panel.add(sale);
        sale.setFont(new Font("SansSerif", Font.BOLD, 17));

        amount = new JTextField(50);
        amount.setBounds(95, 100, 160, 35);
        panel.add(amount);

        type = new JTextField(50);
        type.setBounds(95, 50, 160, 35);
        panel.add(type);

        sell = new JButton("Sell");
        sell.setBounds(95, 150, 160, 35);
        panel.add(sell);
        sell.setFont(new Font("SansSerif", Font.BOLD, 14));

        coin = new JLabel("Coin type: ");
        coin.setBounds(15, 50, 70, 35);
        panel.add(coin);

        quantity = new JLabel("Quantity: ");
        quantity.setBounds(15, 100, 70, 35);
        panel.add(quantity);

        frame.setVisible(true);

        sell.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        if (type.getText().equals("BTC") || type.getText().equals("btc") &&
                                (Double.parseDouble(amount.getText()) <= btc)) {

                            double doubleVersion = Double.parseDouble(amount.getText());
                            double updatedHolding = btc - doubleVersion;
                            updatedHolding = 0.01 * Math.floor(updatedHolding * 100.0);

                            double currentPrice = (55321.32 * (Math.random() * (1.02 - .98) + .98));
                            double newBalance = b + (currentPrice * doubleVersion);
                            newBalance = 0.01 * Math.floor(newBalance * 100.0);

                            updateHome(a, newBalance, updatedHolding, eth, sol, "BTC");
                        } else if (type.getText().equals("ETH") || type.getText().equals("eth") &&
                                (Double.parseDouble(amount.getText()) <= eth)) {

                            double doubleVersion = Double.parseDouble(amount.getText());
                            double updatedHolding = eth - doubleVersion;
                            updatedHolding = 0.01 * Math.floor(updatedHolding * 100.0);

                            double currentPrice = (2001.32 * (Math.random() * (1.02 - .98) + .98));
                            double newBalance = b + (currentPrice * doubleVersion);
                            newBalance = 0.01 * Math.floor(newBalance * 100.0);

                            updateHome(a, newBalance, btc, updatedHolding, sol, "ETH");

                        } else if (type.getText().equals("SOL") || type.getText().equals("sol") &&
                                (Double.parseDouble(amount.getText()) <= sol)) {

                            double doubleVersion = Double.parseDouble(amount.getText());
                            double updatedHolding = sol - doubleVersion;
                            updatedHolding = 0.01 * Math.floor(updatedHolding * 100.0);

                            double currentPrice = (400.32 * (Math.random() * (1.02 - .98) + .98));
                            double newBalance = b + (currentPrice * doubleVersion);
                            newBalance = 0.01 * Math.floor(newBalance * 100.0);

                            updateHome(a, newBalance, btc, eth, updatedHolding, "SOL");
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "You do not have the funds or desired coin does not exist",
                                    "Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                }

        );


    }

    public void receipt(String a, double b, String c) {
        System.out.println("************************************");
        System.out.println("Transaction Report");
        System.out.println("Trade type: sale");
        System.out.println("Coin sold: " + c);
        System.out.println("Wallet Address: " + a);
        System.out.println("New balance: " + b);
        System.out.println("************************************");
    }

    public void updateHome(String a, double b, double btc, double eth, double sol, String c) {

        double updatedBalance = b;
        double updatedBTC = btc;
        double updatedETH = eth;
        double updatedSOL = sol;

        receipt("w3123w9181", updatedBalance, c);
        home luke = new home("w3123w9181", updatedBalance, updatedBTC, updatedETH, updatedSOL);


    }

}
