package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
public class TestAnalytics {
	@Mock
	private Analytics a;
	
	@InjectMocks
	private Money m;
	
	@BeforeEach
	public void setup() {
		m = new Money("Peso", 100.00);
	}
	
	@Test
	public void testTotalAmount() {
		
	}
	
	@AfterEach
	public void teardown() {
		m = null;
	}
	

}
