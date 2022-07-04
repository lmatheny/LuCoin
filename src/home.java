/**
 * @author lmatheny
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;

public class home extends Wallet {

    JPanel panel;
    JFrame frame;
    JLabel please;
    JButton deposit;
    JLabel balance;
    JButton exit;
    JButton withdraw;
    JLabel welcome;
    JButton buy;
    JButton sell;
    JLabel holdings;
    JLabel line;
    JLabel title;
    JLabel bitcoinLabel;
    JLabel ethLabel;
    JLabel solLabel;
    JLabel myBTC;
    JLabel myETH;
    JLabel mySOL;
    JButton btcMore;
    JButton ethMore;
    JButton solMore;
    BufferedImage punkPic;
    JLabel wallet;
    JLabel showcase;
    JLabel showcaseName;

    home(String a, double b, double btc, double eth, double sol) {

        panel = new JPanel();
        frame = new JFrame();

        panel.setLayout(null);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Home");

        frame.setSize(650, 325);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        balance = new JLabel("Available US Dollars: ");
        balance.setBounds(13, 50, 200, 30);
        panel.add(balance);
        balance.setFont(new Font("SansSerif", Font.BOLD, 14));

        title = new JLabel("LuCoin");
        title.setBounds(511, 12, 150, 50);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        panel.add(title);

        please = new JLabel("$" + b);
        please.setBounds(167, 50, 250, 30);
        panel.add(please);

        holdings = new JLabel("Top Holdings");
        holdings.setBounds(13, 95, 250, 30);
        panel.add(holdings);
        holdings.setFont(new Font("SansSerif", Font.PLAIN, 15));

        bitcoinLabel = new JLabel("BTC: ");
        bitcoinLabel.setBounds(13, 150, 250, 30);
        panel.add(bitcoinLabel);
        bitcoinLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
        bitcoinLabel.setForeground(Color.orange);

        myBTC = new JLabel(btc + "");
        myBTC.setBounds(55, 150, 250, 30);
        panel.add(myBTC);
        myBTC.setFont(new Font("SansSerif", Font.PLAIN, 14));

        btcMore = new JButton("More");
        btcMore.setBounds(95, 150, 65, 30);
        panel.add(btcMore);

        ethLabel = new JLabel("ETH: ");
        ethLabel.setBounds(13, 200, 250, 30);
        panel.add(ethLabel);
        ethLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
        ethLabel.setForeground(Color.BLUE);

        myETH = new JLabel(eth + "");
        myETH.setBounds(55, 200, 250, 30);
        panel.add(myETH);
        myETH.setFont(new Font("SansSerif", Font.PLAIN, 14));

        ethMore = new JButton("More");
        ethMore.setBounds(95, 200, 65, 30);
        panel.add(ethMore);

        solLabel = new JLabel("SOL: ");
        solLabel.setBounds(13, 250, 250, 30);
        panel.add(solLabel);
        solLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
        solLabel.setForeground(Color.MAGENTA);

        mySOL = new JLabel(sol + "");
        mySOL.setBounds(55, 250, 250, 30);
        panel.add(mySOL);
        mySOL.setFont(new Font("SansSerif", Font.PLAIN, 14));

        solMore = new JButton("More");
        solMore.setBounds(95, 250, 65, 30);
        panel.add(solMore);

        line = new JLabel("-----------------");
        line.setBounds(13, 110, 250, 30);
        panel.add(line);
        line.setFont(new Font("SansSerif", Font.PLAIN, 15));

        welcome = new JLabel("Welcome back, Luke");
        welcome.setBounds(13, 15, 250, 30);
        panel.add(welcome);

        welcome.setFont(new Font("SansSerif", Font.ITALIC, 16));

        deposit = new JButton("Deposit");
        deposit.setBounds(500, 70, 125, 40);
        panel.add(deposit);


        buy = new JButton("Buy");
        buy.setBounds(500, 115, 125, 40);
        panel.add(buy);

        sell = new JButton("Sell");
        sell.setBounds(500, 160, 125, 40);
        panel.add(sell);


        withdraw = new JButton("Withdraw");
        withdraw.setBounds(500, 205, 125, 40);
        panel.add(withdraw);

        exit = new JButton("Log out");
        exit.setBounds(500, 250, 125, 40);
        panel.add(exit);


        wallet = new JLabel("Wallet: " + a);
        wallet.setBounds(252, 265, 200, 25);
        panel.add(wallet);
        wallet.setFont(new Font("SansSerif", Font.BOLD, 15));


        showcase = new JLabel("Showcase NFT");
        showcase.setBounds(280, 82, 200, 20);
        showcase.setFont(new Font("SansSerif", Font.BOLD, 15));
        showcase.setForeground(Color.lightGray);
        panel.add(showcase);

        showcaseName = new JLabel("Crypto Punk #9747");
        showcaseName.setBounds(265, 245, 200, 20);
        showcaseName.setFont(new Font("SansSerif", Font.BOLD, 13));
        showcaseName.setForeground(Color.lightGray);
        panel.add(showcaseName);


        try {
            punkPic = ImageIO.read(new File("src/pngs/cpunk.png"));
            JLabel punk = new JLabel(new ImageIcon(punkPic));
            //panel.setLayout(new FlowLayout(FlowLayout.LEFT));
            punk.setBounds(225, 98, 225, 150);

            panel.add(punk);


        } catch (Exception e) {
            System.out.println(" image not found");
        }

        frame.setVisible(true);

        deposit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        depositTypes whatKind = new depositTypes(a, b, btc, eth, sol);
                    }
                }
        );

        withdraw.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        withdraw withdraw = new withdraw(a, b, btc, eth, sol);
                    }
                }
        );


        btcMore.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double currentPrice = 55324.32 * (Math.random() * (1.02 - .98) + .98);
                        bitcoin view = new bitcoin();
                        view.makeGUI(view.getMarketCap(), view.getAbbreviation(), view.getCreator(), currentPrice, view.getLogo(), view.getGraph());
                    }
                }
        );

        ethMore.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double currentPrice = 2000.32 * (Math.random() * (1.02 - .98) + .98);
                        ethereum view = new ethereum();
                        view.makeGUI(view.getMarketCap(), view.getAbbreviation(), view.getCreator(), currentPrice, view.getLogo(), view.getGraph());
                    }
                }
        );

        solMore.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double currentPrice = 400.32 * (Math.random() * (1.02 - .98) + .98);
                        solana view = new solana();
                        view.makeGUI(view.getMarketCap(), view.getAbbreviation(), view.getCreator(), currentPrice, view.getLogo(), view.getGraph());
                    }
                }
        );


        buy.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buy purchase = new buy(a, b, btc, eth, sol);
                    }
                }
        );


        sell.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sell sale = new sell(a, b, btc, eth, sol);
                    }
                }
        );

        exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );

    }
}
