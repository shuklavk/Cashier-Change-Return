package changereturn.ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Creates the user interface for the program. Consists of two text fields that 
 * can be manipulated by the user: money owed and the money given. After pressing
 * the calculate button, it displays amount of dollars and coins needed to return
 * to the customer.
 * @author vikasshukla
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    
    public void run(){
        this.frame = new JFrame("Change Return");                          // Creates the frame with title
        this.frame.setPreferredSize(new Dimension (300, 200));             // Sets the dimensions of frame
        
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Ensures program closes correctly 
        createComponents(this.frame.getContentPane());                     // Creates all labels, text fields, and buttons
        
        this.frame.pack();                                                 // Makes everything fit well
        this.frame.setVisible(true);
    }
    
    
    // Where all the components are created, and placements are made with coordinate
    // system. Uses Spring Layout.
    public void createComponents(Container container){
        SpringLayout layout = new SpringLayout();   
        container.setLayout(layout);
        
        // Money Owed Label
        JLabel moneyOwed = new JLabel("Money Owed ($): ");
        container.add(moneyOwed);
        layout.putConstraint(SpringLayout.NORTH, moneyOwed, 10, SpringLayout.NORTH, container);
        layout.putConstraint(SpringLayout.WEST, moneyOwed, 10, SpringLayout.WEST, container);
        
        // Money Owed Text Box
        JTextField moneyOwedValue = new JTextField("Enter money here...");
        container.add(moneyOwedValue);
        layout.putConstraint(SpringLayout.NORTH, moneyOwedValue, 6, SpringLayout.NORTH, container);
        layout.putConstraint(SpringLayout.WEST, moneyOwedValue, 5, SpringLayout.EAST, moneyOwed);
        layout.putConstraint(SpringLayout.EAST, moneyOwedValue, -5, SpringLayout.EAST, container);
        
        // Money given label
        JLabel moneyGiven = new JLabel("Money Given ($): ");
        container.add(moneyGiven);
        layout.putConstraint(SpringLayout.NORTH, moneyGiven, 15, SpringLayout.SOUTH, moneyOwed);
        layout.putConstraint(SpringLayout.WEST, moneyGiven, 9, SpringLayout.WEST, container);
        
        // Money given text box
        JTextField moneyGivenValue = new JTextField("Enter money here...");
        container.add(moneyGivenValue);
        layout.putConstraint(SpringLayout.NORTH, moneyGivenValue, 4, SpringLayout.SOUTH, moneyOwedValue);
        layout.putConstraint(SpringLayout.WEST, moneyGivenValue, 6, SpringLayout.EAST, moneyGiven);
        layout.putConstraint(SpringLayout.EAST, moneyGivenValue, -5, SpringLayout.EAST, container);
        
        // Dollars need returning label
        JLabel dollars = new JLabel("Dollars:");
        container.add(dollars);
        layout.putConstraint(SpringLayout.NORTH, dollars, 10, SpringLayout.SOUTH, moneyGivenValue);
        layout.putConstraint(SpringLayout.WEST, dollars, 8, SpringLayout.WEST, container);
        
        // Dollars need returning text box
        JTextField dollarsValue = new JTextField("0");
        container.add(dollarsValue);
        dollarsValue.setEnabled(false);
        layout.putConstraint(SpringLayout.NORTH, dollarsValue, 6, SpringLayout.SOUTH, moneyGivenValue);
        layout.putConstraint(SpringLayout.WEST, dollarsValue, 3, SpringLayout.EAST, dollars);
        
        // Quarters need returning label
        JLabel quarters = new JLabel("Quarters:");
        container.add(quarters);
        layout.putConstraint(SpringLayout.NORTH, quarters, 10, SpringLayout.SOUTH, moneyGivenValue);
        layout.putConstraint(SpringLayout.WEST, quarters, 92, SpringLayout.EAST, dollars);
        layout.putConstraint(SpringLayout.EAST, dollarsValue, -8, SpringLayout.WEST, quarters);
        
        // Quarters need returning text box
        JTextField quartersValue = new JTextField("0");
        container.add(quartersValue);
        quartersValue.setEnabled(false);
        layout.putConstraint(SpringLayout.NORTH, quartersValue, 6, SpringLayout.SOUTH, moneyGivenValue);
        layout.putConstraint(SpringLayout.WEST, quartersValue, 3, SpringLayout.EAST, quarters);
        layout.putConstraint(SpringLayout.EAST, quartersValue, -5, SpringLayout.EAST, container);
        
        // Dimes need returning label
        JLabel dimes = new JLabel("Dimes:");
        container.add(dimes);
        layout.putConstraint(SpringLayout.NORTH, dimes, 10, SpringLayout.SOUTH, dollars);
        layout.putConstraint(SpringLayout.WEST, dimes, 8, SpringLayout.WEST, container);
        
        // Dimes need returning text box
        JTextField dimesValue = new JTextField("0");
        container.add(dimesValue);
        dimesValue.setEnabled(false);
        layout.putConstraint(SpringLayout.NORTH, dimesValue, 5, SpringLayout.SOUTH, dollars);
        layout.putConstraint(SpringLayout.WEST, dimesValue, 8, SpringLayout.EAST, dimes);
        
        // Nickels need returning label
        JLabel nickels = new JLabel("Nickels:");
        container.add(nickels);
        layout.putConstraint(SpringLayout.NORTH, nickels, 10, SpringLayout.SOUTH, dollars);
        layout.putConstraint(SpringLayout.WEST, nickels, 150, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.EAST, dimesValue, -9, SpringLayout.WEST, nickels);
        
        // Nickels need returning text box
        JTextField nickelsValue = new JTextField("0");
        container.add(nickelsValue);
        nickelsValue.setEnabled(false);
        layout.putConstraint(SpringLayout.NORTH, nickelsValue, 5, SpringLayout.SOUTH, dollars);
        layout.putConstraint(SpringLayout.WEST, nickelsValue, 8, SpringLayout.EAST, nickels);
        layout.putConstraint(SpringLayout.EAST, nickelsValue, -5, SpringLayout.EAST, container);
        
        // Pennies need returning label
        JLabel pennies = new JLabel("Pennies:");
        container.add(pennies);
        layout.putConstraint(SpringLayout.NORTH, pennies, 10, SpringLayout.SOUTH, nickels);
        layout.putConstraint(SpringLayout.WEST, pennies, 8, SpringLayout.WEST, container);
        
        // Pennies need returning text box
        JTextField penniesValue = new JTextField("0");
        container.add(penniesValue);
        penniesValue.setEnabled(false);
        layout.putConstraint(SpringLayout.NORTH, penniesValue, 5, SpringLayout.SOUTH, nickels);
        layout.putConstraint(SpringLayout.WEST, penniesValue, 1, SpringLayout.EAST, pennies);
        
        // Calculate button
        JButton calculate = new JButton("Calculate change");
        container.add(calculate);
        layout.putConstraint(SpringLayout.NORTH, calculate, 5, SpringLayout.SOUTH, nickels);
        layout.putConstraint(SpringLayout.WEST, calculate, 142, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.EAST, calculate, -3, SpringLayout.EAST, container);
        layout.putConstraint(SpringLayout.EAST, penniesValue, -1, SpringLayout.WEST, calculate);
        
        // Initializes function to the calculate button
        CalculateClicker clicker = new CalculateClicker(moneyOwedValue, moneyGivenValue, dollarsValue,
        quartersValue, dimesValue, nickelsValue, penniesValue, calculate);
        
        calculate.addActionListener(clicker);
    }
    
    public JFrame getJFrame(){
        return this.frame;
    }
    
}
