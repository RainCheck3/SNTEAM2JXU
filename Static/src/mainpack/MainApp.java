package mainpack;

class Data {
	static int value; // Field //Class scope //Class variable
	static {
		System.out.println("Static");
		value = 88;
	}
}

class Base {
	public static void test() {
		System.out.println("Test in Base");
	}
}

class Derived extends Base {
	public static void test() {
		System.out.println("Test in Derived");
	}
}

public class MainApp {
	public static void main(String[] args) {
		Derived.test();
		Base.test();
		
		
		
		// Data.value = 3;
		// System.out.println(Data.value);
		try {
			Class.forName("mainpack.Data");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
