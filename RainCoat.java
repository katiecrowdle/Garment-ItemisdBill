/** Class for the Rain Coat
 *  Has all attributes for the rain coat
 *  Will be used in the Coat class
 * @author Katie Crowdle 
 */


public class RainCoat extends Coat {
    private static final String RAIN_NAME = "Rain Coat";
    private static final Double RAIN_UNITS = 2.5;
    private static final Fabric RAIN_FABRIC = new Acrylic( );

    /** 
     * @param RAIN_NAME the name of the raincoat
     * @param RAIN_PURPOSE the purpose of the rain coat
     * @param RAIN_UNITS the amount of fabric units needed to make a rain coat
     * @param RAIN_FABRIC the type of fabric to make the raincoat
     */
 
    public RainCoat ( ) {
        super ( RAIN_NAME, RAIN_UNITS, RAIN_FABRIC);

}



}
