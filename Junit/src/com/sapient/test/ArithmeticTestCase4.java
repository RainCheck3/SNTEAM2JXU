package com.sapient.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.math.Arithmetic;

public class ArithmeticTestCase4 {
	int firstNumber, secondNumber;

	@Before
	public void setup() {
		// TODO Auto-generated method stub
		firstNumber = 2;
		secondNumber = 4;
	}

	@Test
	public final void test() {
		int expectedResult = 6;
		Arithmetic arithmeticObjectRef = new Arithmetic();
		int actualResult = arithmeticObjectRef.sum(firstNumber, secondNumber);
		assertEquals(expectedResult, actualResult);
	}

	@After
	public void teardown() {
		// TODO Auto-generated method stub
		firstNumber = 0;
		secondNumber = 0;
	}

}
