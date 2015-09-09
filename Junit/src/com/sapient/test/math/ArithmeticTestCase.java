package com.sapient.test.math;

import com.sapient.math.Arithmetic;

import junit.framework.TestCase;

public class ArithmeticTestCase extends TestCase {
	int firstNumber, secondNumber;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		firstNumber = 2;
		secondNumber = 4;
	}

	public final void testSum() {
		int expectedResult = 6;
		Arithmetic arithmeticObjectRef = new Arithmetic();
		int actualResult = arithmeticObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		firstNumber = 0;
		secondNumber = 0;
	}

}
