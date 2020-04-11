public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Flyaway");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Vampyric bit");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Burn");
		displayEnergy();
	}
}