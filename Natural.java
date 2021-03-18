/** Class for the Natural fabrics eg.cotton and tweed
 * Attributes will be taken from the specific fabric eg.cotton
 * Has a default type for its materials
 * Will be used in the fabric class
 * @author Katie Crowdle
 */

public class Natural extends Fabric {
    private final String source;

    /** 
     * @param DEFAULT_TYPE what type of fabric it is eg. Natural.
     */
    
    public Natural ( final String fabric, 
		     final Double price, 
		     final String source) {
        super( fabric, price);
	this.source = source;
    }

    public String getSource( ) {
        return source;
    }

 
 

}
