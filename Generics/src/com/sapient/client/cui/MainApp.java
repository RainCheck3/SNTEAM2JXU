package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Data {
	private int value;

	public Data(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Data other = (Data) obj;
		return (other.getValue() == value);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value;
	}
}

public class MainApp {

	public static void main(String[] args) {
		HashMap<Integer, Data> result = new HashMap<Integer, Data>();

		result.put(3, new Data(12));
		result.put(5, new Data(23));
		result.put(3, new Data(34));
		result.put(8, new Data(56));

		Set<Integer> keys = result.keySet();

		for (Integer key : keys) {
			System.out.print(key + " : ");
			System.out.println(result.get(key));
		}
		

		// TODO Auto-generated method stub
		/*
		 * Data<Integer> d = new Data<Integer>(); d.setValue(new Integer(48));
		 * System.out.println(d.getValue());
		 */

		// List<String> list = new ArrayList<String>();
		/*
		 * Set<Data> result = new HashSet<Data>();
		 * 
		 * result.add(new Data(4)); result.add(new Data(3)); result.add(new
		 * Data(2)); result.add(new Data(4)); result.add(new Data(6));
		 * 
		 * Iterator<Data> iterator = result.iterator();
		 * 
		 * Data name; while (iterator.hasNext()) { name = iterator.next();
		 * System.out.println(name); }
		 */
		// for (String name : list) {
		// System.out.println(name);
		// }

	}

}
