package com.sapient.money;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoneyTest {

	Money money;

	@Before
	public void setup() {
		// TODO Auto-generated method stub
		money = new Money(100, "Rupees");
	}

	@Test
	public final void testConstructor() {
		assertTrue(money instanceof Money);
	}

	@Test
	public final void testAmount() {
		assertEquals(100, money.amount());
	}

	@Test
	public final void testCurrency() {
		assertEquals("Rupees", money.currency());
	}

	@Test
	public final void testAdd() {
		Money money = new Money(100, "Rupees");
		Money toAdd = new Money(50, "Dollars");

		money = money.add(toAdd);
		assertEquals(150, money.amount());
		assertEquals("Rupees", money.currency());
	}

	@Test(expected=NullPointerException.class)
	public final void testNull() {
		money.add(null);
	}

}
