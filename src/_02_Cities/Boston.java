package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double x = population *growthRate;
		double y = population*.5;
		double z=x+y;
		return z;
	}

}
