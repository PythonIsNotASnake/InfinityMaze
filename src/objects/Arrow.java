package objects;

public class Arrow extends Weapon {

	public Arrow() {
		this.randomizedName();
		this.randomizedDamage();
	}

	@Override
	public void randomizedDamage() {

		int random = (int) (Math.random() * 10 + 1);

		if (this.getName() == "Majestaetischer Bogen") {
			random = random + 5;
		}

		this.setDamage(random);

	}

	@Override
	public void randomizedName() {

		int random = (int) (Math.random() * 6 + 1);

		if (random == 4) {
			this.setName("Majestaetischer Bogen");
		} else {
			this.setName("Alter Bogen");
		}

	}

	public String toString() {
		return "Name der Waffe: " + this.getName() + "\n" + "Angriffspunkte: " + this.getDamage();
	}

}
