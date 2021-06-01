package model;

public class Weight {
	private double weightInEarth;
	private double weightInMars;
	
	public Weight(double weightInEarth, double weightInMars) {
		super();
		this.weightInEarth = weightInEarth;
		this.weightInMars = weightInMars;
	}
	
	public Weight() {
		super();
	}

	public double getWeightInEarth() {
		return weightInEarth;
	}
	public void setWeightInEarth(double weightInEarth) {
		this.weightInEarth = weightInEarth;
	}
	public double getWeightInMars() {
		return weightInMars;
	}
	public void setWeightInMars(double weightInMars) {
		this.weightInMars = weightInMars;
	}

	@Override
	public String toString() {
		return "Weight In Earth : " + weightInEarth + " Kg\nWeight In Mars : " + weightInMars +" kg";
	}
	
	
	
}
