

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
