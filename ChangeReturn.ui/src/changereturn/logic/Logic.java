package changereturn.logic;

/**
 * Logic to convert the total difference between money owed and money given
 * into the least amount of money necessary for change 
 * @author vikasshukla
 */
public class Logic {
    private double totalChange;         // Difference between money owed and money given in cents
    
    public Logic(double totalChange){
        this.totalChange = totalChange;
    }
    
    
    // Function finds the most number of dollars needed to give
    // Also, manipulates total change, subtracting the dollars
    public int numOfDollars(){
        int dollars       = (int) this.totalChange / 100;
        this.totalChange %= 100;
        return dollars;
    }
    
    // Similar to top function for quarters
    public int numOfQuarters(){
        int quarters      = (int) this.totalChange / 25;
        this.totalChange %= 25;
        return quarters;
    }
    
    
    // Function for dimes
    public int numOfDimes(){
        int dimes         = (int) this.totalChange / 10;
        this.totalChange %= 10;
        return dimes;
    }
    
    
    // Function for nickels 
    public int numOfNickels(){
        int nickels       = (int) this.totalChange / 5;
        this.totalChange %= 5;
        return nickels;
    }
    
    
    // After manipulating total change in each step, the remaing amount is number of pennies
    public int numOfPennies(){
        return (int)this.totalChange;
    }
    
}
