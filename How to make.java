
/**
 *
 * @author Shaf
 */
public class Dress {
    private double price;
    
    public String getDetails() {
        return "Price of this dress : " + this.price; 
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    
    
    
    
}




/**
 *
 * @author Shaf
 */
public class Shirt extends Dress{
    String size;  
    
    @Override
    public String getDetails() {
        return "This is a shirt and size : " + this.size + "\n" +
                super.getDetails() + "\n"; 
    }
    
}




/**
 *
 * @author Shaf
 */
public class Trouser extends Dress {
    String length;
    
    @Override
    public String getDetails() {
        return "This is a trouser and length : " + this.length + "\n" +
        super.getDetails();
    }
}


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
                "\n No of Dress : " + this.noOfItems;
        
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
        
        JOptionPane.showInternalMessageDialog(null, msg);
        
    } 
}




//Button
double budget = Double.parseDouble(jTextField1.getText());
        int noOfDresses = Integer.parseInt(jTextField2.getText());
        Person p = new Person(budget,noOfDresses);
		
		
		
		// CREATE METHOD TO FILL THE COMBO BOX 2
		
		public void comboBox2FillItems() {
        
    }
    
		
		



