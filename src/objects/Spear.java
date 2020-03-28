package objects;

public class Spear extends Weapon {

	public Spear() {
		this.randomizedName();
		this.randomizedDamage();
	}

	@Override
	public void randomizedDamage() {

		int random = (int) (Math.random() * 10 + 1);

		if (this.getName() == "Alter Speer") {
			random = random + 1;
		} else if (this.getName() == "Lanze") {
			random = random + 3;
		} else if (this.getName() == "Goettlicher Speer des Azteken Haeuptlings") {
			random = random + 10;
		}

		this.setDamage(random);

	}

	@Override
	public void randomizedName() {

		int random = (int) (Math.random() * 11 + 1);

		if (random < 6) {
			this.setName("Alter Speer");
		} else if (random > 6) {
			this.setName("Lanze");
		} else if (random == 6) {
			this.setName("Goettlicher Speer des Azteken Haeuptlings");
		}

	}

	public String toString() {
		return "Name der Waffe: " + this.getName() + "\n" + "Angriffspunkte: " + this.getDamage();
	}

}
