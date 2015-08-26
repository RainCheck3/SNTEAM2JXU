package mainpack;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;


class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You must be 18 or above to vote";
	}
}

class Vote {
	public void register(int age) throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to register for vote");
	}
}

class Base {
	public void test() throws SQLException, IOException{
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void test() throws EOFException{
		System.out.println("Derived");
	}
}

public class MainApp {

	public static void main(String[] args) {
		Base b = new Derived();
		try {
			b.test();
		} catch (IOException|SQLException e) {
			e.printStackTrace();
		} 
		
		
		// TODO Auto-generated method stub
		/*
		Vote vote = new Vote();
		try {
			vote.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");*/
	}

}
