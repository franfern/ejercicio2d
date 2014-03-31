package org.upv.ufasu.weather;


import junit.framework.TestCase;

public class TestTemperatureConversor extends TestCase {

	public void testParser() throws Exception {
		assertEquals(TemperatureConversor.F2C(1.1), -17.2, 1);
	}
	
}
