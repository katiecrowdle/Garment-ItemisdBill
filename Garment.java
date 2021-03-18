/** 
 * Class for each of the Garments and there properties
 * It prints out the bill of each garment
 * @author Katie Crowdle
 */
public class Garment {
    private final String name;
    private final String purpose;
    private final Double units;
    private final Fabric fabric;
    /**
     * Instance of the class that gives you the name, purpose and bill of each garment
     * @param name the name of each garment
     * @param purpose the purpose of each of the garments
     * @param bill the cost of each garement to make
     */

    public Garment ( final String name, final String purpose,
		     final Double units, final Fabric fabric ) {
        this.name = name;
	this.purpose = purpose;
        this.units= units;	
        this.fabric = fabric;
    }

    /** Get the name of these instances
     * @return name
     * @return units
     * @return fabric
     */

    public String getName ( ) {
        return name;
    }

    public void printPurpose ( ) {
        System.out.println(name+ " "+ purpose );
    }

    public Double getUnits( ) {
        return units;
    }


    public void printItemisedBill ( ) {
        System.out.println("Itemised bill for "+ name);
	String info = "Made of "+ units + " units of " + fabric.getFabric();
        final Double environment_tax;	
	if (fabric instanceof Natural) {
            final Natural natural = (Natural)fabric;
	    info += " made of " + natural.getSource();
	    environment_tax = 0.0;
        } else {
	    final Synthetic synthetic = (Synthetic)fabric;
	    environment_tax = synthetic.getTax();

	}

        System.out.println(info);

        final Double tax = units*environment_tax;
        System.out.println(" environment tax: " + units + " * "
		          	+ environment_tax + " = " + tax);

        final Double fabric_price = fabric.getPrice();
        final Double base_price = units*fabric_price;
        System.out.println("      base price: " + units + " * " + fabric_price + " = " + base_price);
        
        final Double unit_cost = fabric_price +environment_tax;
	final Double grand_total = unit_cost*units;
        System.out.println("     grand total: " + units + " * " +unit_cost + " = " +	grand_total);


    }

} 
