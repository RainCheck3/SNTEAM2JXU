package com.sapient.client.cui;

import java.lang.Math;

/**
 * Sets number based on input and checks if it is a perfect number. A perfect
 * number is a positive integer that is equal to the sum of its proper divisors
 * excluding itself
 * 
 * @author jxu1, sku266
 *
 */
public class PerfectNumber {
	// Number to be checked
	private int number;

	public PerfectNumber(int inputNumber) {
		this.number = inputNumber;
	}

	// Getter
	public int getNumber() {
		return number;
	}

	// Setter
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * 
	 * @return true if this.number is perfect number, false otherwise
	 */
	public boolean isPerfectNumber() {
		int currentSumOfDivisors = 0;
		double numberAsDouble = this.number;
		
		// Loop through divisors
		for (int divisor = 1; divisor <= Math.sqrt(numberAsDouble); divisor++) {
			// Divisor found
			if (this.number % divisor == 0) {
				currentSumOfDivisors += divisor + (this.number / divisor);
			}
		}
		// Remove extra addition
		currentSumOfDivisors -= this.number;
		
		//Check if perfect number
		if (currentSumOfDivisors == this.number) {
			return true;
		} else {
			return false;
		}

	}
}
