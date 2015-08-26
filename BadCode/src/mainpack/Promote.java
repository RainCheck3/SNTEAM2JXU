package mainpack;

/**
 * 
 * @author jxu1
 *
 */
class Promote {
	/**
	 * S
	 * @param args
	 */
	public static void main(String[] args) {
		byte byteValue = 42;
		char charValue = 'a';
		short shortValue = 1024;
		int intValue = 50000;
		float floatValue = 5.67f;
		double doubleValue = .1234;
		double result = (floatValue * byteValue) + (intValue / charValue)
				- (doubleValue * shortValue);
		System.out.println((floatValue * byteValue) + " + " + (intValue / charValue) 
				+ " - " + (doubleValue * shortValue));
		System.out.println("result = " + result);
	}
}