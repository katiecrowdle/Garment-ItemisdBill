/** Class for the synthetic fabric acrylic
 *  All attributes have been assigned 
 *  Will be used in the Synthetic class
 *@author Katie Crowdle
 */


public class Acrylic extends Synthetic {
    private static final String FABRIC_NAME = "Acrylic";
    private static final Double FABRIC_PRICE = 6.0;

    /**
     * @param FABRIC_NAME the name of the fabric is Acrylic
     * @param FABRIC_TYPE the type of this fabric is Synthetic
     * @param FABRIC_PRICE the price of this fabric per unit
     * @param FABRIC_SOURCE the source of this fabric is None
     */

    public Acrylic ( ) {
        super (FABRIC_NAME, FABRIC_PRICE);
    }


} 
