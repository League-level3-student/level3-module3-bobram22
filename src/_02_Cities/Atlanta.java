package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double x = population *growthRate;
		double y = growthRate * 2;
		double z = x*y;
		return z;
	}

}
