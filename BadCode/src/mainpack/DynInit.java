package mainpack;

//Demonstrate dynamic initialization.
class DynInit {
	public static void main(String[] args) {
		double side1 = 3.0;
		double side2 = 4.0;

		// c is dynamically initialized
		double side3 = Math.sqrt(side1 * side1 + side2 * side2);

		System.out.println("Hypotenuse is " + side3);
	}
}