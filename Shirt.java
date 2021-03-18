/** 
 * Class for each of the shirts
 * Gets attributes from specific shirts eg.tshirt
 * Has default purpose for all shirts.
 * @author Katie Crowdle 
 */
public class Shirt extends Garment {
    private static final String DEFAULT_PURPOSE = "Cover the body.";
   
    /** 
     * @param DEFAULT_PURPOSE the purpose of the shirt
     */

    public Shirt ( final String name, final Double units, final Fabric fabric ) {
        super( name, DEFAULT_PURPOSE, units, fabric);
	    
    } 

} 
