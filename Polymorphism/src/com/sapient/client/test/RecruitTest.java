package com.sapient.client.test;

import static org.junit.Assert.*;

import com.sapient.client.cui.Employee;
import com.sapient.client.cui.HR;
import com.sapient.client.cui.Intern;
import com.sapient.client.cui.Confirmed;
import com.sapient.client.cui.Contract;


import org.junit.Test;

public class RecruitTest {

	HR hr = new HR();

	@Test
	public final void testIntern() {

		Employee employee = hr.recruit("I"); // Upcast
		assertNotNull("Employee not null", employee);
		assertEquals(true, employee instanceof Intern);
	}
	
	@Test
	public final void testConfirmed(){
		Employee employee = hr.recruit("C"); // Upcast
		assertNotNull("Employee not null", employee);
		assertEquals(true, employee instanceof Confirmed);
	}
	
	@Test
	public final void testContract(){
		Employee employee = hr.recruit("T"); // Upcast
		assertNotNull("Employee not null", employee);
		assertEquals(true, employee instanceof Contract);
	}

}
