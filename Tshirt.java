/** Class for the tshirts
 * Has all attributes for the tshirt
 * Will be used in Shirt class 
 * @author Katie Crowdle
 */

public class Tshirt extends Shirt {
    private static final String TSHIRT_NAME = "T-shirt";
    private static final Double TSHIRT_UNITS =1.5;
    private static final Fabric TSHIRT_FABRIC = new Cotton( );

    /** Making new tshirt
     */

    public Tshirt( ) {
        super ( TSHIRT_NAME, TSHIRT_UNITS, TSHIRT_FABRIC);
    }

}
