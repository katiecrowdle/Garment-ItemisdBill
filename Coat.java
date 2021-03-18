/**
 *  Class for each of the Coats
 *  Attributes will be taken from more specific coats eg.taincoat
 *  Has a default purpose for all coats.
 *  @author Katie Crowdle
 */
public class Coat extends Garment {
    private static String DEFAULT_PURPOSE = "Provide extra protection against the elements";


    /** 
     * @param DEFAULT_PURPOSE the purpose of the coats..
     */

    public Coat ( final String name, final Double units, final Fabric fabric ) {
        super( name, DEFAULT_PURPOSE, units, fabric);   
        
    }
	 
}
