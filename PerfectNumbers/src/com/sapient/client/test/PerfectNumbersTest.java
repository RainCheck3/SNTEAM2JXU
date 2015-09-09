package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.cui.PerfectNumber;

public class PerfectNumbersTest {

	PerfectNumber perfectNumberObjRef;

	
	
	@Test
	public final void testPerfectNumberConstructor() {
		perfectNumberObjRef = new PerfectNumber(6);
		assertTrue(perfectNumberObjRef instanceof PerfectNumber);
	}

	@Test
	public final void testPerfectNumberGetterSetter() {
		perfectNumberObjRef = new PerfectNumber(6);
		assertEquals(6, perfectNumberObjRef.getNumber());

		perfectNumberObjRef.setNumber(10);
		assertEquals(10, perfectNumberObjRef.getNumber());
	}

	@Test
	public final void testPerfectNumberOne() {
		perfectNumberObjRef = new PerfectNumber(6);
		assertEquals(true, perfectNumberObjRef.isPerfectNumber());
	}

	@Test
	public final void testNotPerfectNumberOne() {
		perfectNumberObjRef = new PerfectNumber(8);
		assertEquals(false, perfectNumberObjRef.isPerfectNumber());
	}

	@Test
	public final void testPerfectNumberTwo() {
		perfectNumberObjRef = new PerfectNumber(28);
		assertEquals(true, perfectNumberObjRef.isPerfectNumber());
	}

	@Test
	public final void testNotPerfectNumberTwo() {
		perfectNumberObjRef = new PerfectNumber(24);
		assertEquals(false, perfectNumberObjRef.isPerfectNumber());
	}

}
