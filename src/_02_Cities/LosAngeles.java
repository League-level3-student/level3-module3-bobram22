package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double x = population *growthRate;
		double y = growthRate * .5;
		double z = x*y;
		return z;
	}
	
}
