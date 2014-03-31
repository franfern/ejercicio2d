package org.upv.ufasu.weather;


import java.io.InputStream;

import junit.framework.TestCase;

public class TestYahooRssParser extends TestCase {

	public void testParser() throws Exception {
		InputStream valenciaData = getClass().getClassLoader()
				.getResourceAsStream("valencia-weather.xml");
		Weather weather = new YahooParser().parse(valenciaData);
		assertEquals("Valencia", weather.getCity());
		assertEquals("SP", weather.getCountry());
		assertEquals("22.0", weather.getTemp());
		assertEquals("Fair", weather.getCondition());
		assertEquals("72", weather.getChill());
		assertEquals("20", weather.getHumidity());
	}

}
