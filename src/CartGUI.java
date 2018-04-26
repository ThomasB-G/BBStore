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
    
    
    private JTable table;
    
    
   
    private Controller controller;
    
    public CartGUI(Controller controller)
    {
        this.controller = controller;
        this.table = new JTable(controller.getModel());
        this.table.getColumnModel().getColumn(0).setHeaderValue("Name");
        this.table.getColumnModel().getColumn(1).setHeaderValue("Price");
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        //top panel/page start
        label1 = new JLabel("Item(s)", SwingConstants.CENTER);
        label2 = new JLabel("Price", SwingConstants.CENTER);
        
        //label for the bottom panel
        totalLabel = new JLabel("Total Price in BitCoin:", SwingConstants.CENTER);
        
        //***************************************************
        totalPrice = new JTextField("");
        //***************************************************
        
        totalPrice.setHorizontalAlignment(SwingConstants.CENTER);
        totalPrice.setEditable(false);
        
        returnMessageButton = new JButton("Return to Shopping");
        returnMessageButton.addActionListener(event -> controller.backToMain());
        
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
        
        JScrollPane tablePane = new JScrollPane(table);
        tablePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        table.setFillsViewportHeight(true);
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
        //this.getContentPane().add(cartInfoPanel, BorderLayout.PAGE_START);
        this.getContentPane().add(tablePane, BorderLayout.CENTER);
        this.getContentPane().add(cartButtonPanel, BorderLayout.PAGE_END);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void putTotal(double total)
    {
        this.totalPrice.setText("$ " + total);
    }
 
    
    
}
