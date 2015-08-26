package mainpack;

enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

	private int price; // price of each apple

	// Constructor
	Apple(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap;

		// display price of Winesap.
		System.out.println("Winesap costs " + Apple.Winesap.getPrice()
				+ " cents.\n");

		// Display all apples and prices
		System.out.println("All apples prices:");
		for (Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");

		/*
		 * Apple ap;
		 * 
		 * System.out.println("Here are all Apple constants");
		 * 
		 * // use values() Apple allapples[] = Apple.values(); for (Apple a :
		 * allapples) { System.out.println(a); } System.out.println();
		 * 
		 * // use valueOf() ap = Apple.valueOf("Winesap");
		 * System.out.println("ap contains " + ap);
		 */
	}

}
