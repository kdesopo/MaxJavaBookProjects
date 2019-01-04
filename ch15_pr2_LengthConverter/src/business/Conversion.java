package business;

import java.text.NumberFormat;

public class Conversion {
	private String fromUnit;
	private double fromValue;
	private String toUnit;
	private double toValue;
	private double conversionRatio;
	
	public Conversion() {
		fromUnit = null;
		fromValue = 0.0;
		toUnit = null;
		toValue = 0.0;
		conversionRatio = 0.0;		
	}
	
	public Conversion(String fromUnit, 
			String toUnit, double conversionRatio) {
		this.fromUnit = fromUnit;
		this.fromValue = 0.0;
		this.toUnit = toUnit;
		this.toValue = 0.0;
		this.conversionRatio = conversionRatio;
	}
	
	public Conversion(String fromUnit, double fromValue, 
			String toUnit, double toValue, double conversionRatio) {
		this.fromUnit = fromUnit;
		this.fromValue = fromValue;
		this.toUnit = toUnit;
		this.toValue = toValue;
		this.conversionRatio = conversionRatio;
	}

	public void convert() {
		toValue = fromValue * conversionRatio;
	}
	
	public String getformattedToValue() {
		NumberFormat decimal = NumberFormat.getNumberInstance();
		return decimal.format(toValue);
	}
	public String getFromUnit() {
		return fromUnit;
	}
	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}
	public double getFromValue() {
		return fromValue;
	}
	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}
	public String getToUnit() {
		return toUnit;
	}
	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}
	public double getToValue() {
		return toValue;
	}
	public void setToValue(double toValue) {
		this.toValue = toValue;
	}
	public double getConversionRatio() {
		return conversionRatio;
	}
	public void setConversionRatio(double conversionRatio) {
		this.conversionRatio = conversionRatio;
	}
}
