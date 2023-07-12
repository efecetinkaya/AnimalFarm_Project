package animalfarm;

public class Chicken extends Animals{

	protected int age;
	protected String race;
	protected String gender;
	protected int productionTime = 3;
	
	public Chicken(int age, String race, String gender) {
		this.age = age;
		this.race = race;
		this.gender = gender;
	}

	
	@Override
	protected void obtainProduct() {
		//Chickens' eggs can be collected to eat.
		
		
	}

}

