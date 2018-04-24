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

    public Controller() {
        mainGUI = new MainGUI(this);
       // cartGUI = new CartGUI();
        loginGUI = new LoginGUI(this);
        //loginGui.setVisible(true);
    }
    
    
}
