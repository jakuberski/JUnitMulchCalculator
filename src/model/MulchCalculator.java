package model;

public class MulchCalculator {
	
	private double amountInTons;
	private String color;
	private double areaInFeet;
	
	public MulchCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MulchCalculator(double amountInTons, String color, double areaInFeet) {
		super();
		this.amountInTons = amountInTons;
		this.color = color;
		this.areaInFeet = areaInFeet;
	}

	public double getAmountInTons() {
		return amountInTons;
	}

	public void setAmountInTons(double amountInTons) {
		this.amountInTons = amountInTons;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAreaInFeet() {
		return areaInFeet;
	}

	public void setAreaInFeet(double areaInFeet) {
		this.areaInFeet = areaInFeet;
	}

	
	@Override
	public String toString() {
		return "MulchCalculator [amountInTons=" + amountInTons + "]";
	}

	public double mulchMath(int areaInFeet){
		amountInTons = areaInFeet / 200;
		
		return amountInTons;
		
		
	}
	
	
	
	
	
	

}
