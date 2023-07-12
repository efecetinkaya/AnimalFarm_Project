package animalfarm;

public class Goat extends Animals{

	protected int age;
	protected String race;
	protected String gender;
	protected int productionTime = 10;
	
	public Goat(int age, String race, String gender) {
		this.age = age;
		this.race = race;
		this.gender = gender;
	}

	@Override
	protected void obtainProduct() {
		//Goats can be sheared to produce carpets.
		
		
	}

}
