/**
 * @author lmatheny
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class crypto {
    String marketCap;
    String abbreviation;
    String creator;
    String logo;
    String graph;
    JPanel panel;
    JFrame frame;
    JLabel show;
    JLabel name;
    JLabel market;
    JLabel inventor;
    JLabel explanation;

    BufferedImage punkPic;
    BufferedImage chart;


    public crypto() {
    }

    public void makeGUI(String m, String a, String c, double p, String coinPic, String coinGraph) {
        panel = new JPanel();
        frame = new JFrame();
        panel.setLayout(null);


        frame.setSize(365, 295);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);

        frame.setBackground(Color.BLUE);
        frame.setTitle(a + " Information");

        name = new JLabel(a);
        name.setBounds(10, 15, 40, 20);
        name.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(name);


        market = new JLabel("Market Cap: " + m);
        market.setBounds(10, 95, 400, 20);
        market.setFont(new Font("SansSerif", Font.PLAIN, 14));
        panel.add(market);

        inventor = new JLabel("Creator: " + c);
        inventor.setBounds(10, 135, 400, 20);
        inventor.setFont(new Font("SansSerif", Font.PLAIN, 14));
        panel.add(inventor);


        explanation = new JLabel("Last 5 days");
        explanation.setBounds(142, 250, 400, 20);
        explanation.setFont(new Font("SansSerif", Font.BOLD, 14));
        explanation.setForeground(Color.RED);
        panel.add(explanation);

        double rounded = 0.01 * Math.floor(p * 100.0);
        show = new JLabel("Current price: $" + rounded);
        show.setBounds(10, 50, 400, 30);
        panel.add(show);
        show.setFont(new Font("SansSerif", Font.PLAIN, 15));


        try {
            punkPic = ImageIO.read(new File(coinPic));
            JLabel punk = new JLabel(new ImageIcon(punkPic));

            punk.setBounds(20, -14, 100, 80);

            panel.add(punk);


        } catch (Exception e) {
            System.out.println(" image not found");
        }

        try {
            chart = ImageIO.read(new File(graph));
            JLabel bChart = new JLabel(new ImageIcon(chart));

            bChart.setBounds(73, 170, 230, 75);

            panel.add(bChart);


        } catch (Exception e) {
            System.out.println(" image not found");
        }


        frame.setVisible(true);

    }

    public String getMarketCap() {
        return marketCap;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCreator() {
        return creator;
    }

    public String getLogo() {
        return logo;
    }

    public String getGraph() {
        return graph;
    }
}
