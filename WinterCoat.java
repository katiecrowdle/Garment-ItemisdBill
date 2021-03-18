/** Class for the winter Coats
 * Has all attributes for the Winter coat
 * Will be used in the Coat class
 * @author Katie Crowdle
 */

public class WinterCoat extends Coat {
    private static final String WINTER_NAME = "Winter Coat";
    private static final Double WINTER_UNITS = 2.5;
    private static final Fabric WINTER_FABRIC = new Polyester( );

    /** 
     */

    public WinterCoat ( ) {
        super ( WINTER_NAME, WINTER_UNITS, WINTER_FABRIC);
    }


} 
