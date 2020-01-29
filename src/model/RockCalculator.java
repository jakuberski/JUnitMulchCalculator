package model;

public class RockCalculator {

	private double amountInTons;
	private double areaInFeet;

	public RockCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RockCalculator(double amountInTons, String type, double areaInFeet) {
		super();
		this.amountInTons = amountInTons;

		this.areaInFeet = areaInFeet;
	}

	public double getAmountInTons() {
		return amountInTons;
	}

	public void setAmountInTons(double amountInTons) {

		this.amountInTons = amountInTons;
	}

	public double getAreaInFeet() {
		return areaInFeet;
	}

	public void setAreaInFeet(double areaInFeet) {
		this.areaInFeet = areaInFeet;
	}

	@Override
	public String toString() {
		return "RockCalculator [amountInTons=" + amountInTons + "]";
	}

	public double rockMath(int areaInFeet) {

		amountInTons = areaInFeet / 100;

		return amountInTons;

	}

	public boolean canWeHaul() {
		boolean youCarry = false;
		if (amountInTons >= 2) {
			youCarry = true;

		}
		return youCarry;

	}
}
