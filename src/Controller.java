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
    MainGUI mainGUI;
    CartGUI cartGUI;
    LoginGUI loginGUI;
    LoginModel loginModel;

    public Controller() {
        loginModel = new LoginModel(this);
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
    }
    
    public void backToMain()
    {
        this.cartGUI.setVisible(false);
        this.mainGUI.setVisible(true);
    }
    
}
