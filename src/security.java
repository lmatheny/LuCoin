/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class security {
    JPanel panel;
    JFrame frame;
    JLabel questionLabel;
    JTextField questionText;
    JButton submit;
    JLabel title;


    security() {

        panel = new JPanel();
        frame = new JFrame();

        panel.setLayout(null);

        frame.setBackground(Color.RED);
        frame.setTitle("Security Question");

        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        title = new JLabel("Security Question");
        title.setBounds(125, 10, 250, 50);
        title.setForeground(Color.RED);
        title.setFont(new Font("SansSerif", Font.BOLD, 27));
        panel.add(title);

        questionLabel = new JLabel("What is your favorite ice-cream?");
        questionLabel.setBounds(140, 75, 250, 30);
        panel.add(questionLabel);

        questionText = new JPasswordField(50);
        questionText.setBounds(160, 125, 150, 40);
        panel.add(questionText);

        submit = new JButton("Submit");
        submit.setBounds(320, 125, 60, 40);
        panel.add(submit);


        frame.setVisible(true);

        submit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (questionText.getText().equals("Cookie Dough")) {
                            home homeScreen = new home("w3123w9181", 65.0, .04, 4.3, 11.4);
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "Incorrect Answer",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        );

    }
}
