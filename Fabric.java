/**
 * Class for each of the Fabrics
 * Fabric can be Natural or Synthetic
 * This class gets the attributes of the fabric 
 * It returns the fabric, type, price and source
 * @author Katie Crowdle
 */
 
public class Fabric {
    private final String fabric;
    private final Double price;

	
    /** Parameter for the Fabrics, its name, type and price
     * @param fabric the name of each fabric eg. cotton
     * @param type the type of the fabric eg. natural or synthetic
     * @param price the price of the fabric per unit
     * @param source if the material is natural it will 
     *               have a source, else None 
     */

    public Fabric ( final String fabric,  final Double price) {
        this.fabric = fabric;
	this.price = price;
    }


    public String getFabric ( ) {
	return fabric;
    }

    
    public Double getPrice ( ) {
        return price;

    }	

   
}
