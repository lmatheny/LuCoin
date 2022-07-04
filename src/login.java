/**
 * @author lmatheny
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import java.awt.Color;
import java.util.HashMap;

public class login extends JFrame {

    JButton submit;
    JButton exit;

    JTextField usernameText;
    JTextField passwordText;


    JLabel usernameLabel;
    JLabel passwordLabel;
    JLabel title;

    JPanel panel;
    JFrame frame;


    login() {
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("Lmatheny", "admin123");


        panel = new JPanel();
        frame = new JFrame();

        panel.setLayout(null);

        frame.setBackground(Color.BLUE);
        frame.setTitle("Login");

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        title = new JLabel("LuCoin");
        title.setBounds(155, 0, 150, 50);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("SansSerif", Font.BOLD, 25));
        panel.add(title);


        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(40, 60, 150, 30);
        panel.add(usernameLabel);

        usernameText = new JTextField(60);
        usernameText.setBounds(130, 60, 200, 30);
        panel.add(usernameText);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(40, 100, 150, 30);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(60);
        passwordText.setBounds(130, 100, 200, 30);
        panel.add(passwordText);


        exit = new JButton("Exit");
        exit.setBounds(30, 150, 150, 50);
        panel.add(exit);

        submit = new JButton("Submit");
        submit.setBounds(210, 150, 150, 50);
        panel.add(submit);

        frame.setVisible(true);

        submit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (users.containsKey(usernameText.getText()) &&
                                users.containsValue(passwordText.getText())) {
                            security secondFactor = new security();
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "You are not Luke",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
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
