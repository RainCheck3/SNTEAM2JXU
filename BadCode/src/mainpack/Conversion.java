package mainpack;

//Demonstrate casts.
/**
 * 
 * @author jxu1
 *
 */
class Conversion {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		byte byteValue;
		int integerValue = 257;
		double doubleValue = 323.142;

		System.out.println("\nConversion of int to byte.");
		byteValue = (byte) integerValue;
		System.out.println("int and byte " + integerValue + " " + byteValue);

		System.out.println("\nConversion of double to int.");
		integerValue = (int) doubleValue;
		System.out.println("double and int " + doubleValue + " " + integerValue);

		System.out.println("\nConversion of double to byte.");
		byteValue = (byte) doubleValue;
		System.out.println("double and byte " + doubleValue + " " + byteValue);
	}
}
