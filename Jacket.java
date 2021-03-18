/** Class for the Jacket
 *  Has all attributes for the Jacket
 *  Will be used in the Coat class
 * @author Katie Crowdle
 */

public class Jacket extends Coat {
    private static final String JACKET_NAME = "Jacket";
    private static final Double JACKET_UNITS = 2.0;
    private static final Fabric JACKET_FABRIC = new Tweed( );

    /** 
     * @param JACKET_NAME the name of the jacket.
     * @param JACKET_PURPOSE the purpose of a jacket.
     * @param JACKET_UNITS the amount of fabric units needed to make a jacket.
     * @param JACKET_FABRIC the type of fabric to make the Jacket.
     */

    public Jacket () {
        super ( JACKET_NAME, JACKET_UNITS, JACKET_FABRIC);

    }

}
