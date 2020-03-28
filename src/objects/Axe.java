package objects;

public class Axe extends Weapon {

	public Axe() {
		this.randomizedName();
		this.randomizedDamage();
	}

	@Override
	public void randomizedDamage() {

		int random = (int) (Math.random() * 10 + 1);

		if (this.getName() == "Streitkolben") {
			random = random + 3;
		}

		this.setDamage(random);

	}

	@Override
	public void randomizedName() {

		int random = (int) (Math.random() * 6 + 1);

		if (random == 1 || random == 6) {
			this.setName("Wurfaxt");
		} else if (random == 2 || random == 4 || random == 3) {
			this.setName("Kleine Axt");
		} else if (random == 5) {
			this.setName("Streitkolben");
		}

	}

	public String toString() {
		return "Name der Waffe: " + this.getName() + "\n" + "Angriffspunkte: " + this.getDamage();
	}

}
