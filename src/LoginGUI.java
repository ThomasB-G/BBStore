
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
    private Controller cntl;

    public LoginGUI(Controller cntl) /*throws IOException, LineUnavailableException, UnsupportedAudioFileException*/ {
        this.cntl = cntl;
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
        loginButton.addActionListener(event -> this.loginButtonPressed());
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
        
        //Adding some delightfully happy music to our login page <-- Love, Andrea
//        AudioInputStream audioIn = AudioSystem.getAudioInputStream(LoginGUI.class.getResource("creepy-background-daniel_simon.wav"));
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioIn);
//        clip.start();
    }

    public void loginButtonPressed()
    {
        this.cntl.loginButtonPressed(this.jTxtUsername.getText(), this.jTxtPassword.getText());
    }

    public class CancelButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            jTxtUsername.setText("");
            jTxtPassword.setText("");
            jTxtUsername.requestFocus();
        }
    }
}
