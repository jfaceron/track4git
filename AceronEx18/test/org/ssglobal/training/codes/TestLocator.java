package org.ssglobal.training.codes;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestLocator {
	
	
	@Mock
	private LocatorService mockedService;
	
	@InjectMocks
	private Locator loc;
	
	@BeforeEach
	public void setup() {
		loc = new Locator(mockedService);
	}
	
	@Test
	public void testGeoLocate() {
		Point p1 = new Point(10, 10);
		when(mockedService.geoLocate(p1)).thenReturn(p1);
	
		Point result = mockedService.geoLocate(p1);
		Assertions.assertEquals(p1, result);
	}
	
	public void testGeneratePointWithinDist() {
		Point p2 = new Point(5, 5);
		when(mockedService.generatePointWithinDistance(p2, 15)).
			thenReturn(p2);
		
		Point result = mockedService.generatePointWithinDistance(p2, 15);
		Assertions.assertEquals(p2, result);
	}
	
	@AfterEach
	public void teardown() {
		loc = null;
	}
}
