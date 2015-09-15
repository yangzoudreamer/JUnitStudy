package com.JUnit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testAdd(){
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(12, new Calculate().multiply(3, 4));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(10, new Calculate().subtract(20, 10));
	}
	
	@Test
	public void testDiv() {
		assertEquals(2, new Calculate().div(4, 2));
	}
}
