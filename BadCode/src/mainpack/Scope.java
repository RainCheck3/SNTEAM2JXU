package mainpack;

//Demonstrate block scope.
class Scope {
	public static void main(String[] args) {
		int field; // known to all code within main

		field = 10;
		if (field == 10) { // start new scope
			int local = 20; // known only to this block

			// field and local both known here.
			System.out.println("field and local: " + field + " " + local);
			field = local * 2;
		}
		// local = 100; // Error! local not known here

		// field is still known here.
		System.out.println("field is " + field);
	}
}