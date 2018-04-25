/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class CartGUI extends JFrame{
    private JTextField messageField;
    private JButton checkoutMessageButton;
    private JButton returnMessageButton;
    private JPanel cartPanel;
    private JLabel label1;
    private JLabel label2;
    
   
    private Controller controller;
    
    public CartGUI(Controller controller)
    {
        this.controller = controller;
        cartGUIComponents();
    }        
    
    public void cartGUIComponents()
    {
        label1 = new JLabel("Item(s)");
        label2 = new JLabel("Price");
        
        returnMessageButton = new JButton("Return to Shopping");
        //return shopping button^
        
        checkoutMessageButton = new JButton("Czech Out");
        //want to make this when pressed pop up a JOptionpane to say:
        //"Thanks for the monies! Your new animal will NEVER arrive! :D"
        
        cartPanel = new JPanel(new GridLayout(0,2));
        
        cartPanel.add(label1);
        cartPanel.add(label2);
        cartPanel.add(returnMessageButton);
        cartPanel.add(checkoutMessageButton);
        
        
        
        this.setTitle("Your shopping cart");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(cartPanel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
