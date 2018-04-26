
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */
public class Controller {
    private MainGUI mainGUI;
    private CartGUI cartGUI;
    private LoginGUI loginGUI;
    private LoginModel loginModel;
    private Cart cartModel;
    private Stock stockModel;

    public Controller() {
        loginModel = new LoginModel(this);
        
        cartModel = new Cart(this);
        stockModel = new Stock(this);
        System.out.println(cartModel.getColumnCount());
        mainGUI = new MainGUI(this);
        cartGUI = new CartGUI(this);
        loginGUI = new LoginGUI(this);
        this.loginGUI.setVisible(true);
    }
    
    public void loginButtonPressed(String user, String password)
    {
        if(this.loginModel.authenticate(user, password))
        {
            this.loginGUI.dispose();
            this.mainGUI.setVisible(true);
        }
        else
        {
            this.loginGUI.failedAuthenticate();
        }
    }
    
    public void cartButtonPressed()
    {
        
        this.mainGUI.setVisible(false);
        this.cartGUI.setVisible(true);
        this.cartGUI.repaint();
    }
    
    public void backToMain()
    {
        this.cartGUI.setVisible(false);
        this.mainGUI.setVisible(true);
    }
    
    public void addToCart(Animal a)
    {
        this.cartModel.addToCart(a);
    }
    
    public Cart getModel()
    {
        return this.cartModel;
    }
    
}
