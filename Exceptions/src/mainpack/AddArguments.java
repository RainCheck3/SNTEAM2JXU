package mainpack;

public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println(sum);
	}

}
