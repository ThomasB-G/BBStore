
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nick Bradstreet
 */

public class MainGUI extends JFrame {

    private Controller controller; // controller
    private JPanel titlePanel;  // panel
    private JPanel centerPanel;
    private JPanel animalPanel1;
    private JPanel animalPanel2;
    private JPanel animalPanel3;
    private JPanel animalPanel4;
    private JPanel animalPanel5;
    private JPanel animalPanel6;

    public MainGUI(Controller controller) {
        this.controller = controller;
        mainGUIComponents();
    }

    public void mainGUIComponents() {
        
        //HEADER OF MAIN GUI
        JLabel label = new JLabel("The Brant-Bargain Store"); // creates header for main view
        label.setFont(new Font("Courier", Font.BOLD, 25)); // sets the font of the header
        
        titlePanel = new JPanel(new GridLayout(1, 2)); // rows, columns
        Icon cartIcon = new ImageIcon(getClass().getResource("shoppingCartIconSmall.png"));
        JButton cartButton = new JButton(cartIcon);
        cartButton.setToolTipText("Opens cart !"); // when the cart button is hovered over, "Opens cart !" messge pops up to user indicating what that button does
        cartButton.addActionListener(event -> controller.cartButtonPressed());


        // ADDING TO PANELS
        titlePanel.add(label);
        titlePanel.add(cartButton);
        centerPanel = new JPanel(new GridLayout(2, 3));
        animalPanel1 = new JPanel(new GridLayout(3, 1));
        animalPanel2 = new JPanel(new GridLayout(3, 1));
        animalPanel3 = new JPanel(new GridLayout(3, 1));
        animalPanel4 = new JPanel(new GridLayout(3, 1));
        animalPanel5 = new JPanel(new GridLayout(3, 1));
        animalPanel6 = new JPanel(new GridLayout(3, 1));
        
        Icon lionCat = new ImageIcon(getClass().getResource("SuperSaiyanLionCat.png"));
        JTextField name1 = new JTextField(25);
        name1.setText("Randy");
        name1.setEditable(false);
        JTextField price1 = new JTextField(25);
        price1.setText("$5,000.99");
        price1.setEditable(false);
        JButton lionCatButton = new JButton(lionCat);
        lionCatButton.addActionListener(event -> controller.addToCart(new Cat(5000.99, "Randy", 100, 850.00, 10.00, 01)));
        lionCatButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Randy the Lion Cat Added to Cart !!!"));
        animalPanel1.add(lionCatButton);
        animalPanel1.add(name1);
        animalPanel1.add(price1);

        Icon godzillaDragon = new ImageIcon(getClass().getResource("godzillaDragon.png"));
        JTextField name2 = new JTextField(25);
        name2.setText("Oscar");
        name2.setEditable(false);
        JTextField price2 = new JTextField(25);
        price2.setText("$3,300,000.75");
        price2.setEditable(false);
        JButton dragonButton = new JButton(godzillaDragon);
        dragonButton.addActionListener(event -> controller.addToCart(new Dragon(3300000.75, "Oscar", 1000, 15000.00, 500.00, 02)));
        dragonButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Oscar the Dragon Added to Cart !!!"));
        animalPanel2.add(dragonButton);
        animalPanel2.add(name2);
        animalPanel2.add(price2);

        Icon bird = new ImageIcon(getClass().getResource("ThisisdefinitelyabirdNOTabat.png"));
        JTextField name3 = new JTextField(25);
        name3.setText("Bruce");
        name3.setEditable(false);
        JTextField price3 = new JTextField(25);
        price3.setText("$5,500,000,000.50");
        price3.setEditable(false);
        JButton birdButton = new JButton(bird);
        birdButton.addActionListener(event -> controller.addToCart(new Bird(5500000000.50, "Bruce", 21, 220.00, 6.10, 03)));
        birdButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Bruce Wayne Added to Cart !!!"));
        animalPanel3.add(birdButton);
        animalPanel3.add(name3);
        animalPanel3.add(price3);

        Icon unicorns = new ImageIcon(getClass().getResource("unicornCats.png"));
        JTextField name4 = new JTextField(25);
        name4.setText("Beth");
        name4.setEditable(false);
        JTextField price4 = new JTextField(25);
        price4.setText("$7,557,822.23");
        price4.setEditable(false);
        JButton unicornButton = new JButton(unicorns);
        unicornButton.addActionListener(event -> controller.addToCart(new Unicorn(7557822.23, "Beth", 900, 600.00, 6.00, 04)));
        unicornButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Beth the Unicorn Added to Cart !!!"));
        animalPanel4.add(unicornButton);
        animalPanel4.add(name4);
        animalPanel4.add(price4);
        
        Icon dog = new ImageIcon(getClass().getResource("NiaDogO.png"));
        JTextField name5 = new JTextField(25);
        name5.setText("Alfalfa");
        name5.setEditable(false);
        JTextField price5 = new JTextField(25);
        price5.setText("$22.19");
        price5.setEditable(false);
        JButton dogButton = new JButton(dog);
        dogButton.addActionListener(event -> controller.addToCart(new Dog(22.19, "Alfalfa", 1, 20, 1.0, 05)));
        dogButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Alfalfa the good Doggo Added to Cart !!!"));
        animalPanel5.add(dogButton);
        animalPanel5.add(name5);
        animalPanel5.add(price5);
        
        Icon russell = new ImageIcon(getClass().getResource("russell.png"));
        JTextField name6 = new JTextField(25);
        name6.setText("Russell");
        name6.setEditable(false);
        JTextField price6 = new JTextField(25);
        price6.setText("$999,999.99");
        price6.setEditable(false);
        JButton russellButton = new JButton(russell);
        russellButton.addActionListener(event -> controller.addToCart(new Dragon(999999.99, "Russell", 1000, 15000.00, 500.00, 06)));
        russellButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "CAUTION: A WILD RUSSEL HAS BEEN ADDED TO YOUR CART !!!"));
        animalPanel6.add(russellButton);
        animalPanel6.add(name6);
        animalPanel6.add(price6);
        
        centerPanel.add(animalPanel1);
        centerPanel.add(animalPanel2);
        centerPanel.add(animalPanel3);
        centerPanel.add(animalPanel4);
        centerPanel.add(animalPanel5);
        centerPanel.add(animalPanel6);

        // ADDING TO MAIN GUI
        this.setTitle("Home Screen"); // title of MainGUI     "Home Screen" is a placeholder   'this' refers to MainGUI JFrame
        this.setSize(1100, 800); //width,height of MainGUI frame,  size is placeholder
        this.setLocationRelativeTo(null); // centers the panel on the screen
        this.setContentPane(new JPanel(new BorderLayout())); // sets main pane to be a border layout
        this.getContentPane().add(centerPanel, BorderLayout.CENTER);
        this.getContentPane().add(titlePanel, BorderLayout.NORTH); // title panel added to top of JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //when 'x' is clicked on window, program terminates

    }
    
}
