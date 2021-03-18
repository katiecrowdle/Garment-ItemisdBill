/** 
 * Class for the trousers
 * Gets attributes from specific trousers eg.jeans but has a default purpose.
 * @author Katie Crowdle
 */

public class Trousers extends Garment {
    private static String DEFAULT_PURPOSE = "Cover the legs";
    
    /**
     * @param DEFAULT_PURPOSE the purpose of the trousers
     */

    public Trousers ( final String name, final Double units, final Fabric fabric ) {
        super ( name, DEFAULT_PURPOSE, units, fabric);
    }
            
}


