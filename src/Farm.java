import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow moomoo = new Cow();
		Donkey waffels = new Donkey();
		Lamb baabaa = new Lamb();
		Pig porky = new Pig();
		farm.add(waffels);
		farm.add(porky);
		farm.add(moomoo);
		farm.add(baabaa);
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).nameMeat();
			
		}
	}

}
