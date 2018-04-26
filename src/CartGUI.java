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
    
    private JTextArea addedAnimals;
    private JTextArea addedPrices;
    
    
   
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
        totalPrice = new JTextField("");
        //***************************************************
        
        totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
        totalPrice.setEditable(false);
        
        returnMessageButton = new JButton("Return to Shopping");
        returnMessageButton.addActionListener(event -> controller.mainGUI.setVisible(true));
        returnMessageButton.addActionListener(event -> controller.cartGUI.setVisible(false));
        
        checkoutMessageButton = new JButton("Check Out");
        checkoutMessageButton.addActionListener(event -> JOptionPane.showMessageDialog(new JFrame(), "Thanks for the monies! "
                + "Your new animal will NEVER arrive! :D"));
        
        
        cartButtonPanel = new JPanel(new GridLayout(2,2));
        cartInfoPanel = new JPanel(new GridLayout(1,2));
        cartContentPanel = new JPanel(new GridLayout(1,2));
        cartTotalPanel = new JPanel(new GridLayout(1,2));
        
        
        //cart info panel - top of page. labels contents (Item, price)
        cartInfoPanel.add(label1);
        cartInfoPanel.add(label2);
        
        
        addedAnimals = new JTextArea(10, 30);
        addedAnimals.setEditable(false);
        addedPrices = new JTextArea(10, 30);
        addedPrices.setText("Test price");
        addedPrices.setEditable(false);
        cartContentPanel.add(addedAnimals);
        cartContentPanel.add(addedPrices);
        
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
        this.getContentPane().add(cartButtonPanel, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public void addAnimalName(String name)
    {
        addedAnimals.append(name + "\n");
    }
}
