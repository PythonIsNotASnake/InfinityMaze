package objects;

public class Keule extends Weapon {

	public Keule() {
		this.randomizedName();
		this.randomizedDamage();
	}

	@Override
	public void randomizedDamage() {

		int random = (int) (Math.random() * 10 + 1);

		this.setDamage(random);

	}

	@Override
	public void randomizedName() {

		int random = (int) (Math.random() * 6 + 1);

		if (random == 1 || random == 6) {
			this.setName("Kleine Keule");
		} else if (random == 2 || random == 4) {
			this.setName("Fleisch Keule");
		} else if (random == 3 || random == 5) {
			this.setName("Dicke Keule");
		}

	}

	public String toString() {
		return "Name der Waffe: " + this.getName() + "\n" + "Angriffspunkte: " + this.getDamage();
	}

}
