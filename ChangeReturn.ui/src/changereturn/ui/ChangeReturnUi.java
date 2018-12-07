package changereturn.ui;
import javax.swing.SwingUtilities;

/**
 * This program is a change program, perfect for cashiers. Just input the cost of a purchase
 * and input how much money was given by the customer and get instant results in how to give change
 * in the smallest quantity of dollars and coins. 
 * @author vikasshukla
 */
public class ChangeReturnUi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new UserInterface());
    }
    
}
