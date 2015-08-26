package mainpack;

import java.util.logging.*;

//Demonstrate lifetime of a variable.
/**
 * 
 * @author jxu1
 *
 */
public class LifeTime {
	
	private static final Logger log = Logger.getLogger(LifeTime.class.getName());
	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		int counter;
		
		for (counter = 0; counter < 3; counter++) {
			int newlyInitialized = -1; // y is initialized each time block is entered
			//System.out.println("y iz: " + newlyInitialized); // this always prints -1
			log.fine("y is : ");
			newlyInitialized = 100;
			System.out.println("y is now: " + newlyInitialized);
		}
	}
}