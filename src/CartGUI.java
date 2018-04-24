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
    
   
    private Controller controller;
    
    public CartGUI(Controller controller)
    {
        this.controller = controller;
        cartGUIComponents();
    }        
    
    public void cartGUIComponents()
    {
        messageField = new JTextField(100);
        checkoutMessageButton = new JButton("Czech Out");
        returnMessageButton = new JButton("Return to Shopping");
        
        cartPanel = new JPanel(new GridLayout(1,3));
        
        cartPanel.add(messageField);
        cartPanel.add(checkoutMessageButton);
        cartPanel.add(returnMessageButton);
        
        
        this.setTitle("Cart Message Option");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(cartPanel, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
