

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
