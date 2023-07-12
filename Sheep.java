package animalfarm;

public class Sheep extends Animals{

	protected int age;
	protected String race;
	protected String gender;
	protected int productionTime = 5;
	
	public Sheep(int age, String race, String gender) {
		this.age = age;
		this.race = race;
		this.gender = gender;
	}

	
	@Override
	protected void obtainProduct() {
		//Sheep can be sheared to produce clothes.
		
		
	}

}
