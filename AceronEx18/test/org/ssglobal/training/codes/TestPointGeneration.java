package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPointGeneration {
	private PointGeneration pg;
	
	@BeforeEach
	public void setup() {
		pg = new PointGeneration();
	}
	
	@Test
	public void testPublicMethod() {
		Point expect = new Point(11, 11);
		System.out.println(expect);
		Point actual = pg.publicMethod();  
		Assertions.assertEquals(expect, actual);		
	}
	
	@Test
	public void testPrivateMethod() {
		Point expect = new Point(1, 1);
		Point actual = pg.publicMethod();  
		Assertions.assertEquals(expect, actual);		
	}
	
	//Rainy Methods
	
	@Test
	public void testPublicMethodRainy() {
		Point expect = new Point(0, 0);
		Point actual = pg.publicMethod();  
		Assertions.assertNotEquals(expect, actual);		
	}
	
	@Test
	public void testPrivateMethodRainy() {
		Point expect = new Point(0, 0);
		Point actual = pg.publicMethod();  
		Assertions.assertNotEquals(expect, actual);		
	}
	
	@Test
	public void testPrivateMethodRainy2() {
		Point expect = new Point(3, 3);
		Point actual = pg.publicMethod();  
		Assertions.assertNotEquals(expect, actual);		
	}
	
	
	
	
	
	@AfterEach
	public void teardown() {
		pg = null;
	}
	
	
}
