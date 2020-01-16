
import javax.swing.JOptionPane;



/**
 *
 * @author Shaf
 */
public class Person {
    double budget;
    int noOfItems;
    
    Dress[] drs;
    
    public Person (double budget, int maxItems) {
        this.budget = budget;
        drs = new Dress[ maxItems ];
        this.noOfItems = 0;    
}
    public void addItem (Dress d) {
        drs[noOfItems] = d;
        this.noOfItems++;
    }
    
    public void showDetails(){
        double totalPrice = 0;
        String msg;
        msg = "---------Details of the Person is as follows---------" + 
                "\n Budget for this prson : "+ this.budget + 
                "\n No of Dress : " + this.noOfItems + "\n";
        
        for(int i=0; i < noOfItems; i++){
            
            msg = msg + "Item No " + (i + 1) + ":\n";
            msg = msg + drs[i].getDetails();     
            
            totalPrice = totalPrice + drs[i].getPrice();
            
        }
        
        if(totalPrice > this.budget){
            msg = msg + "This is OVER budgeted person";
        }
        else if(totalPrice < this.budget){
            msg = msg + "This is LOW budgeted person";
        }
        else{
            msg = msg + "This is a BALANCE budgeted person";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
    } 
}
