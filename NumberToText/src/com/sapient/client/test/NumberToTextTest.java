package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Result;

import com.sapient.client.cui.DisplayNumberInText;

public class NumberToTextTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public final void testConstructorNumbers() {
		DisplayNumberInText objectDNIT = new DisplayNumberInText(532123);
		objectDNIT.setNumberClasses();
		assertEquals(1, objectDNIT.getNumberHundreds().getHundredsPlace());
		assertEquals(5, objectDNIT.getNumberThousands().getHundredsPlace());
	
	}
	
	@Test
	public final void testNumberParseHundred() {
		DisplayNumberInText objectDNIT = new DisplayNumberInText(532123);
		objectDNIT.setNumberClasses();
		
		objectDNIT.convertNumberToText(objectDNIT.getNumberHundreds());
		assertEquals("one hundred", objectDNIT.getObjectNumberToText().parseHundreds());
		
	}
	
	@Test
	public final void testNumberParseTens() {
		DisplayNumberInText objectDNIT = new DisplayNumberInText(511123);
		objectDNIT.setNumberClasses();
		
		objectDNIT.convertNumberToText(objectDNIT.getNumberThousands());
		assertEquals("eleven", objectDNIT.getObjectNumberToText().parseTens());
	}
	
	@Test
	public final void testNumberParseOnes() {
		DisplayNumberInText objectDNIT = new DisplayNumberInText(521123);
		objectDNIT.setNumberClasses();
		
		objectDNIT.convertNumberToText(objectDNIT.getNumberThousands());
		assertEquals("one", objectDNIT.getObjectNumberToText().parseOnes());
	}
	
	@Test
	public final void testNumberParseOneNumber() {
		DisplayNumberInText objectDNIT = new DisplayNumberInText(521123);
		objectDNIT.setNumberClasses();
		
		objectDNIT.convertNumberToText(objectDNIT.getNumberHundreds());
		assertEquals(objectDNIT.resultInText.get(0), "one hundred twenty three");
	}
	
	
	
	

}
