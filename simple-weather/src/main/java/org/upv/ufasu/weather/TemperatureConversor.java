package org.upv.ufasu.weather;

public class TemperatureConversor {

	public static double F2C(double f) {
		return Math.round((f - 32.0) / 1.8);
	}
	
}
