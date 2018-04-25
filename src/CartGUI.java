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
    private JPanel cartButtonPanel;
    private JPanel cartInfoPanel;
    private JPanel cartContentPanel;
    private JPanel cartTotalPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel totalLabel;
    
    private JLabel example;
    
   
    private Controller controller;
    
    public CartGUI(Controller controller)
    {
        this.controller = controller;
        cartGUIComponents();
    }        
    
    public void cartGUIComponents()
    {
        label1 = new JLabel("Item(s)", SwingConstants.CENTER);
        label2 = new JLabel("Price", SwingConstants.CENTER);
        totalLabel = new JLabel("Total:", SwingConstants.CENTER);
        
        example = new JLabel("placeholder", SwingConstants.CENTER);
        
        returnMessageButton = new JButton("Return to Shopping");
        //return shopping button^
        
        checkoutMessageButton = new JButton("Czech Out");
        //want to make this when pressed pop up a JOptionpane to say:
        //"Thanks for the monies! Your new animal will NEVER arrive! :D"
        
        cartButtonPanel = new JPanel(new GridLayout(1,2));
        cartInfoPanel = new JPanel(new GridLayout(1,2));
        cartContentPanel = new JPanel(new GridLayout(0,2));
        cartTotalPanel = new JPanel(new GridLayout(1,2));
        
        cartInfoPanel.add(label1);
        cartInfoPanel.add(label2);
        
        cartContentPanel.add(example);
        
        cartTotalPanel.add(totalLabel);
        
        cartButtonPanel.add(returnMessageButton);
        cartButtonPanel.add(checkoutMessageButton);
        
        
        
        this.setTitle("Your shopping cart");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(cartInfoPanel, BorderLayout.NORTH);
        this.getContentPane().add(cartContentPanel, BorderLayout.CENTER);
        this.getContentPane().add(cartTotalPanel, BorderLayout.CENTER);
        this.getContentPane().add(cartButtonPanel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
