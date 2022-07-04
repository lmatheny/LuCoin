/**
 * @author lmatheny
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

public class depositTypes {

    JPanel panel;
    JFrame frame;
    JLabel selectType;
    JButton creditCard;
    JButton paypal;
    JButton venmo;
    JButton direct;

    BufferedImage visaPic;
    BufferedImage paypalPic;
    BufferedImage venmoPic;
    BufferedImage bankPic;

    depositTypes(String a, double b, double btc, double eth, double sol) {
        panel = new JPanel();
        frame = new JFrame();

        panel.setLayout(null);

        frame.setSize(275, 280);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Payment Types");


        selectType = new JLabel("Select Payment Type");
        selectType.setBounds(18, 10, 200, 30);
        panel.add(selectType);
        selectType.setFont(new Font("SansSerif", Font.BOLD, 15));

        creditCard = new JButton("Credit card");
        creditCard.setBounds(10, 50, 120, 40);
        panel.add(creditCard);

        paypal = new JButton("PayPal");
        paypal.setBounds(10, 100, 120, 40);
        panel.add(paypal);

        venmo = new JButton("Venmo");
        venmo.setBounds(10, 150, 120, 40);
        panel.add(venmo);

        direct = new JButton("Bank Deposit ");
        direct.setBounds(10, 200, 120, 40);
        panel.add(direct);

        try {
            visaPic = ImageIO.read(new File("src/pngs/visa.png"));
            JLabel vPic = new JLabel(new ImageIcon(visaPic));

            vPic.setBounds(130, 30, 100, 80);

            panel.add(vPic);


        } catch (Exception e) {
            System.out.println(" image not found");
        }


        try {
            paypalPic = ImageIO.read(new File("src/pngs/paypal.png"));
            JLabel pPic = new JLabel(new ImageIcon(paypalPic));

            pPic.setBounds(130, 80, 100, 80);

            panel.add(pPic);


        } catch (Exception e) {
            System.out.println(" image not found");
        }

        try {
            venmoPic = ImageIO.read(new File("src/pngs/venmo.png"));
            JLabel venPic = new JLabel(new ImageIcon(venmoPic));

            venPic.setBounds(130, 130, 100, 80);

            panel.add(venPic);


        } catch (Exception e) {
            System.out.println(" image not found");
        }

        try {
            bankPic = ImageIO.read(new File("src/pngs/chase.png"));
            JLabel bPic = new JLabel(new ImageIcon(bankPic));

            bPic.setBounds(130, 180, 100, 80);

            panel.add(bPic);


        } catch (Exception e) {
            System.out.println(" image not found");
        }


        frame.setVisible(true);

        creditCard.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        creditDeposit cd = new creditDeposit(a, b, btc, eth, sol);
                    }
                }
        );

        paypal.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        paypalDeposit pp = new paypalDeposit(a, b, btc, eth, sol);
                    }
                }
        );

        venmo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        venmoDeposit ven = new venmoDeposit(a, b, btc, eth, sol);
                    }
                }
        );

        direct.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bankDeposit bd = new bankDeposit(a, b, btc, eth, sol);
                    }
                }
        );

    }
}
