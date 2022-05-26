import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private int a, b;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		// Arrange
		a = 4231;
		b = 1234;
		Calculator cal = new Calculator();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
	    
		
	    Calculator cal = new Calculator();
	    
	    // Act	
	    int actual = cal.add(a, b); 
		
	    // Assert
		int expected = 5555;
		assertEquals (expected, actual);
	  }
	
	
	@Test
	public void testSubtract() {
		
				    
		// Act
	    int actual = cal.subtract(a, b); 
				
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	 }
	
	@Test
	public void testMultiply() {
		
				    
		// Act
	    int actual = cal.multiply(a, b); 
				
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		
				    
		// Act
	    int actual = cal.divide(a, b); 
				
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	
}


