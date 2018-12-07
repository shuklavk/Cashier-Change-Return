package changereturn.ui;
import javax.swing.*;
import java.awt.event.*;
import changereturn.logic.Logic;
/**
 * Provides direction for program to take when the "Calculate" button is pressed.
 * @author vikasshukla
 */
public class CalculateClicker implements ActionListener{
    private JTextField total;
    private JTextField given;
    private JTextField dollars;
    private JTextField quarters;
    private JTextField dimes;
    private JTextField nickels;
    private JTextField pennies;
    private JButton calculate;
    private Logic logic;
    
    // Initiliazes all text fields and buttons
    public CalculateClicker(JTextField total, JTextField given, JTextField dollars,
            JTextField quarters, JTextField dimes, JTextField nickels, JTextField pennies,
            JButton calculate){
        this.total = total;
        this.given = given;
        this.dollars = dollars;
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
        this.calculate = calculate; 
    }
    
    // Uses all logic function and sets text boxes to their correct change value
    public void actionPerformed(ActionEvent ae){
        double change = 100 * (Double.parseDouble(this.given.getText()) - Double.parseDouble(this.total.getText()));
        this.logic = new Logic(change);
        this.dollars.setText(Integer.toString(this.logic.numOfDollars()));
        this.quarters.setText(Integer.toString(this.logic.numOfQuarters()));
        this.dimes.setText(Integer.toString(this.logic.numOfDimes()));
        this.nickels.setText(Integer.toString(this.logic.numOfNickels()));
        this.pennies.setText(Integer.toString(this.logic.numOfPennies()));
    }
}
