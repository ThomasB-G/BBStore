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
    private JButton submitMessageButton;
    private JButton cancelMessageButton;
    
    private CartGUI model;
    
    CartGUI(CartGUI model)
    {
        this.model = model;
        
        messageField = new JTextField(100);
        submitMessageButton = new JButton("Finish!");
        cancelMessageButton = new JButton("Cancel");
        
        JPanel content = new JPanel();
        content.add(messageField);
        content.add(submitMessageButton);
        content.add(cancelMessageButton);
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Cart Message Option");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String getMessageInput()
    {
        return messageField.getText();
    }
    
    public void addMessageButtonListener(ActionListener al)
    {
        submitMessageButton.addActionListener(al);
    }
    
    public void cancelMessageButtonListener(ActionListener al)
    {
        cancelMessageButton.addActionListener(al);
    }
    
    
    public static void cartMessage(String [] args)
    {
        int n = -1;
        while (n < 0)
                {
                    String input = JOptionPane.showInputDialog("Would you like "
                            + "to attach a message to your order?");
                    if (input.length() > 0)
                    {
                        n++;
                        System.out.println("Thank you! Your note has been"
                                + " attached!");
                    }
                    else
                    {
                        System.out.println("Enter a message! (WIP)");
                    }
                }
    }
    
}
