/** Class for the Synthetic fabrics eg.polyester and acrylic
 * Will get attributes from Synthetic materials eg.polyester
 * Has a defualt type set to Synthetic
 * Will be used in the Fabric class 
 * @author Katie Crowdle
 */

public class Synthetic extends Fabric {
    private static final Double TAX = 2.0;
    
    /**
     * @param DEFAULT_TYPE is the type of fabric eg. Natural or Synthetic
     */

    public Synthetic (final String fabric,
		      final Double SYNTHETIC_PRICE ) {
	super( fabric, SYNTHETIC_PRICE);

    }
    
    public Double getTax() {
        return TAX;
    }


}
