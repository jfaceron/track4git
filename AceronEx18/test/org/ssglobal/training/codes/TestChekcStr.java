package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestChekcStr {
	private ChekcStr check;
	
	@BeforeEach
	public void setup() {
		check = new ChekcStr();
	}
	
		 
	@Test
	public void testTotalEqualsZero() {
		int value = check.total("");
		Assertions.assertEquals(0, value);
	}
	
	@Test
	public void testTotalStrLength1() {
		int value = check.total("A");
		Assertions.assertEquals(65, value);
	}
	
	@Test
	public void testTotalStrLength2() {
		int value = check.total("AA");
		Assertions.assertEquals(130, value);
	}
	
	@Test
	public void testBinariesGivenZero() {
		String result = check.binarise(0);
		Assertions.assertEquals("", result);
	}
	
	@Test
	public void testBinariesGivenOdd() {
		String result = check.binarise(3);
		Assertions.assertEquals("11", result);
	}
	
	@Test
	public void testBinariesGivenEven() {
		String result = check.binarise(4);
		Assertions.assertEquals("100", result);
	}
	
	@Test
	public void testConversion() {
		String result = check.convert("C");
		Assertions.assertEquals("1000011", result);
	}
	
	
	//Rainy Day Cases
	@Test
	public void testConvertEmptyRainy() {
		String result = check.convert(" ");
		Assertions.assertEquals("100000", result);
	}
	
	@Test
	public void testConvertNullRainy() {
		String result = check.convert("");
		Assertions.assertEquals("", result);
	}
	
	@Test
	public void testConvertWhiteSpaceRainy() {
		String result = check.convert("hello world");
		Assertions.assertEquals("10001011100", result);
	}
	
	@Test
	public void testConvertWhiteSpaceRainy2() {
		String result = check.convert("A/tB");
		Assertions.assertEquals("10001100", result);
	}
	
	@Test
	public void testConvertStringNumRainy() {
		String result = check.convert("1234xml");
		Assertions.assertEquals("1000011011", result);
	}
	
	@AfterEach
	public void teardown() {
		check = null;
	}
}
