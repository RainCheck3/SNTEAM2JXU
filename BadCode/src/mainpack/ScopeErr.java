package mainpack;

//This program will not compile
/**
 * 
 * @author jxu1
 *
 */
class ScopeErr {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int foo = 1;
		{ // creates a new scope
			int bar = 2; // Compile time error -- bar already defined!
		}
	}
}