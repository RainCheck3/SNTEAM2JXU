package com.sapient.client.cui;

public class Number {
	private int hundredsPlace;
	private int tensPlace;
	private int onesPlace;

	public Number(int inputNumber) {
		// TODO Auto-generated constructor stub
		int tempNumber = inputNumber;
		this.onesPlace = tempNumber % 10;
		tempNumber /= 10;
		this.tensPlace = tempNumber % 10;
		tempNumber /= 10;
		this.hundredsPlace = tempNumber % 10;
	}

	public int getHundredsPlace() {
		return hundredsPlace;
	}

	public int getTensPlace() {
		return tensPlace;
	}

	public int getOnesPlace() {
		return onesPlace;
	}

	/**
	 * 
	 * @return true if Data is valid
	 */
	public boolean checkDataIntegrity() {
		if (hundredsPlace > 9 || hundredsPlace < 0 || tensPlace > 9
				|| tensPlace < 0 || onesPlace > 9 || onesPlace < 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
