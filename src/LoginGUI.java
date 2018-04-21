
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LoginGUI {

    private String username = "richChump";
    private String password = "baconBitz";
    private String displayMsg = " ";
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JTextField jTxtUsername;
    private JTextField jTxtPassword;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel welcomeBanner;

    public void LoginGUI() throws IOException {
        JFrame frame = new JFrame();
        welcomeBanner = new JLabel("Welcome to the Brant-Bargain Pet Store!!");
        welcomeBanner.setForeground(Color.yellow);
        welcomeBanner.setFont(new Font("Algerian", Font.ITALIC, 30));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);

        panel.setBackground(Color.BLACK);
        userNameLabel = new JLabel("Username:");
        userNameLabel.setForeground(Color.yellow);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.yellow);
        jTxtUsername = new JTextField(30);
        jTxtPassword = new JTextField(30);
        loginButton = new JButton("Login");
        loginButton.setBackground(Color.darkGray);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(new LoginButtonListener());
        cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.darkGray);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(new CancelButtonListener());

        //THESE COORDINATES TOOK ME FOREVER.
        //Do not touch or Andrea will send you a raincloud.
        welcomeBanner.setBounds(10, 0, 1000, 100);
        userNameLabel.setBounds(100, 100, 100, 100);
        jTxtUsername.setBounds(180, 138, 130, 25);
        passwordLabel.setBounds(400, 100, 100, 100);
        jTxtPassword.setBounds(480, 138, 130, 25);
        loginButton.setBounds(178, 178, 130, 25);
        cancelButton.setBounds(480, 178, 130, 25);
        JLabel bbLogo = new JLabel();
        bbLogo.setIcon(new ImageIcon("src/B-BLogo.png"));
        bbLogo.setBounds(245, 175, 250, 280);
        
        panel.add(bbLogo);
        panel.add(welcomeBanner);
        panel.add(userNameLabel);
        panel.add(jTxtUsername);
        panel.add(passwordLabel);
        panel.add(jTxtPassword);
        panel.add(loginButton);
        panel.add(cancelButton);

        frame.setTitle("BBStore: The Ultimate Undergraduate Tuition Payment System.");
        frame.setSize(800, 500);
        frame.setVisible(true);

    }

    public class LoginButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (username.equals(jTxtUsername.getText())) {
                if (password.equals(jTxtPassword.getText())) {
                    displayMsg = "Welcome to the greatest scam store since the internet. I mean.. Welcome to BB-Petstore!";
                }
            } else {
                displayMsg = "YOU SHALL NOT PASS";
            }

            JOptionPane.showMessageDialog(null, displayMsg);
        }
    }

    public class CancelButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            jTxtUsername.setText("");
            jTxtPassword.setText("");
            jTxtUsername.requestFocus();
        }
    }
}
