package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalcTest {
	
	@Test
	public void testSimpleAddition() {
		RPNCalc rpncalc = new RPNCalc();
		
		double actualResult = rpncalc.evaluate("10 15 +");
		double expectedResult = 25.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpncalc.evaluate("10 115 +");
		expectedResult = 125.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void testSimpleSubstraction() {
		RPNCalc rpncalc = new RPNCalc();
		
		double actualResult = rpncalc.evaluate("10 5 -");
		double expectedResult = 5;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpncalc.evaluate("10 10 -");
		expectedResult = 0.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void testSimpleMultiplication() {
		RPNCalc rpncalc = new RPNCalc();
		
		double actualResult = rpncalc.evaluate("10 5 *");
		double expectedResult = 50;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpncalc.evaluate("10 10 *");
		expectedResult = 100.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void testSimpleDivision() {
		RPNCalc rpncalc = new RPNCalc();
		
		double actualResult = rpncalc.evaluate("10 5 /");
		double expectedResult = 2;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		actualResult = rpncalc.evaluate("10 10 /");
		expectedResult = 1;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
}
