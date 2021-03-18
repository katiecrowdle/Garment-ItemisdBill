/** Class for the material Cotton
 * All attributes for cotton has been assigned
 * Will be used in the Natural class as its type is Natural
 * @author Katie Crowdle
 */

public class Cotton extends Natural {
    private static final String FABRIC_NAME = "Cotton";
    private static final Double FABRIC_PRICE = 2.0; 
    private static final String FABRIC_SOURCE = "Gossypium";

    /** 
     * @param FABRIC_NAME the name of the material is cotton
     * @param FABRIC_TYPE the type of the material eg. Natural 
     * @param FABRIC_PRICE the price of cotton per unit
     * @param FABRIC_SOURCE the source of the material
     */ 
    public Cotton ( ) {
	    super( FABRIC_NAME, FABRIC_PRICE, FABRIC_SOURCE);


    }


}
