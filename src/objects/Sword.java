package objects;

public class Sword extends Weapon {

	public Sword() {
		this.randomizedName();
		this.randomizedDamage();
	}

	@Override
	public void randomizedDamage() {

		int random = (int) (Math.random() * 10 + 1);

		if (this.getName() == "Kurzschwert") {
			random = random + 1;
		} else if (this.getName() == "Langschwert") {
			random = random + 4;
		} else if (this.getName() == "Legendaeres Schwert Schaedelspalter") {
			random = random + 10;
		}

		this.setDamage(random);

	}

	@Override
	public void randomizedName() {

		int random = (int) (Math.random() * 11 + 1);

		if (random < 6) {
			this.setName("Kurzschwert");
		} else if (random > 6) {
			this.setName("Langschwert");
		} else if (random == 6) {
			this.setName("Legendaeres Schwert Schaedelspalter");
		}

	}

	public String toString() {
		return "Name der Waffe: " + this.getName() + "\n" + "Angriffspunkte: " + this.getDamage();
	}

}
