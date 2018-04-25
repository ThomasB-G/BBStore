
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nick Bradstreet
 */

public class MainGUI extends JFrame {

    private Controller controller; // controller
    private JPanel titlePanel;  // panel
    private JPanel animalPanel;

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
        animalPanel = new JPanel(new GridLayout(2, 3));
        Icon lionCat = new ImageIcon(getClass().getResource("SuperSaiyanLionCat.png"));
        JButton lionCatButton = new JButton(lionCat);
        animalPanel.add(lionCatButton);

        Icon godzillaDragon = new ImageIcon(getClass().getResource("godzillaDragon.png"));
        JButton dragonButton = new JButton(godzillaDragon);
        animalPanel.add(dragonButton);

        Icon bird = new ImageIcon(getClass().getResource("ThisisdefinitelyabirdNOTabat.png"));
        JButton birdButton = new JButton(bird);
        animalPanel.add(birdButton);

        Icon unicorns = new ImageIcon(getClass().getResource("unicornCats.png"));
        JButton unicornButton = new JButton(unicorns);
        animalPanel.add(unicornButton);
        
        Icon dog = new ImageIcon(getClass().getResource("NiaDogO.png"));
        JButton dogButton = new JButton(dog);
        animalPanel.add(dogButton);
        
        Icon russell = new ImageIcon(getClass().getResource("russell.png"));
        JButton russellButton = new JButton(russell);
        animalPanel.add(russellButton);

        // ADDING TO MAIN GUI
        this.setTitle("Home Screen"); // title of MainGUI     "Home Screen" is a placeholder   'this' refers to MainGUI JFrame
        this.setSize(1100, 800); //width,height of MainGUI frame,  size is placeholder
        this.setLocationRelativeTo(null); // centers the panel on the screen
        this.setContentPane(new JPanel(new BorderLayout())); // sets main pane to be a border layout
        this.getContentPane().add(animalPanel, BorderLayout.CENTER);
        this.getContentPane().add(titlePanel, BorderLayout.NORTH); // title panel added to top of JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //when 'x' is clicked on window, program terminates

    }
}
