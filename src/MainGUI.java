import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Nick Bradstreet
 */

/*
    IN CONTROLLER CLASS:
    Before constructor
    MainGUI mainGUI;

    In constructor
    mainGUI = new MainGUI(this);
    mainGUI.setVisible(true);
*/
public class MainGUI extends JFrame{
    private Controller controller; // controller
    private JPanel titlePanel;  // panel
    private JPanel controlButtonPanel; // button panel
    private JPanel cartButtonPanel; // button panel
    
    public MainGUI(Controller controller)
    {
        this.controller = controller;
        mainGUIComponents();
    }
    
    public void mainGUIComponents()
    {
        /*
        Ari suggested making everything panels, that way you can format
        each panel the way you like, then add said pannel to the main frame.
        
        For now I created a title panel (can hold title, company pic, etc)
        A controle button panel for buttons to navigate the main view
        And a cart button panel that will have the button to link to cart view
        Each button panel can have one or many buttons, doing it like this gives
        us the flexibility on how many buttons we want, and can then use
        BorderLayout to put the panels in place.
        
        EX. this.getContentPane().add(titlePanel, BorderLayout.NORTH);
        that would add the title panel to the north part, you could have the cart
        to the east, and then add all the products we want to a panel and add
        that to the center.
        */
        
        titlePanel = new JPanel(new GridLayout(1,3)); // rows, columns
        controlButtonPanel = new JPanel(new GridLayout(1,3));
        cartButtonPanel = new JPanel(new GridLayout(1,3));
        JButton cartButton = new JButton("Cart");
        cartButton.setToolTipText("Opens cart !"); // when the cart button is hovered over, "Opens cart !" messge pops up to user indicating what that button does
        cartButton.setFont(new Font("Courier", Font.PLAIN, 18));
        //cartButton.addActionListener(event -> );   after ' -> ' you can add what you want that button to do
        
        //HEADER OF MAIN GUI
        JLabel label = new JLabel("The Brant-Bargain Store"); // creates header for main view
        label.setFont(new Font("Courier", Font.BOLD, 16)); // sets the font of the header
        
        //STORE IMAGE
        JLabel storeImage = new JLabel(new ImageIcon("EX: somePicture.txt"));//Store image, put image path in quotes
        
        // ADDING TO TITLE PANEL
        titlePanel.add(label);
        titlePanel.add(storeImage);
        
        // ADDING BUTTONS TO CONTROL_BUTTON_PANEL
        //controlButtonPanel.add();   <- use this to add buttons to controlButtonPanel
        
        // ADDING BUTTONS TO CART_BUTTON_PANEL
        cartButtonPanel.add(cartButton);
        
        // ADDING TO MAIN GUI
        this.setTitle("Home Screen"); // title of MainGUI     "Home Screen" is a placeholder   'this' refers to MainGUI JFrame
        this.setSize(800,600); //width,height of MainGUI frame,  size is placeholder
        this.setLocationRelativeTo(null); // centers the panel on the screen
        this.setContentPane(new JPanel (new BorderLayout())); // sets main pane to be a border layout
        
        // All code below adds components to MainGUI JFrame
        this.getContentPane().add(titlePanel, BorderLayout.NORTH); // title panel added to top of JFrame
        this.getContentPane().add(cartButtonPanel, BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //when 'x' is clicked on window, program terminates
    }
}