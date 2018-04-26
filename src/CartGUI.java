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
import javax.swing.JOptionPane;

public class CartGUI extends JFrame{
    private JButton checkoutMessageButton;//page end panel
    private JButton returnMessageButton;//page end panel
    
    private JPanel cartButtonPanel;//page end/bottom panel
    private JPanel cartInfoPanel;//page start/top panel
    private JPanel cartContentPanel;//center panel
    private JPanel cartTotalPanel;//page end/bottom panel
    
    private JLabel label1;//page start labeling item
    private JLabel label2;//page start labeling price
    
    private JLabel totalLabel;//page end labeling total price
    private JTextField totalPrice;//page end displaying total price
    
    private JLabel animalnamehere; //cartContentPanel
    private JLabel animalpricehere; //cartContentPanel
    
   
    private Controller controller;
    
    public CartGUI(Controller controller)
    {
        this.controller = controller;
        cartGUIComponents();
    }        
    
    public void cartGUIComponents()
    {
        //top panel/page start
        label1 = new JLabel("Item(s)", SwingConstants.CENTER);
        label2 = new JLabel("Price", SwingConstants.CENTER);
        
        //label for the bottom panel
        totalLabel = new JLabel("Total:", SwingConstants.CENTER);
        
        //***************************************************
        totalPrice = new JTextField("$" + " your data here");//area for sum of prices to be placed
        //***************************************************
        
        totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
        totalPrice.setEditable(false);
        animalnamehere = new JLabel("animal name placeholder", SwingConstants.CENTER);//testing use
        animalpricehere = new JLabel("price placeholder", SwingConstants.CENTER);//testing use
        
        returnMessageButton = new JButton("Return to Shopping");
        returnMessageButton.addActionListener(event -> controller.mainGUI.setVisible(true));
        returnMessageButton.addActionListener(event -> controller.cartGUI.setVisible(false));
        
        checkoutMessageButton = new JButton("Check Out");
        checkoutMessageButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Thanks for the monies! "
                + "Your new animal will NEVER arrive! :D"));
        
        
        cartButtonPanel = new JPanel(new GridLayout(2,2));
        cartInfoPanel = new JPanel(new GridLayout(1,2));
        cartContentPanel = new JPanel(new GridLayout(0,2));
        cartTotalPanel = new JPanel(new GridLayout(1,2));
        
        
        //cart info panel - top of page. labels contents (Item, price)
        cartInfoPanel.add(label1);
        cartInfoPanel.add(label2);
        
        
        //cart content panel - should basically be centered between
        //top panel(info) and bottom panel(buttons)
        cartContentPanel.add(animalnamehere);
        cartContentPanel.add(animalpricehere);
        
        
        //cart total panel - should be at the bottom but right above buttons
        //cartTotalPanel.add(totalLabel);
        
        
        //cart button panel - bottom most panel
        /*test*/cartButtonPanel.add(totalLabel);
        /*test*/cartButtonPanel.add(totalPrice);
        cartButtonPanel.add(returnMessageButton);
        cartButtonPanel.add(checkoutMessageButton);
                
        
        
        this.setTitle("Your shopping cart");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(cartInfoPanel, BorderLayout.PAGE_START);
        this.getContentPane().add(cartContentPanel, BorderLayout.CENTER);
        //this.getContentPane().add(cartTotalPanel, BorderLayout.CENTER);
        this.getContentPane().add(cartButtonPanel, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
