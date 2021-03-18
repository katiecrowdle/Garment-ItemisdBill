/** 
 * Class for the jeans has all the attributes for jeans
 *  Will be used in the Trousers class
 * @author Katie Crowdle
 */

public class Jeans extends Trousers {
    private static final String JEANS_NAME = "Jeans";
    private static final Double JEANS_UNITS = 2.0;
    private static final Fabric JEANS_FABRIC = new Cotton( );
   
    
    /** @param JEANS_NAME the name of the jeans is jeans
     * @param JEANS_UNITS the amount of units of fabric needed to make jeans.
     * @param JEANS_FABRIC the fabric that jeans are made of.
     */

    public Jeans ( ) {
        super (JEANS_NAME, JEANS_UNITS, JEANS_FABRIC);
    }


}
