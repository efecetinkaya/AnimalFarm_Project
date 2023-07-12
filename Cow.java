package animalfarm;

public class Cow extends Animals{

	protected int age;
	protected String race;
	protected String gender;
	protected int productionTime = 7;
	
	public Cow(int age, String race, String gender) {
		this.age = age;
		this.race = race;
		this.gender = gender;
	}

	@Override
	protected void obtainProduct() {
		//Cows can be milked.
		
		
	}

}
