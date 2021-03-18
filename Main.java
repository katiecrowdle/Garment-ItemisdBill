/** 
 * Main class for creating objects etc
 * @author Katie Crowdle 
 */

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main( final String[] args ) { 
        final List<Garment> items = new ArrayList<Garment>( );
	items.add( new Jeans( ));
	items.add( new WinterCoat());
	items.add( new Tshirt());
	items.add( new RainCoat());
        items.add( new Jacket());

	for (Garment item : items) {
            item.printPurpose( );
	}

        System.out.println( );

	for (Garment item : items) {
            item.printItemisedBill( );
        }
    }
}
